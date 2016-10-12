Target Case Study myRetail

Build an application that performs the following actions: 
•	Responds to an HTTP GET request at /products/{id} and delivers product data as JSON (where {id} will be a number. 
•	Example product IDs: 15117729, 16483589, 16696652, 16752456, 15643793) 
•	Example response: {"id":13860428,"name":"The Big Lebowski (Blu-ray) (Widescreen)","current_price":{"value": 13.49,"currency_code":"USD"}}
•	Performs an HTTP GET to retrieve the product name from an external API. (For this exercise the data will come from api.target.com, but let’s just pretend this is an internal resource hosted by myRetail)  o Example: https://api.target.com/products/v3/13860428?fields=descriptions&id_type=TCIN&key=43cJWpLjH8Z8oR18KdrZDBKAgLLQKJjz
•	Reads pricing information from a NoSQL data store and combines it with the product id and name from the HTTP request into a single response.  
•	BONUS: Accepts an HTTP PUT request at the same path (/products/{id}), containing a JSON request body similar to the GET response, and updates the product’s price in the data store.

Technologies used:
Spring Boot
MongoDB
Maven
Java

Running the application:

Be sure the necessary technologies are installed and configured properly on your machine.
Open the datastore via mongod.
Open project within Spring Boot.
Populate database manually or via the populateDatabase file.
Run program as Spring Boot app.

Tests were performed on the following ids:15117729, 16483589, 16696652, 16752456, 15643793
via the postman extension for Google Chrome


