package com.ml.restassured.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "resources/features", glue = { "com.ml.restassured.stepdefinitions" },
tags = {"@bookingCreation" },
plugin = { "junit:target/cucumber-reports/Cucumber.xml",
		   "json:target/cucumber-reports/Cucumber.json",
		   "com.cucumber.listener.ExtentCucumberFormatter:Reports/CreateBookingVerification.html" })

public class API_TestRunner {

}
