package com.restassured.restassured.pojo;

import java.util.List;

public class UserData {
int id;
String name;
String email;
long createdAt;
List<String> location;
Biometric biometric;
String type;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @return the createdAt
 */
public long getCreatedAt() {
	return createdAt;
}
/**
 * @return the location
 */
public List<String> getLocation() {
	return location;
}
/**
 * @return the biometric
 */
public Biometric getBiometric() {
	return biometric;
}
/**
 * @return the type
 */
public String getType() {
	return type;
}


}
