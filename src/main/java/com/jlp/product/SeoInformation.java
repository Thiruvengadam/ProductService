package com.jlp.product;

public class SeoInformation{
	private String description;
	private String title;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
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
			"SeoInformation{" + 
			"description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}
