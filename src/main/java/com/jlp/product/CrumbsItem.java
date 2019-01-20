package com.jlp.product;

public class CrumbsItem{
	private String item;
	private String displayName;
	private String clickable;
	private String type;

	public void setItem(String item){
		this.item = item;
	}

	public String getItem(){
		return item;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setClickable(String clickable){
		this.clickable = clickable;
	}

	public String getClickable(){
		return clickable;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"CrumbsItem{" + 
			"item = '" + item + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",clickable = '" + clickable + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}
