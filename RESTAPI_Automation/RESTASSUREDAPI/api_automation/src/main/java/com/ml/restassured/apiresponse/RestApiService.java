package com.ml.restassured.apiresponse;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * common class for rest-api methods like GET,POST.......
 * 
 * @author Reddi
 *
 */
public class RestApiService {

	RequestSpecification requestSpec = given();
	public Response response = null;

	/*
	 * * Method for Post Request
	 */
	public Response post_request(String contentType, String jsonObject, String url) {
		if (contentType.equalsIgnoreCase("application/json")) {
			response = (requestSpec
	                .relaxedHTTPSValidation()
	                .body(jsonObject)
	                .with()
	                .contentType(contentType)
	                .when())
	                .post(url);
		}
		return response;
	}

	/*
	 * * Method for Get Request
	 */
	public Response get_request(String url) {
		response = requestSpec.when().get(url).then().extract().response();
		return response;
	}
	
}
