package me.bannock.dutchie.scraper;

import com.google.gson.Gson;
import me.bannock.dutchie.scraper.pojos.ProductsDTO;
import me.bannock.dutchie.scraper.pojos.ResponseDTO;
import me.bannock.dutchie.scraper.variables.FilteredProducts;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Testing {

    public static void main(String[] args) throws IOException {
        List<ProductsDTO> products = new ArrayList<>();
        // TODO: Run Graphql call to automatically get product types
        // These are the product types you are searching for. Only include the ones you want to search for
        String[] productTypes = new String[]{
//                "Edible", "Flower", "Pre-Rolls",
//                "Vaporizers", "CBD", "Topicals",
//                "Accessories", "Tincture"
//                "Flower"
                "Concentrate"
        };

        Map<String, String> dispensaryIdsToNames = getDispensaries();
        String[] dispensaryIds = new String[dispensaryIdsToNames.size()];
        {
            int index = 0;
            for (String id : dispensaryIdsToNames.keySet()){
                dispensaryIds[index++] = id;
            }
        }

        for (String dispensaryId : dispensaryIds){
            FilteredProducts filteredProducts = new FilteredProducts(dispensaryId, productTypes);
            for (ResponseDTO responseDTO : getFilteredProductsAllPages(filteredProducts)){
                products.addAll(responseDTO.getData().getFilteredProducts().getProducts());
            }
        }
        products = products.stream().sorted(Comparator.comparingDouble(product -> {
            double mgPerDollar = -1;
            try{
                double weight = (Double) product.getMeasurements().getNetWeight().getValues().get(0);
                if (!product.getMeasurements().getNetWeight().getUnit().equals("MILLIGRAMS"))
                    System.out.println("What is " + product.getMeasurements().getNetWeight().getUnit());
                mgPerDollar = weight / (Double)product.getMedicalPrices().get(0);
            }catch (IndexOutOfBoundsException e){
                // How?
            }
            return mgPerDollar;
        })).toList();
        products = new ArrayList<>(products);
        Collections.reverse(products);
        int index = 0;
        int topResultsShown = 50;
        for (ProductsDTO product : products){
            double mgPerDollar;
            double weight = (Double) product.getMeasurements().getNetWeight().getValues().get(0);
            double price;
            try{
                price = (double)product.getMedicalPrices().get(0);
                mgPerDollar = weight / price;
            }catch (IndexOutOfBoundsException e){
                continue;
            }
            System.out.printf("%smg/dollar; $%s: %s %s- \"%s\"; %s @ %s%n", mgPerDollar, price, product.getBrand().getName(),
                    product.getName(), product.getId(), product.getStatus(),
                    dispensaryIdsToNames.get(product.getDispensaryID()));
            if (++index >= topResultsShown)
                break;
        }
    }

    private static @NotNull Map<String, String> getDispensaries() {
        Map<String, String> dispensaryIdsToNames = new HashMap<>();
        // TODO: To use this program, you must get the dispensary id for every store you'd like to get a product catalog from
        // To do this, open dutchie.com as well as the network tab in your browser's development tools(inspect)
        // Then, locate and open the menu for each dispensary you want to add to your search.
        // In the network tab, locate a request to the following URL: /api-0/graphql?operationName=FilteredProducts&variables=...
        // Copy everything after &variables= and put it in the following website: https://meyerweb.com/eric/tools/dencoder/
        // This will give you a JSON object that contains a "dispensaryId" field. The value for this field is the dispensary id
        //  you need to put in the dispensaryIdsToNames map
        // dispensaryIdsToNames.put("[ID FROM REQUEST]",
        //      "Friendly name; what is shown in console. I recommend the name of the dispensary and the town it's in");
        return dispensaryIdsToNames;
    }

    private static List<ResponseDTO> getFilteredProductsAllPages(FilteredProducts filteredProducts) throws IOException{
        List<ResponseDTO> responses = new ArrayList<>();

        OkHttpClient client = new OkHttpClient();
        Map<String, String> headers = getHeaders();

        while (true) {
            String variables = URLEncoder.encode(new Gson().toJson(filteredProducts), StandardCharsets.UTF_8);
            // This is a sha256 hash of the full operation string. If the operation is updated, this may change.
            // 03/06/2025 https://www.apollographql.com/docs/react/api/link/persisted-queries archive.today
            String persistedQueryHash = "893055c1bd8d145075b8460e26869a15e6bff4c096a6f0d2d7708128689d9216"; //
            Request request = new Request.Builder()
                    .url("https://dutchie.com/api-4/graphql?operationName=FilteredProducts&variables=" + variables +
                            "&extensions=%7B%22persistedQuery%22%3A%7B%22version%22%3A1%2C%22sha256Hash%22%3A%22" +
                            persistedQueryHash + "%22%7D%7D")
                    .headers(Headers.of(headers))
                    .build();

            try (Response response = client.newCall(request).execute()) {
                Gson gson = new Gson();
                ResponseDTO responseDTO = gson.fromJson(response.body().string(), ResponseDTO.class);
                responses.add(responseDTO);
                if (filteredProducts.getPage() >=
                        responseDTO.getData().getFilteredProducts().getQueryInfo().getTotalPages() - 1)
                    break;
                filteredProducts.setPage(filteredProducts.getPage() + 1);
            }
        }
        return responses;
    }

    private static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Host", "dutchie.com");
        headers.put("Sec-Ch-Ua-Platform", "\"Windows\"");
        byte[] fakeSessionBytes = new byte[92];
        new Random().nextBytes(fakeSessionBytes);
        headers.put("X-Dutchie-Session", URLEncoder.encode(new String(fakeSessionBytes), StandardCharsets.UTF_8));
        headers.put("Accept-Language", "en-US,en;q=0.9");
        headers.put("Sec-Ch-Ua", "\"Chromium\";v=\"133\", \"Not(A:Brand\";v=\"99\"");
        headers.put("Sec-Ch-Ua-Mobile", "?0");
        headers.put("Url", "https://dutchie.com/dispensary/coastal-healing/products/concentrates");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:134.0) Gecko/20100101 Firefox/134.0");
        headers.put("Accept", "*/*");
        headers.put("Content-Type", "application/json; charset=utf-8");
        headers.put("Apollographql-Client-Name", "Marketplace (production)");
        headers.put("Sec-Fetch-Site", "same-origin");
        headers.put("Sec-Fetch-Mode", "cors");
        headers.put("Sec-Fetch-Dest", "empty");
        headers.put("Referer", "https://dutchie.com/dispensary/coastal-healing/products/concentrates");
        // okhttp doesn't decode gzip it if we add the header manually apparently
        //headers.put("Accept-Encoding", "gzip, deflate, br");
        headers.put("Priority", "u=1, i");
        return headers;
    }

}
