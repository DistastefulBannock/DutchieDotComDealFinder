package me.bannock.dutchie.scraper.pojos;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class BrandDTO implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("name")
	private String name;

	@SerializedName("parentBrandId")
	private String parentBrandId;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("__typename")
	private String typename;

	@SerializedName("description")
	private String description;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setParentBrandId(String parentBrandId){
		this.parentBrandId = parentBrandId;
	}

	public String getParentBrandId(){
		return parentBrandId;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setTypename(String typename){
		this.typename = typename;
	}

	public String getTypename(){
		return typename;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	@Override
 	public String toString(){
		return 
			"BrandDTO{" + 
			"id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			",parentBrandId = '" + parentBrandId + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",__typename = '" + typename + '\'' + 
			",_id = '" + id + '\'' + 
			",description = '" + description + '\'' + 
			"}";
		}
}