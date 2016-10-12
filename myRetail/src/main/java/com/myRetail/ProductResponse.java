//This class extracts the outer most layer of the JSON called product_composite_response
package com.myRetail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ProductResponse {
	@JsonProperty("product_composite_response")
	private Items itemDescription;
	

	public Items getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(Items itemDescription) {
		this.itemDescription = itemDescription;
	}

	
}
