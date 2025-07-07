package me.bannock.dutchie.scraper.pojos;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class QueryInfoDTO implements Serializable {

	@SerializedName("totalCount")
	private int totalCount;

	@SerializedName("totalPages")
	private int totalPages;

	@SerializedName("__typename")
	private String typename;

	public void setTotalCount(int totalCount){
		this.totalCount = totalCount;
	}

	public int getTotalCount(){
		return totalCount;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
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
			"QueryInfoDTO{" + 
			"totalCount = '" + totalCount + '\'' + 
			",totalPages = '" + totalPages + '\'' + 
			",__typename = '" + typename + '\'' + 
			"}";
		}
}