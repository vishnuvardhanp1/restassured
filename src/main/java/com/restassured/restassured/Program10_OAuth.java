package com.restassured.restassured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class Program10_OAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //{{auth_secret_0yaq}}
		RestAssured.baseURI ="https://api.github.com/";
		given().auth().oauth2("")
		.when().get("user/repos")
		.then().log().all();
		
	}

}
