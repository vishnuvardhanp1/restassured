package com.restassured.restassured;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Program9_PathParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RestAssured.baseURI = "https://www.engineerdiaries.com/";
	     given()
	    .pathParam("key", "1028")
	     .when().get("/api-test/users/{key}")
	     .then().log().all();
	}

}
