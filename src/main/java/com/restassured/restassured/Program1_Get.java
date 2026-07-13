package com.restassured.restassured;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class Program1_Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RestAssured.baseURI = "https://www.engineerdiaries.com/";
     given()
     .header("Connection","keep-alive")
     .when().get("/api-test/users")
     .then().log().all();
     
     
     
	}

}
