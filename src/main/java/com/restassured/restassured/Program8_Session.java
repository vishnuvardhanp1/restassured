package com.restassured.restassured;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

public class Program8_Session {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	RestAssured.baseURI ="https://www.engineerdiaries.com/api-test";
    SessionFilter session=new SessionFilter();
    given().header("Content-Type","application/json")
    .body("{\r\n"
    		+ "  \"username\": \"vishnu@gmail.com\",\r\n"
    		+ "  \"password\": \"PASSWORD\"\r\n"
    		+ "}")
    .filter(session)
    .when().post("/createSession");
    
    given()
    .filter(session)
    .when().get("/payment")
    .then().log().all();
    
    
	}

}
