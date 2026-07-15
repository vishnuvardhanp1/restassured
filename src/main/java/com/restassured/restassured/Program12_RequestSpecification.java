package com.restassured.restassured;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.*;
import static org.hamcrest.Matchers.*;
public class Program12_RequestSpecification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       RequestSpecification postRequestType =
    		   new RequestSpecBuilder()
    		   .setBaseUri("https://www.engineerdiaries.com/api-test")
    		   .setContentType(ContentType.JSON)
    		   .setBody("{\r\n"
    		   		+ "  \"username\": \"dummy@gmail.com\",\r\n"
    		   		+ "  \"password\": \"PASSWORD\"\r\n"
    		   		+ "}")
    		   .build();
       
       given()
       .spec(postRequestType)
       .when()
       .post("/createSession")
       .then().log().all();
       
       ResponseSpecification validResponseSpec=
    		   new ResponseSpecBuilder()
    		   .expectStatusCode(200)
    		   .expectContentType(ContentType.JSON)
    		   .expectResponseTime(lessThan(5000L))
    		   .build();
       
       given()
       .baseUri("https://www.engineerdiaries.com/api-test")
       .when()
       .get("users")
       .then()
       .spec(validResponseSpec);
       
       
	}

}
