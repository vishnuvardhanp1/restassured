package com.restassured.restassured;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.RestAssured;

public class Program4_Attachment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RestAssured.baseURI = "https://www.engineerdiaries.com/";
	     given()
	     .multiPart("file",new File("C:\\Users\\VISHNU VARDHAN\\Desktop\\sample.txt"))
	     //.header("Connection","keep-alive")
	     .when().post("/api-test/files/upload")
	     .then().log().all();
	     
	}

}
