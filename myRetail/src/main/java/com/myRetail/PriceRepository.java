//This class contains data store methods to locate certain collections within
//the data store
package com.myRetail;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PriceRepository extends MongoRepository<Price, String>{
	public Price findById(long id);
	public List<Price> findByPrice(double price);
}
