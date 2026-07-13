package com.restassured.restassured;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Program2_CaptureResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RestAssured.baseURI = "https://www.engineerdiaries.com/";
	     String response=given()
	     .header("Connection","keep-alive")
	     .when().get("/api-test/users")
	     .then().extract().response().asString();
	     System.out.print(response);
	     
	}

}
