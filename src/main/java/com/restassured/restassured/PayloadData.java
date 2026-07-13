package com.restassured.restassured;

public class PayloadData {
static String getData() {
	return "{\r\n"
			+ "  \"name\": \"Vishnuvardhan\",\r\n"
			+ "  \"email\": \"vishnuvardhan@gmail.com\",\r\n"
			+ "  \"password\": \"rohit123\",\r\n"
			+ "  \"location\": [\r\n"
			+ "    \"Delhi\",\r\n"
			+ "    \"Pune\",\r\n"
			+ "    \"Chennai\"\r\n"
			+ "  ],\r\n"
			+ "  \"biometric\": {\r\n"
			+ "    \"height\": 190,\r\n"
			+ "    \"weight\": 85\r\n"
			+ "  },\r\n"
			+ "  \"type\": \"User\"\r\n"
			+ "}";
}
}
