package com.jlp.product;

public class DynamicAttributes{
	private String newinproducttype;
	private String dressshape;
	private String typeofpattern;
	private String dressbyoccasion;
	private String washinginstructions;
	private String countryoforigin;
	private String typeofknit;
	private String dryinginstructions;
	private String fabric;
	private String luxuryfabric;

	public void setNewinproducttype(String newinproducttype){
		this.newinproducttype = newinproducttype;
	}

	public String getNewinproducttype(){
		return newinproducttype;
	}

	public void setDressshape(String dressshape){
		this.dressshape = dressshape;
	}

	public String getDressshape(){
		return dressshape;
	}

	public void setTypeofpattern(String typeofpattern){
		this.typeofpattern = typeofpattern;
	}

	public String getTypeofpattern(){
		return typeofpattern;
	}

	public void setDressbyoccasion(String dressbyoccasion){
		this.dressbyoccasion = dressbyoccasion;
	}

	public String getDressbyoccasion(){
		return dressbyoccasion;
	}

	public void setWashinginstructions(String washinginstructions){
		this.washinginstructions = washinginstructions;
	}

	public String getWashinginstructions(){
		return washinginstructions;
	}

	public void setCountryoforigin(String countryoforigin){
		this.countryoforigin = countryoforigin;
	}

	public String getCountryoforigin(){
		return countryoforigin;
	}

	public void setTypeofknit(String typeofknit){
		this.typeofknit = typeofknit;
	}

	public String getTypeofknit(){
		return typeofknit;
	}

	public void setDryinginstructions(String dryinginstructions){
		this.dryinginstructions = dryinginstructions;
	}

	public String getDryinginstructions(){
		return dryinginstructions;
	}

	public void setFabric(String fabric){
		this.fabric = fabric;
	}

	public String getFabric(){
		return fabric;
	}

	public void setLuxuryfabric(String luxuryfabric){
		this.luxuryfabric = luxuryfabric;
	}

	public String getLuxuryfabric(){
		return luxuryfabric;
	}

	@Override
 	public String toString(){
		return 
			"DynamicAttributes{" + 
			"newinproducttype = '" + newinproducttype + '\'' + 
			",dressshape = '" + dressshape + '\'' + 
			",typeofpattern = '" + typeofpattern + '\'' + 
			",dressbyoccasion = '" + dressbyoccasion + '\'' + 
			",washinginstructions = '" + washinginstructions + '\'' + 
			",countryoforigin = '" + countryoforigin + '\'' + 
			",typeofknit = '" + typeofknit + '\'' + 
			",dryinginstructions = '" + dryinginstructions + '\'' + 
			",fabric = '" + fabric + '\'' + 
			",luxuryfabric = '" + luxuryfabric + '\'' + 
			"}";
		}
}
