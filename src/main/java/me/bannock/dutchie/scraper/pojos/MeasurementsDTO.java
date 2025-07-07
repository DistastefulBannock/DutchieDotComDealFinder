package me.bannock.dutchie.scraper.pojos;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class MeasurementsDTO implements Serializable {

	@SerializedName("netWeight")
	private NetWeightDTO netWeight;

	@SerializedName("volume")
	private Object volume;

	@SerializedName("__typename")
	private String typename;

	public void setNetWeight(NetWeightDTO netWeight){
		this.netWeight = netWeight;
	}

	public NetWeightDTO getNetWeight(){
		return netWeight;
	}

	public void setVolume(Object volume){
		this.volume = volume;
	}

	public Object getVolume(){
		return volume;
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
			"MeasurementsDTO{" + 
			"netWeight = '" + netWeight + '\'' + 
			",volume = '" + volume + '\'' + 
			",__typename = '" + typename + '\'' + 
			"}";
		}
}