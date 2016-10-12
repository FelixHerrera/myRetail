//This class will populate the database with test items of certain ids, uncomment to populate database.
//package com.myRetail;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class populateDatabase implements CommandLineRunner {
//
//	@Autowired
//	private PriceRepository repository;
//
//	public static void main(String[] args) {
//		SpringApplication.run(populateDatabase.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		//repository.deleteAll();
//
//		// save a couple of Prices
//		repository.save(new Price(16752456, 34.99, "USD"));
//		repository.save(new Price(15117729, 349.99, "USD"));
//		repository.save(new Price(16696652, 299.99, "USD"));
//		repository.save(new Price(15643793, 299.99, "USD"));
//
//		// fetch all Prices
//		System.out.println("Prices found with findAll():");
//		System.out.println("-------------------------------");
//		for (Price price : repository.findAll()) {
//			System.out.println(price);
//		}
//		System.out.println();
//
//		// fetch an individual Price
//		System.out.println("Price found with findById(15117729):");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findById(15117729));
//
//	}
//
//}