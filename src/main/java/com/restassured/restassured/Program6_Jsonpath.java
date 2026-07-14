package com.restassured.restassured;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Program6_Jsonpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RestAssured.baseURI = "https://www.engineerdiaries.com/";
	    String response= given()
	     .header("Connection","keep-alive")
	     .when().get("/api-test/users/1028")
	    .then().extract().response().asString();
	    
	    JsonPath json=new JsonPath(response);
	    System.out.println(json.getString("email"));
	    System.out.println(json.getInt("id")); 
	}

}
