package me.bannock.dutchie.scraper.pojos;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DataDTO implements Serializable {

	@SerializedName("filteredProducts")
	private FilteredProductsDTO filteredProducts;

	public void setFilteredProducts(FilteredProductsDTO filteredProducts){
		this.filteredProducts = filteredProducts;
	}

	public FilteredProductsDTO getFilteredProducts(){
		return filteredProducts;
	}

	@Override
 	public String toString(){
		return 
			"DataDTO{" + 
			"filteredProducts = '" + filteredProducts + '\'' + 
			"}";
		}
}