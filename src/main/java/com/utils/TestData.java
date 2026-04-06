package com.utils;

public interface TestData {

	public static final String BASE_URL = "https://fakerestapi.azurewebsites.net";
	public static final String BASE_PATH = "/api/v1";
	public static final String BOOK_ENDPOINT = "/Books";
	public static final String CONTENT_TYPE = "application/json";
	public static final int RANDOM_NUM = (int)(Math.random() * 1000);
	public static final String RANDOM_STRING = "user" + RANDOM_NUM + "@gmail.com";
	public static final String REQUEST_BODY = "{\r\n"
			+ "  \"id\": " + RANDOM_NUM + ",\r\n"
			+ "  \"idBook\": " + RANDOM_NUM + ",\r\n"
			+ "  \"firstName\": \"" + RANDOM_STRING + "\",\r\n"
			+ "  \"lastName\":\"" + RANDOM_STRING + "\"\r\n"
			+ "}";
	public static final String BOOK_URL = BASE_URL + BASE_PATH + BOOK_ENDPOINT;
	
	
	
	
}
