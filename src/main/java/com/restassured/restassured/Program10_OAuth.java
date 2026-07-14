package com.restassured.restassured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class Program10_OAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //{{auth_secret_0yaq}}
		RestAssured.baseURI ="https://api.github.com/";
		given().auth().oauth2("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")
		.when().get("user/repos")
		.then().log().all();
		
	}

}
