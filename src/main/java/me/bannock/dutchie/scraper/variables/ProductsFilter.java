
package me.bannock.dutchie.scraper.variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ProductsFilter {

    public ProductsFilter(String dispensaryId, String... productTypes){
        this.productIds = new ArrayList<>();
        this.dispensaryId = dispensaryId;
        this.strainTypes = new ArrayList<>();
        this.subcategories = new ArrayList<>();
        this.status = "All";
        this.types = new ArrayList<>(Arrays.asList(productTypes));
        this.useCache = false;
        this.isDefaultSort = true;
        this.sortBy = "price";
        this.sortDirection = 1L;

        boolean showHiddenItems = false;
        this.bypassOnlineThresholds = showHiddenItems;
        this.isKioskMenu = showHiddenItems;
        this.removeProductsBelowOptionThresholds = !showHiddenItems;
    }

    @Expose
    private Boolean bypassOnlineThresholds;
    @Expose
    private String dispensaryId;
    @Expose
    private Boolean isDefaultSort;
    @Expose
    private Boolean isKioskMenu;
    @Expose
    private String pricingType;
    @Expose
    private List<Object> productIds;
    @Expose
    private Boolean removeProductsBelowOptionThresholds;
    @Expose
    private String sortBy;
    @Expose
    private Long sortDirection;
    @SerializedName("Status")
    private String status;
    @Expose
    private List<Object> strainTypes;
    @Expose
    private List<Object> subcategories;
    @Expose
    private List<String> types;
    @Expose
    private Boolean useCache;

    public Boolean getBypassOnlineThresholds() {
        return bypassOnlineThresholds;
    }

    public void setBypassOnlineThresholds(Boolean bypassOnlineThresholds) {
        this.bypassOnlineThresholds = bypassOnlineThresholds;
    }

    public String getDispensaryId() {
        return dispensaryId;
    }

    public void setDispensaryId(String dispensaryId) {
        this.dispensaryId = dispensaryId;
    }

    public Boolean getIsDefaultSort() {
        return isDefaultSort;
    }

    public void setIsDefaultSort(Boolean isDefaultSort) {
        this.isDefaultSort = isDefaultSort;
    }

    public Boolean getIsKioskMenu() {
        return isKioskMenu;
    }

    public void setIsKioskMenu(Boolean isKioskMenu) {
        this.isKioskMenu = isKioskMenu;
    }

    public String getPricingType() {
        return pricingType;
    }

    public void setPricingType(String pricingType) {
        this.pricingType = pricingType;
    }

    public List<Object> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Object> productIds) {
        this.productIds = productIds;
    }

    public Boolean getRemoveProductsBelowOptionThresholds() {
        return removeProductsBelowOptionThresholds;
    }

    public void setRemoveProductsBelowOptionThresholds(Boolean removeProductsBelowOptionThresholds) {
        this.removeProductsBelowOptionThresholds = removeProductsBelowOptionThresholds;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public Long getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(Long sortDirection) {
        this.sortDirection = sortDirection;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Object> getStrainTypes() {
        return strainTypes;
    }

    public void setStrainTypes(List<Object> strainTypes) {
        this.strainTypes = strainTypes;
    }

    public List<Object> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Object> subcategories) {
        this.subcategories = subcategories;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Boolean getUseCache() {
        return useCache;
    }

    public void setUseCache(Boolean useCache) {
        this.useCache = useCache;
    }

}
