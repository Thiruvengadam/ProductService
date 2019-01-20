package com.jlp.product;

public class DetailsItem{
	private String colorSwatchUrl;
	private String seoUrlParts;
	private String color;
	private String facetId;
	private String qty;
	private String isSelected;
	private String label;

	public void setColorSwatchUrl(String colorSwatchUrl){
		this.colorSwatchUrl = colorSwatchUrl;
	}

	public String getColorSwatchUrl(){
		return colorSwatchUrl;
	}

	public void setSeoUrlParts(String seoUrlParts){
		this.seoUrlParts = seoUrlParts;
	}

	public String getSeoUrlParts(){
		return seoUrlParts;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setFacetId(String facetId){
		this.facetId = facetId;
	}

	public String getFacetId(){
		return facetId;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public String getQty(){
		return qty;
	}

	public void setIsSelected(String isSelected){
		this.isSelected = isSelected;
	}

	public String getIsSelected(){
		return isSelected;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	@Override
 	public String toString(){
		return 
			"DetailsItem{" + 
			"colorSwatchUrl = '" + colorSwatchUrl + '\'' + 
			",seoUrlParts = '" + seoUrlParts + '\'' + 
			",color = '" + color + '\'' + 
			",facetId = '" + facetId + '\'' + 
			",qty = '" + qty + '\'' + 
			",isSelected = '" + isSelected + '\'' + 
			",label = '" + label + '\'' + 
			"}";
		}
}
