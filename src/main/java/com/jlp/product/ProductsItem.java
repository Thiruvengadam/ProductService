package com.jlp.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductsItem{
	private List<Object> additionalServices;
	private boolean isBundle;
	private boolean compare;
	private List<Object> promotionalFeatures;
	private DynamicAttributes dynamicAttributes;
	private String code;
	private boolean categoryQuickViewEnabled;
	private String defaultSkuId;
	private String colorWheelMessage;
	private String displaySpecialOffer;
	private String type;
	private String title;
	private List<Object> features;
	private int reviews;
	@JsonProperty("price")
	private Price price;
	private String swatchCategoryType;
	private double averageRating;
	private String directorate;
	private boolean outOfStock;
	private boolean isProductSet;
	private String brand;
	private String availabilityMessage;
	private String image;
	private boolean isMadeToMeasure;
	private int colorSwatchSelected;
	private int releaseDateTimestamp;
	private PromoMessages promoMessages;
	private String productId;
	private boolean swatchAvailable;
	private boolean isInStoreOnly;
	private boolean emailMeWhenAvailable;
	private List<ColorSwatchesItem> colorSwatches;
	private String fabric;
	private int ageRestriction;
	private String nonPromoMessage;

	public void setAdditionalServices(List<Object> additionalServices){
		this.additionalServices = additionalServices;
	}

	public List<Object> getAdditionalServices(){
		return additionalServices;
	}

	public void setIsBundle(boolean isBundle){
		this.isBundle = isBundle;
	}

	public boolean isIsBundle(){
		return isBundle;
	}

	public void setCompare(boolean compare){
		this.compare = compare;
	}

	public boolean isCompare(){
		return compare;
	}

	public void setPromotionalFeatures(List<Object> promotionalFeatures){
		this.promotionalFeatures = promotionalFeatures;
	}

	public List<Object> getPromotionalFeatures(){
		return promotionalFeatures;
	}

	public void setDynamicAttributes(DynamicAttributes dynamicAttributes){
		this.dynamicAttributes = dynamicAttributes;
	}

	public DynamicAttributes getDynamicAttributes(){
		return dynamicAttributes;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setCategoryQuickViewEnabled(boolean categoryQuickViewEnabled){
		this.categoryQuickViewEnabled = categoryQuickViewEnabled;
	}

	public boolean isCategoryQuickViewEnabled(){
		return categoryQuickViewEnabled;
	}

	public void setDefaultSkuId(String defaultSkuId){
		this.defaultSkuId = defaultSkuId;
	}

	public String getDefaultSkuId(){
		return defaultSkuId;
	}

	public void setColorWheelMessage(String colorWheelMessage){
		this.colorWheelMessage = colorWheelMessage;
	}

	public String getColorWheelMessage(){
		return colorWheelMessage;
	}

	public void setDisplaySpecialOffer(String displaySpecialOffer){
		this.displaySpecialOffer = displaySpecialOffer;
	}

	public String getDisplaySpecialOffer(){
		return displaySpecialOffer;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setFeatures(List<Object> features){
		this.features = features;
	}

	public List<Object> getFeatures(){
		return features;
	}

	public void setReviews(int reviews){
		this.reviews = reviews;
	}

	public int getReviews(){
		return reviews;
	}

	public void setPrice(Price price){
		this.price = price;
	}

	public Price getPrice(){
		return price;
	}

	public void setSwatchCategoryType(String swatchCategoryType){
		this.swatchCategoryType = swatchCategoryType;
	}

	public String getSwatchCategoryType(){
		return swatchCategoryType;
	}

	public void setAverageRating(double averageRating){
		this.averageRating = averageRating;
	}

	public double getAverageRating(){
		return averageRating;
	}

	public void setDirectorate(String directorate){
		this.directorate = directorate;
	}

	public String getDirectorate(){
		return directorate;
	}

	public void setOutOfStock(boolean outOfStock){
		this.outOfStock = outOfStock;
	}

	public boolean isOutOfStock(){
		return outOfStock;
	}

	public void setIsProductSet(boolean isProductSet){
		this.isProductSet = isProductSet;
	}

	public boolean isIsProductSet(){
		return isProductSet;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	public void setAvailabilityMessage(String availabilityMessage){
		this.availabilityMessage = availabilityMessage;
	}

	public String getAvailabilityMessage(){
		return availabilityMessage;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setIsMadeToMeasure(boolean isMadeToMeasure){
		this.isMadeToMeasure = isMadeToMeasure;
	}

	public boolean isIsMadeToMeasure(){
		return isMadeToMeasure;
	}

	public void setColorSwatchSelected(int colorSwatchSelected){
		this.colorSwatchSelected = colorSwatchSelected;
	}

	public int getColorSwatchSelected(){
		return colorSwatchSelected;
	}

	public void setReleaseDateTimestamp(int releaseDateTimestamp){
		this.releaseDateTimestamp = releaseDateTimestamp;
	}

	public int getReleaseDateTimestamp(){
		return releaseDateTimestamp;
	}

	public void setPromoMessages(PromoMessages promoMessages){
		this.promoMessages = promoMessages;
	}

	public PromoMessages getPromoMessages(){
		return promoMessages;
	}

	public void setProductId(String productId){
		this.productId = productId;
	}

	public String getProductId(){
		return productId;
	}

	public void setSwatchAvailable(boolean swatchAvailable){
		this.swatchAvailable = swatchAvailable;
	}

	public boolean isSwatchAvailable(){
		return swatchAvailable;
	}

	public void setIsInStoreOnly(boolean isInStoreOnly){
		this.isInStoreOnly = isInStoreOnly;
	}

	public boolean isIsInStoreOnly(){
		return isInStoreOnly;
	}

	public void setEmailMeWhenAvailable(boolean emailMeWhenAvailable){
		this.emailMeWhenAvailable = emailMeWhenAvailable;
	}

	public boolean isEmailMeWhenAvailable(){
		return emailMeWhenAvailable;
	}

	public void setColorSwatches(List<ColorSwatchesItem> colorSwatches){
		this.colorSwatches = colorSwatches;
	}

	public List<ColorSwatchesItem> getColorSwatches(){
		return colorSwatches;
	}

	public void setFabric(String fabric){
		this.fabric = fabric;
	}

	public String getFabric(){
		return fabric;
	}

	public void setAgeRestriction(int ageRestriction){
		this.ageRestriction = ageRestriction;
	}

	public int getAgeRestriction(){
		return ageRestriction;
	}

	public void setNonPromoMessage(String nonPromoMessage){
		this.nonPromoMessage = nonPromoMessage;
	}

	public String getNonPromoMessage(){
		return nonPromoMessage;
	}

	@Override
 	public String toString(){
		return 
			"ProductsItem{" + 
			"additionalServices = '" + additionalServices + '\'' + 
			",isBundle = '" + isBundle + '\'' + 
			",compare = '" + compare + '\'' + 
			",promotionalFeatures = '" + promotionalFeatures + '\'' + 
			",dynamicAttributes = '" + dynamicAttributes + '\'' + 
			",code = '" + code + '\'' + 
			",categoryQuickViewEnabled = '" + categoryQuickViewEnabled + '\'' + 
			",defaultSkuId = '" + defaultSkuId + '\'' + 
			",colorWheelMessage = '" + colorWheelMessage + '\'' + 
			",displaySpecialOffer = '" + displaySpecialOffer + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",features = '" + features + '\'' + 
			",reviews = '" + reviews + '\'' + 
			",price = '" + price + '\'' + 
			",swatchCategoryType = '" + swatchCategoryType + '\'' + 
			",averageRating = '" + averageRating + '\'' + 
			",directorate = '" + directorate + '\'' + 
			",outOfStock = '" + outOfStock + '\'' + 
			",isProductSet = '" + isProductSet + '\'' + 
			",brand = '" + brand + '\'' + 
			",availabilityMessage = '" + availabilityMessage + '\'' + 
			",image = '" + image + '\'' + 
			",isMadeToMeasure = '" + isMadeToMeasure + '\'' + 
			",colorSwatchSelected = '" + colorSwatchSelected + '\'' + 
			",releaseDateTimestamp = '" + releaseDateTimestamp + '\'' + 
			",promoMessages = '" + promoMessages + '\'' + 
			",productId = '" + productId + '\'' + 
			",swatchAvailable = '" + swatchAvailable + '\'' + 
			",isInStoreOnly = '" + isInStoreOnly + '\'' + 
			",emailMeWhenAvailable = '" + emailMeWhenAvailable + '\'' + 
			",colorSwatches = '" + colorSwatches + '\'' + 
			",fabric = '" + fabric + '\'' + 
			",ageRestriction = '" + ageRestriction + '\'' + 
			",nonPromoMessage = '" + nonPromoMessage + '\'' + 
			"}";
		}
}