package com.restassured.restassured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class Program10_OAUTH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //{{auth_secret_0yaq}}
		RestAssured.baseURI ="https://api.github.com/";
		given().auth().oauth2("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")
		.when().get("user/repos")
		.then().log().all();
		
	}

}
