package com.books.requests;

import org.testng.annotations.Test;

import com.allBooksReq.endpoints.Routes;
import com.base.BaseTest;

import static io.restassured.RestAssured.*;
import io.cucumber.java.en.Given;

public class ValidBookGetReqSpec extends BaseTest{
	
	@Test
	public void validBookGetReqSpecification() {
		given().
		when().get(Routes.getAllBooks).
		then().log().all().statusCode(200);
		
	}
	
	@Test
	public void validBookGetByIdReqSpecification() {
		given().pathParam("id", 2).
		when().get(Routes.getBookById).
		then().log().all().statusCode(200);
		
	}

}
