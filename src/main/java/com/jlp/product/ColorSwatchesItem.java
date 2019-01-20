package com.jlp.product;

import lombok.Data;

@Data

public class ColorSwatchesItem{
	private String basicColor;
	private boolean isAvailable;
	private String colorSwatchUrl;
	private String color;
	private String imageUrl;
	private String skuId;


	@Override
 	public String toString(){
		return 
			"ColorSwatchesItem{" + 
			"basicColor = '" + basicColor + '\'' + 
			",isAvailable = '" + isAvailable + '\'' + 
			",colorSwatchUrl = '" + colorSwatchUrl + '\'' + 
			",color = '" + color + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",skuId = '" + skuId + '\'' + 
			"}";
		}
}
