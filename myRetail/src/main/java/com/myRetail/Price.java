//This class contains the information that a price needs that will be stored in the 
//data store
package com.myRetail;

import org.springframework.data.annotation.Id;

public class Price {
	
	@Id
	public long id;
	
	double price;
	String currencyCode;
	
	public Price(){}
	
	public Price(long id, double price, String currency){
		this.id = id;
		this.price = price;
		this.currencyCode = currency;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String toString(){
		return "\"current_price\":{\"value\":" + price + ",\"currency_code\":\"" + currencyCode + "\"}";
	}
}
