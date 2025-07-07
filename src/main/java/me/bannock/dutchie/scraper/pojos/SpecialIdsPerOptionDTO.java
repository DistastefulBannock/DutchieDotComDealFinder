package me.bannock.dutchie.scraper.pojos;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class SpecialIdsPerOptionDTO implements Serializable {

	@SerializedName("option")
	private String option;

	@SerializedName("conditionIds")
	private List<Object> conditionIds;

	@SerializedName("rewardIds")
	private List<Object> rewardIds;

	@SerializedName("__typename")
	private String typename;

	public void setOption(String option){
		this.option = option;
	}

	public String getOption(){
		return option;
	}

	public void setConditionIds(List<Object> conditionIds){
		this.conditionIds = conditionIds;
	}

	public List<Object> getConditionIds(){
		return conditionIds;
	}

	public void setRewardIds(List<Object> rewardIds){
		this.rewardIds = rewardIds;
	}

	public List<Object> getRewardIds(){
		return rewardIds;
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
			"SpecialIdsPerOptionDTO{" + 
			"option = '" + option + '\'' + 
			",conditionIds = '" + conditionIds + '\'' + 
			",rewardIds = '" + rewardIds + '\'' + 
			",__typename = '" + typename + '\'' + 
			"}";
		}
}