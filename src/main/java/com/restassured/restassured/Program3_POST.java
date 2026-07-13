package com.restassured.restassured;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Program3_POST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RestAssured.baseURI = "https://www.engineerdiaries.com/";
	     given()
	     .header("Content-Type","application/json")
	     .body(PayloadData.getData())
	     .when().post("/api-test/addUser")
	     .then().log().all();
	}

}
