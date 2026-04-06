package com.base;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

import static com.utils.TestData.*;

public class BaseTest {
	@BeforeClass
	public void setup() {
		// Common setup code for all tests can go here
		RestAssured.baseURI= BASE_URL;
		
	}
	

}
