package com.jlp.product;

public class Now{
	private String from;
	private String to;

	public void setFrom(String from){
		this.from = from;
	}

	public String getFrom(){
		return from;
	}

	public void setTo(String to){
		this.to = to;
	}

	public String getTo(){
		return to;
	}

	@Override
 	public String toString(){
		return 
			"Now{" + 
			"from = '" + from + '\'' + 
			",to = '" + to + '\'' + 
			"}";
		}
}
