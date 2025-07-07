package me.bannock.dutchie.scraper.pojos;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ProductsDTO implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("AdditionalOptions")
	private List<Object> additionalOptions;

	@SerializedName("duplicatedProductId")
	private Object duplicatedProductId;

	@SerializedName("libraryProductId")
	private Object libraryProductId;

	@SerializedName("libraryProductScore")
	private Object libraryProductScore;

	@SerializedName("brand")
	private BrandDTO brand;

	@SerializedName("brandId")
	private String brandId;

	@SerializedName("brandName")
	private String brandName;

	@SerializedName("CBD")
	private Object cBD;

	@SerializedName("CBDContent")
	private Object cBDContent;

	@SerializedName("certificateOfAnalysisEnabled")
	private boolean certificateOfAnalysisEnabled;

	@SerializedName("comingSoon")
	private Object comingSoon;

	@SerializedName("createdAt")
	private String createdAt;

	@SerializedName("updatedAt")
	private String updatedAt;

	@SerializedName("DispensaryID")
	private String dispensaryID;

	@SerializedName("enterpriseProductId")
	private String enterpriseProductId;

	@SerializedName("Image")
	private String image;

	@SerializedName("images")
	private List<ImagesDTO> images;

	@SerializedName("measurements")
	private MeasurementsDTO measurements;

	@SerializedName("medicalOnly")
	private boolean medicalOnly;

	@SerializedName("medicalPrices")
	private List<Object> medicalPrices;

	@SerializedName("medicalSpecialPrices")
	private List<Object> medicalSpecialPrices;

	@SerializedName("wholesalePrices")
	private Object wholesalePrices;

	@SerializedName("Name")
	private String name;

	@SerializedName("nonArmsLength")
	private Object nonArmsLength;

	@SerializedName("Options")
	private List<String> options;

	@SerializedName("limitsPerCustomer")
	private Object limitsPerCustomer;

	@SerializedName("manualInventory")
	private Object manualInventory;

	@SerializedName("POSMetaData")
	private POSMetaDataDTO pOSMetaData;

	@SerializedName("Prices")
	private List<Object> prices;

	@SerializedName("pricingTierData")
	private Object pricingTierData;

	@SerializedName("specialIdsPerOption")
	private List<SpecialIdsPerOptionDTO> specialIdsPerOption;

	@SerializedName("rawOptions")
	private List<Object> rawOptions;

	@SerializedName("recOnly")
	private boolean recOnly;

	@SerializedName("recPrices")
	private List<Object> recPrices;

	@SerializedName("recSpecialPrices")
	private List<Object> recSpecialPrices;

	@SerializedName("special")
	private Object special;

	@SerializedName("specialData")
	private Object specialData;

	@SerializedName("Status")
	private String status;

	@SerializedName("strainType")
	private String strainType;

	@SerializedName("subcategory")
	private String subcategory;

	@SerializedName("THC")
	private Object tHC;

	@SerializedName("THCContent")
	private Object tHCContent;

	@SerializedName("type")
	private String type;

	@SerializedName("vapeTaxApplicable")
	private Object vapeTaxApplicable;

	@SerializedName("weight")
	private int weight;

	@SerializedName("featured")
	private Object featured;

	@SerializedName("isBelowThreshold")
	private boolean isBelowThreshold;

	@SerializedName("isBelowKioskThreshold")
	private boolean isBelowKioskThreshold;

	@SerializedName("optionsBelowThreshold")
	private List<Object> optionsBelowThreshold;

	@SerializedName("optionsBelowKioskThreshold")
	private List<Object> optionsBelowKioskThreshold;

	@SerializedName("cName")
	private String cName;

	@SerializedName("pastCNames")
	private List<String> pastCNames;

	@SerializedName("brandLogo")
	private String brandLogo;

	@SerializedName("bottleDepositTaxCents")
	private Object bottleDepositTaxCents;

	@SerializedName("useBetterPotencyTaxes")
	private boolean useBetterPotencyTaxes;

	@SerializedName("__typename")
	private String typename;

	@SerializedName("effects")
	private EffectsDTO effects;

	@SerializedName("cannabinoidsV2")
	private Object cannabinoidsV2;

	@SerializedName("provider")
	private String provider;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setAdditionalOptions(List<Object> additionalOptions){
		this.additionalOptions = additionalOptions;
	}

	public List<Object> getAdditionalOptions(){
		return additionalOptions;
	}

	public void setDuplicatedProductId(Object duplicatedProductId){
		this.duplicatedProductId = duplicatedProductId;
	}

	public Object getDuplicatedProductId(){
		return duplicatedProductId;
	}

	public void setLibraryProductId(Object libraryProductId){
		this.libraryProductId = libraryProductId;
	}

	public Object getLibraryProductId(){
		return libraryProductId;
	}

	public void setLibraryProductScore(Object libraryProductScore){
		this.libraryProductScore = libraryProductScore;
	}

	public Object getLibraryProductScore(){
		return libraryProductScore;
	}

	public void setBrand(BrandDTO brand){
		this.brand = brand;
	}

	public BrandDTO getBrand(){
		if (brand == null)
			brand = new BrandDTO();
		return brand;
	}

	public void setBrandId(String brandId){
		this.brandId = brandId;
	}

	public String getBrandId(){
		return brandId;
	}

	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setCBD(Object cBD){
		this.cBD = cBD;
	}

	public Object getCBD(){
		return cBD;
	}

	public void setCBDContent(Object cBDContent){
		this.cBDContent = cBDContent;
	}

	public Object getCBDContent(){
		return cBDContent;
	}

	public void setCertificateOfAnalysisEnabled(boolean certificateOfAnalysisEnabled){
		this.certificateOfAnalysisEnabled = certificateOfAnalysisEnabled;
	}

	public boolean isCertificateOfAnalysisEnabled(){
		return certificateOfAnalysisEnabled;
	}

	public void setComingSoon(Object comingSoon){
		this.comingSoon = comingSoon;
	}

	public Object getComingSoon(){
		return comingSoon;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setDispensaryID(String dispensaryID){
		this.dispensaryID = dispensaryID;
	}

	public String getDispensaryID(){
		return dispensaryID;
	}

	public void setEnterpriseProductId(String enterpriseProductId){
		this.enterpriseProductId = enterpriseProductId;
	}

	public String getEnterpriseProductId(){
		return enterpriseProductId;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setImages(List<ImagesDTO> images){
		this.images = images;
	}

	public List<ImagesDTO> getImages(){
		return images;
	}

	public void setMeasurements(MeasurementsDTO measurements){
		this.measurements = measurements;
	}

	public MeasurementsDTO getMeasurements(){
		return measurements;
	}

	public void setMedicalOnly(boolean medicalOnly){
		this.medicalOnly = medicalOnly;
	}

	public boolean isMedicalOnly(){
		return medicalOnly;
	}

	public void setMedicalPrices(List<Object> medicalPrices){
		this.medicalPrices = medicalPrices;
	}

	public List<Object> getMedicalPrices(){
		return medicalPrices;
	}

	public void setMedicalSpecialPrices(List<Object> medicalSpecialPrices){
		this.medicalSpecialPrices = medicalSpecialPrices;
	}

	public List<Object> getMedicalSpecialPrices(){
		return medicalSpecialPrices;
	}

	public void setWholesalePrices(Object wholesalePrices){
		this.wholesalePrices = wholesalePrices;
	}

	public Object getWholesalePrices(){
		return wholesalePrices;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setNonArmsLength(Object nonArmsLength){
		this.nonArmsLength = nonArmsLength;
	}

	public Object getNonArmsLength(){
		return nonArmsLength;
	}

	public void setOptions(List<String> options){
		this.options = options;
	}

	public List<String> getOptions(){
		return options;
	}

	public void setLimitsPerCustomer(Object limitsPerCustomer){
		this.limitsPerCustomer = limitsPerCustomer;
	}

	public Object getLimitsPerCustomer(){
		return limitsPerCustomer;
	}

	public void setManualInventory(Object manualInventory){
		this.manualInventory = manualInventory;
	}

	public Object getManualInventory(){
		return manualInventory;
	}

	public void setPOSMetaData(POSMetaDataDTO pOSMetaData){
		this.pOSMetaData = pOSMetaData;
	}

	public POSMetaDataDTO getPOSMetaData(){
		return pOSMetaData;
	}

	public void setPrices(List<Object> prices){
		this.prices = prices;
	}

	public List<Object> getPrices(){
		return prices;
	}

	public void setPricingTierData(Object pricingTierData){
		this.pricingTierData = pricingTierData;
	}

	public Object getPricingTierData(){
		return pricingTierData;
	}

	public void setSpecialIdsPerOption(List<SpecialIdsPerOptionDTO> specialIdsPerOption){
		this.specialIdsPerOption = specialIdsPerOption;
	}

	public List<SpecialIdsPerOptionDTO> getSpecialIdsPerOption(){
		return specialIdsPerOption;
	}

	public void setRawOptions(List<Object> rawOptions){
		this.rawOptions = rawOptions;
	}

	public List<Object> getRawOptions(){
		return rawOptions;
	}

	public void setRecOnly(boolean recOnly){
		this.recOnly = recOnly;
	}

	public boolean isRecOnly(){
		return recOnly;
	}

	public void setRecPrices(List<Object> recPrices){
		this.recPrices = recPrices;
	}

	public List<Object> getRecPrices(){
		return recPrices;
	}

	public void setRecSpecialPrices(List<Object> recSpecialPrices){
		this.recSpecialPrices = recSpecialPrices;
	}

	public List<Object> getRecSpecialPrices(){
		return recSpecialPrices;
	}

	public void setSpecial(Object special){
		this.special = special;
	}

	public Object getSpecial(){
		return special;
	}

	public void setSpecialData(Object specialData){
		this.specialData = specialData;
	}

	public Object getSpecialData(){
		return specialData;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setStrainType(String strainType){
		this.strainType = strainType;
	}

	public String getStrainType(){
		return strainType;
	}

	public void setSubcategory(String subcategory){
		this.subcategory = subcategory;
	}

	public String getSubcategory(){
		return subcategory;
	}

	public void setTHC(Object tHC){
		this.tHC = tHC;
	}

	public Object getTHC(){
		return tHC;
	}

	public void setTHCContent(Object tHCContent){
		this.tHCContent = tHCContent;
	}

	public Object getTHCContent(){
		return tHCContent;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setVapeTaxApplicable(Object vapeTaxApplicable){
		this.vapeTaxApplicable = vapeTaxApplicable;
	}

	public Object getVapeTaxApplicable(){
		return vapeTaxApplicable;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public int getWeight(){
		return weight;
	}

	public void setFeatured(Object featured){
		this.featured = featured;
	}

	public Object getFeatured(){
		return featured;
	}

	public void setIsBelowThreshold(boolean isBelowThreshold){
		this.isBelowThreshold = isBelowThreshold;
	}

	public boolean isIsBelowThreshold(){
		return isBelowThreshold;
	}

	public void setIsBelowKioskThreshold(boolean isBelowKioskThreshold){
		this.isBelowKioskThreshold = isBelowKioskThreshold;
	}

	public boolean isIsBelowKioskThreshold(){
		return isBelowKioskThreshold;
	}

	public void setOptionsBelowThreshold(List<Object> optionsBelowThreshold){
		this.optionsBelowThreshold = optionsBelowThreshold;
	}

	public List<Object> getOptionsBelowThreshold(){
		return optionsBelowThreshold;
	}

	public void setOptionsBelowKioskThreshold(List<Object> optionsBelowKioskThreshold){
		this.optionsBelowKioskThreshold = optionsBelowKioskThreshold;
	}

	public List<Object> getOptionsBelowKioskThreshold(){
		return optionsBelowKioskThreshold;
	}

	public void setCName(String cName){
		this.cName = cName;
	}

	public String getCName(){
		return cName;
	}

	public void setPastCNames(List<String> pastCNames){
		this.pastCNames = pastCNames;
	}

	public List<String> getPastCNames(){
		return pastCNames;
	}

	public void setBrandLogo(String brandLogo){
		this.brandLogo = brandLogo;
	}

	public String getBrandLogo(){
		return brandLogo;
	}

	public void setBottleDepositTaxCents(Object bottleDepositTaxCents){
		this.bottleDepositTaxCents = bottleDepositTaxCents;
	}

	public Object getBottleDepositTaxCents(){
		return bottleDepositTaxCents;
	}

	public void setUseBetterPotencyTaxes(boolean useBetterPotencyTaxes){
		this.useBetterPotencyTaxes = useBetterPotencyTaxes;
	}

	public boolean isUseBetterPotencyTaxes(){
		return useBetterPotencyTaxes;
	}

	public void setTypename(String typename){
		this.typename = typename;
	}

	public String getTypename(){
		return typename;
	}

	public void setEffects(EffectsDTO effects){
		this.effects = effects;
	}

	public EffectsDTO getEffects(){
		return effects;
	}

	public void setCannabinoidsV2(Object cannabinoidsV2){
		this.cannabinoidsV2 = cannabinoidsV2;
	}

	public Object getCannabinoidsV2(){
		return cannabinoidsV2;
	}

	public void setProvider(String provider){
		this.provider = provider;
	}

	public String getProvider(){
		return provider;
	}

	@Override
 	public String toString(){
		return 
			"ProductsDTO{" + 
			"_id = '" + id + '\'' + 
			",id = '" + id + '\'' + 
			",additionalOptions = '" + additionalOptions + '\'' + 
			",duplicatedProductId = '" + duplicatedProductId + '\'' + 
			",libraryProductId = '" + libraryProductId + '\'' + 
			",libraryProductScore = '" + libraryProductScore + '\'' + 
			",brand = '" + brand + '\'' + 
			",brandId = '" + brandId + '\'' + 
			",brandName = '" + brandName + '\'' + 
			",cBD = '" + cBD + '\'' + 
			",cBDContent = '" + cBDContent + '\'' + 
			",certificateOfAnalysisEnabled = '" + certificateOfAnalysisEnabled + '\'' + 
			",comingSoon = '" + comingSoon + '\'' + 
			",createdAt = '" + createdAt + '\'' + 
			",updatedAt = '" + updatedAt + '\'' + 
			",dispensaryID = '" + dispensaryID + '\'' + 
			",enterpriseProductId = '" + enterpriseProductId + '\'' + 
			",image = '" + image + '\'' + 
			",images = '" + images + '\'' + 
			",measurements = '" + measurements + '\'' + 
			",medicalOnly = '" + medicalOnly + '\'' + 
			",medicalPrices = '" + medicalPrices + '\'' + 
			",medicalSpecialPrices = '" + medicalSpecialPrices + '\'' + 
			",wholesalePrices = '" + wholesalePrices + '\'' + 
			",name = '" + name + '\'' + 
			",nonArmsLength = '" + nonArmsLength + '\'' + 
			",options = '" + options + '\'' + 
			",limitsPerCustomer = '" + limitsPerCustomer + '\'' + 
			",manualInventory = '" + manualInventory + '\'' + 
			",pOSMetaData = '" + pOSMetaData + '\'' + 
			",prices = '" + prices + '\'' + 
			",pricingTierData = '" + pricingTierData + '\'' + 
			",specialIdsPerOption = '" + specialIdsPerOption + '\'' + 
			",rawOptions = '" + rawOptions + '\'' + 
			",recOnly = '" + recOnly + '\'' + 
			",recPrices = '" + recPrices + '\'' + 
			",recSpecialPrices = '" + recSpecialPrices + '\'' + 
			",special = '" + special + '\'' + 
			",specialData = '" + specialData + '\'' + 
			",status = '" + status + '\'' + 
			",strainType = '" + strainType + '\'' + 
			",subcategory = '" + subcategory + '\'' + 
			",tHC = '" + tHC + '\'' + 
			",tHCContent = '" + tHCContent + '\'' + 
			",type = '" + type + '\'' + 
			",vapeTaxApplicable = '" + vapeTaxApplicable + '\'' + 
			",weight = '" + weight + '\'' + 
			",featured = '" + featured + '\'' + 
			",isBelowThreshold = '" + isBelowThreshold + '\'' + 
			",isBelowKioskThreshold = '" + isBelowKioskThreshold + '\'' + 
			",optionsBelowThreshold = '" + optionsBelowThreshold + '\'' + 
			",optionsBelowKioskThreshold = '" + optionsBelowKioskThreshold + '\'' + 
			",cName = '" + cName + '\'' + 
			",pastCNames = '" + pastCNames + '\'' + 
			",brandLogo = '" + brandLogo + '\'' + 
			",bottleDepositTaxCents = '" + bottleDepositTaxCents + '\'' + 
			",useBetterPotencyTaxes = '" + useBetterPotencyTaxes + '\'' + 
			",__typename = '" + typename + '\'' + 
			",effects = '" + effects + '\'' + 
			",cannabinoidsV2 = '" + cannabinoidsV2 + '\'' + 
			",provider = '" + provider + '\'' + 
			"}";
		}
}