package me.bannock.dutchie.scraper.pojos;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class NetWeightDTO implements Serializable {

	@SerializedName("unit")
	private String unit;

	@SerializedName("values")
	private List<Object> values;

	@SerializedName("__typename")
	private String typename;

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setValues(List<Object> values){
		this.values = values;
	}

	public List<Object> getValues(){
		return values;
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
			"NetWeightDTO{" + 
			"unit = '" + unit + '\'' + 
			",values = '" + values + '\'' + 
			",__typename = '" + typename + '\'' + 
			"}";
		}
}