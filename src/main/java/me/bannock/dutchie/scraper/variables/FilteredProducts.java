
package me.bannock.dutchie.scraper.variables;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

import java.util.concurrent.ThreadLocalRandom;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FilteredProducts {

    public FilteredProducts(String dispensaryId, String... productTypes){
        this.includeEnterpriseSpecials = true;
        this.includeCannabinoids = true;
        this.includeTerpenes = true;
        this.productsFilter = new ProductsFilter(dispensaryId, productTypes);
        this.page = 0L;
        this.perPage = 400 + ThreadLocalRandom.current().nextLong(621);
    }

    @Expose
    private Boolean includeCannabinoids;
    @Expose
    private Boolean includeEnterpriseSpecials;
    @Expose
    private Boolean includeTerpenes;
    @Expose
    private Long page;
    @Expose
    private Long perPage;
    @Expose
    private ProductsFilter productsFilter;

    public Boolean getIncludeCannabinoids() {
        return includeCannabinoids;
    }

    public void setIncludeCannabinoids(Boolean includeCannabinoids) {
        this.includeCannabinoids = includeCannabinoids;
    }

    public Boolean getIncludeEnterpriseSpecials() {
        return includeEnterpriseSpecials;
    }

    public void setIncludeEnterpriseSpecials(Boolean includeEnterpriseSpecials) {
        this.includeEnterpriseSpecials = includeEnterpriseSpecials;
    }

    public Boolean getIncludeTerpenes() {
        return includeTerpenes;
    }

    public void setIncludeTerpenes(Boolean includeTerpenes) {
        this.includeTerpenes = includeTerpenes;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPerPage() {
        return perPage;
    }

    public void setPerPage(Long perPage) {
        this.perPage = perPage;
    }

    public ProductsFilter getProductsFilter() {
        return productsFilter;
    }

    public void setProductsFilter(ProductsFilter productsFilter) {
        this.productsFilter = productsFilter;
    }

}
