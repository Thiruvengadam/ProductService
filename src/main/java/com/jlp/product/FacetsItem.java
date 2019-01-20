package com.jlp.product;

import java.util.List;

public class FacetsItem{
	private String name;
	private String tooltip;
	private List<DetailsItem> details;
	private String type;
	private String dimensionName;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setTooltip(String tooltip){
		this.tooltip = tooltip;
	}

	public String getTooltip(){
		return tooltip;
	}

	public void setDetails(List<DetailsItem> details){
		this.details = details;
	}

	public List<DetailsItem> getDetails(){
		return details;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setDimensionName(String dimensionName){
		this.dimensionName = dimensionName;
	}

	public String getDimensionName(){
		return dimensionName;
	}

	@Override
 	public String toString(){
		return 
			"FacetsItem{" + 
			"name = '" + name + '\'' + 
			",tooltip = '" + tooltip + '\'' + 
			",details = '" + details + '\'' + 
			",type = '" + type + '\'' + 
			",dimensionName = '" + dimensionName + '\'' + 
			"}";
		}
}