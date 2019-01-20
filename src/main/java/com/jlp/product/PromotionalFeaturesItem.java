package com.jlp.product;

public class PromotionalFeaturesItem{
	private String longDescription;
	private String linkUrl;
	private String description;
	private String iconUrl;
	private String title;

	public void setLongDescription(String longDescription){
		this.longDescription = longDescription;
	}

	public String getLongDescription(){
		return longDescription;
	}

	public void setLinkUrl(String linkUrl){
		this.linkUrl = linkUrl;
	}

	public String getLinkUrl(){
		return linkUrl;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setIconUrl(String iconUrl){
		this.iconUrl = iconUrl;
	}

	public String getIconUrl(){
		return iconUrl;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"PromotionalFeaturesItem{" + 
			"longDescription = '" + longDescription + '\'' + 
			",linkUrl = '" + linkUrl + '\'' + 
			",description = '" + description + '\'' + 
			",iconUrl = '" + iconUrl + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}
