package me.bannock.dutchie.scraper.pojos;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesDTO implements Serializable {

	@SerializedName("url")
	private String url;

	@SerializedName("description")
	private Object description;

	@SerializedName("active")
	private boolean active;

	@SerializedName("__typename")
	private String typename;

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean isActive(){
		return active;
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
			"ImagesDTO{" + 
			"url = '" + url + '\'' + 
			",description = '" + description + '\'' + 
			",active = '" + active + '\'' + 
			",__typename = '" + typename + '\'' + 
			"}";
		}
}