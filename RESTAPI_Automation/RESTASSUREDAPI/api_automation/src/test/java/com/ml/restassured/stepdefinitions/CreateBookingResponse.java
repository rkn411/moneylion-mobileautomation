package com.ml.restassured.stepdefinitions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.JSONObject;
import com.cucumber.listener.Reporter;
import com.ml.restassured.apiresponse.RestApiService;
import com.ml.restassured.datautil.ConfigFileReader;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class CreateBookingResponse extends RestApiService {
	private static Logger logger;
	static ConfigFileReader config = new ConfigFileReader();
	private Response post_response_login = null;
	private Response post_response_booking = null;

	@Before
	public void configloader(Scenario scenario) throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		config.loadPropertyFile("TestData.properties");
		logger = Logger.getLogger(CreateBookingResponse.class);
	}

	@When("^User submit the post request as per the data in  Json/property file$")
	public void user_submit_the_post_request_as_per_the_data_in_Json_property_file() throws Throwable {
		post_response_login = post_request(config.getProperty("contentType"), config.getProperty("loginBody"), config.getProperty("loginURL"));
		post_response_booking = post_request(config.getProperty("contentType"), config.getProperty("requestBody"), config.getProperty("BookingURL"));
		logger.info("Login Response is : " + post_response_login.asString());
		logger.info("Booking Response is : " + post_response_booking.asString());
		Reporter.addStepLog("Login Response is : " + post_response_login.asString());
		Reporter.addStepLog("Booking Response is : " + post_response_booking.asString());
		
	}

	@When("^User should validate success status code$")
	public void user_should_validate_success_status_code() throws Throwable {
		if(post_response_login.statusCode()==200) {
		logger.info("Status code for Login is : " + post_response_login.statusCode());
		Reporter.addStepLog("Status code for Login is : " + post_response_login.statusCode());
		}
		
		if ( post_response_booking.statusCode()==200) {
			logger.info("Status code for Booking is : " + post_response_booking.statusCode());
			Reporter.addStepLog("Status code for Booking is : " +  post_response_booking.statusCode());
		}
	
	}

	@When("^User should validate response for booking id$")
	public void user_should_validate_response_for_booking_id() throws Throwable {
		JSONObject json = new JSONObject(post_response_booking.asString());
		String bookingID = json.get("bookingid").toString();
		logger.info("Booking ID is : " + bookingID);
		Reporter.addStepLog("Booking ID is : " + bookingID);
	}

}
