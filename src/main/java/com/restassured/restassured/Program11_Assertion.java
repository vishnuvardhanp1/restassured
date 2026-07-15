package com.restassured.restassured;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class Program11_Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RestAssured.baseURI = "https://www.engineerdiaries.com/";
		    given()
		     .when().get("/api-test/users/1028")
		     .then().statusCode(200);
		    
		    given()
		     .when().get("/api-test/users/1028")
		     .then()
		     .header("Content-Type","application/json");
		     
		     given()
		     .when().get("/api-test/users/1028")
		     .then().time(lessThan(5000L)) ;
		    
		     given()
		     .when().get("/api-test/users/1028")
		     .then().body("id", equalTo(1028));
		     
		     given()
		     .when()
		     .get("/api-test/users/1028")
		     .then()
		     .body("email", response -> {
		         String name = response.path("name");
		         return equalTo(name.toLowerCase().replace(" ", ".") + "@gmail.com");
		     });
		     
	}

}