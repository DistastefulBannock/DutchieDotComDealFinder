package me.bannock.dutchie.scraper.pojos;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class POSMetaDataDTO implements Serializable {

	@SerializedName("activeBatchTags")
	private List<Object> activeBatchTags;

	@SerializedName("canonicalBrandId")
	private String canonicalBrandId;

	@SerializedName("canonicalBrandName")
	private String canonicalBrandName;

	@SerializedName("canonicalCategory")
	private String canonicalCategory;

	@SerializedName("canonicalCategoryId")
	private String canonicalCategoryId;

	@SerializedName("canonicalID")
	private String canonicalID;

	@SerializedName("canonicalPackageId")
	private String canonicalPackageId;

	@SerializedName("canonicalImgUrl")
	private String canonicalImgUrl;

	@SerializedName("canonicalLabResultUrl")
	private Object canonicalLabResultUrl;

	@SerializedName("canonicalName")
	private String canonicalName;

	@SerializedName("canonicalProductTags")
	private List<Object> canonicalProductTags;

	@SerializedName("canonicalSKU")
	private String canonicalSKU;

	@SerializedName("canonicalStrainId")
	private Object canonicalStrainId;

	@SerializedName("canonicalVendorId")
	private String canonicalVendorId;

	@SerializedName("children")
	private List<ChildrenDTO> children;

	@SerializedName("integrationID")
	private String integrationID;

	@SerializedName("__typename")
	private String typename;

	public void setActiveBatchTags(List<Object> activeBatchTags){
		this.activeBatchTags = activeBatchTags;
	}

	public List<Object> getActiveBatchTags(){
		return activeBatchTags;
	}

	public void setCanonicalBrandId(String canonicalBrandId){
		this.canonicalBrandId = canonicalBrandId;
	}

	public String getCanonicalBrandId(){
		return canonicalBrandId;
	}

	public void setCanonicalBrandName(String canonicalBrandName){
		this.canonicalBrandName = canonicalBrandName;
	}

	public String getCanonicalBrandName(){
		return canonicalBrandName;
	}

	public void setCanonicalCategory(String canonicalCategory){
		this.canonicalCategory = canonicalCategory;
	}

	public String getCanonicalCategory(){
		return canonicalCategory;
	}

	public void setCanonicalCategoryId(String canonicalCategoryId){
		this.canonicalCategoryId = canonicalCategoryId;
	}

	public String getCanonicalCategoryId(){
		return canonicalCategoryId;
	}

	public void setCanonicalID(String canonicalID){
		this.canonicalID = canonicalID;
	}

	public String getCanonicalID(){
		return canonicalID;
	}

	public void setCanonicalPackageId(String canonicalPackageId){
		this.canonicalPackageId = canonicalPackageId;
	}

	public String getCanonicalPackageId(){
		return canonicalPackageId;
	}

	public void setCanonicalImgUrl(String canonicalImgUrl){
		this.canonicalImgUrl = canonicalImgUrl;
	}

	public String getCanonicalImgUrl(){
		return canonicalImgUrl;
	}

	public void setCanonicalLabResultUrl(Object canonicalLabResultUrl){
		this.canonicalLabResultUrl = canonicalLabResultUrl;
	}

	public Object getCanonicalLabResultUrl(){
		return canonicalLabResultUrl;
	}

	public void setCanonicalName(String canonicalName){
		this.canonicalName = canonicalName;
	}

	public String getCanonicalName(){
		return canonicalName;
	}

	public void setCanonicalProductTags(List<Object> canonicalProductTags){
		this.canonicalProductTags = canonicalProductTags;
	}

	public List<Object> getCanonicalProductTags(){
		return canonicalProductTags;
	}

	public void setCanonicalSKU(String canonicalSKU){
		this.canonicalSKU = canonicalSKU;
	}

	public String getCanonicalSKU(){
		return canonicalSKU;
	}

	public void setCanonicalStrainId(Object canonicalStrainId){
		this.canonicalStrainId = canonicalStrainId;
	}

	public Object getCanonicalStrainId(){
		return canonicalStrainId;
	}

	public void setCanonicalVendorId(String canonicalVendorId){
		this.canonicalVendorId = canonicalVendorId;
	}

	public String getCanonicalVendorId(){
		return canonicalVendorId;
	}

	public void setChildren(List<ChildrenDTO> children){
		this.children = children;
	}

	public List<ChildrenDTO> getChildren(){
		return children;
	}

	public void setIntegrationID(String integrationID){
		this.integrationID = integrationID;
	}

	public String getIntegrationID(){
		return integrationID;
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
			"POSMetaDataDTO{" + 
			"activeBatchTags = '" + activeBatchTags + '\'' + 
			",canonicalBrandId = '" + canonicalBrandId + '\'' + 
			",canonicalBrandName = '" + canonicalBrandName + '\'' + 
			",canonicalCategory = '" + canonicalCategory + '\'' + 
			",canonicalCategoryId = '" + canonicalCategoryId + '\'' + 
			",canonicalID = '" + canonicalID + '\'' + 
			",canonicalPackageId = '" + canonicalPackageId + '\'' + 
			",canonicalImgUrl = '" + canonicalImgUrl + '\'' + 
			",canonicalLabResultUrl = '" + canonicalLabResultUrl + '\'' + 
			",canonicalName = '" + canonicalName + '\'' + 
			",canonicalProductTags = '" + canonicalProductTags + '\'' + 
			",canonicalSKU = '" + canonicalSKU + '\'' + 
			",canonicalStrainId = '" + canonicalStrainId + '\'' + 
			",canonicalVendorId = '" + canonicalVendorId + '\'' + 
			",children = '" + children + '\'' + 
			",integrationID = '" + integrationID + '\'' + 
			",__typename = '" + typename + '\'' + 
			"}";
		}
}