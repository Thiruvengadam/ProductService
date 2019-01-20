package com.jlp.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Price{
	private String uom;
	private String then2;
	private String then1;
	@JsonProperty("now")
	private JsonNode now;
	private String was;
	private String currency;

	public void setUom(String uom){
		this.uom = uom;
	}

	public String getUom(){
		return uom;
	}

	public void setThen2(String then2){
		this.then2 = then2;
	}

	public String getThen2(){
		return then2;
	}

	public void setThen1(String then1){
		this.then1 = then1;
	}

	public String getThen1(){
		return then1;
	}

	public JsonNode getNow() {
		return now;
	}

	public void setNow(JsonNode now) {
		this.now = now;
	}

	public void setWas(String was){
		this.was = was;
	}

	public String getWas(){
		return was;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	@Override
 	public String toString(){
		return 
			"Price{" + 
			"uom = '" + uom + '\'' + 
			",then2 = '" + then2 + '\'' + 
			",then1 = '" + then1 + '\'' + 
			",now = '" + now + '\'' +
			",was = '" + was + '\'' + 
			",currency = '" + currency + '\'' + 
			"}";
		}
}
