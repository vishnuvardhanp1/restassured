package com.restassured.restassured;

import static io.restassured.RestAssured.given;

import com.restassured.restassured.pojo.UserData;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Program7_Pojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://www.engineerdiaries.com/";
	    UserData response= given()
	     .header("Connection","keep-alive")
	     .when().get("/api-test/users/1028")
	    .then().extract().response().as(UserData.class);
	    
	    //JsonPath json=new JsonPath(response);
	   
	    System.out.println(response.getName()); 
	    System.out.println(response.getLocation().get(1)); 
	    System.out.println(response.getBiometric().getWeight());
	}

}
