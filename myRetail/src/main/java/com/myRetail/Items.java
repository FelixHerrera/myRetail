//This class extracts the list of item information from the items portion of the JSON
package com.myRetail;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Items {
	
	@JsonProperty("items")
	private List<Product> itemInfo;

	
	public List<Product> getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(List<Product> itemInfo) {
		this.itemInfo = itemInfo;
	}
	

}
