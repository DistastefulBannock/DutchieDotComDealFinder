package me.bannock.dutchie.scraper.pojos;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class FilteredProductsDTO implements Serializable {

	@SerializedName("products")
	private List<ProductsDTO> products;

	@SerializedName("queryInfo")
	private QueryInfoDTO queryInfo;

	@SerializedName("__typename")
	private String typename;

	public void setProducts(List<ProductsDTO> products){
		this.products = products;
	}

	public List<ProductsDTO> getProducts(){
		return products;
	}

	public void setQueryInfo(QueryInfoDTO queryInfo){
		this.queryInfo = queryInfo;
	}

	public QueryInfoDTO getQueryInfo(){
		return queryInfo;
	}

	public void setTypename(String typename){
		this.typename = typename;
	}

	public String getTypename(){
		return typename;
	}

	@Override
 	public String toString(){
		return 
			"FilteredProductsDTO{" + 
			"products = '" + products + '\'' + 
			",queryInfo = '" + queryInfo + '\'' + 
			",__typename = '" + typename + '\'' + 
			"}";
		}
}