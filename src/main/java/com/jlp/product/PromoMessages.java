package com.jlp.product;

public class PromoMessages{
	private String offer;
	private CustomSpecialOffer customSpecialOffer;
	private String bundleHeadline;
	private String customPromotionalMessage;
	private String priceMatched;

	public void setOffer(String offer){
		this.offer = offer;
	}

	public String getOffer(){
		return offer;
	}

	public void setCustomSpecialOffer(CustomSpecialOffer customSpecialOffer){
		this.customSpecialOffer = customSpecialOffer;
	}

	public CustomSpecialOffer getCustomSpecialOffer(){
		return customSpecialOffer;
	}

	public void setBundleHeadline(String bundleHeadline){
		this.bundleHeadline = bundleHeadline;
	}

	public String getBundleHeadline(){
		return bundleHeadline;
	}

	public void setCustomPromotionalMessage(String customPromotionalMessage){
		this.customPromotionalMessage = customPromotionalMessage;
	}

	public String getCustomPromotionalMessage(){
		return customPromotionalMessage;
	}

	public void setPriceMatched(String priceMatched){
		this.priceMatched = priceMatched;
	}

	public String getPriceMatched(){
		return priceMatched;
	}

	@Override
 	public String toString(){
		return 
			"PromoMessages{" + 
			"offer = '" + offer + '\'' + 
			",customSpecialOffer = '" + customSpecialOffer + '\'' + 
			",bundleHeadline = '" + bundleHeadline + '\'' + 
			",customPromotionalMessage = '" + customPromotionalMessage + '\'' + 
			",priceMatched = '" + priceMatched + '\'' + 
			"}";
		}
}
