package com.ml.framework.utilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.log4testng.Logger;

import com.ml.moneylion.stepdefinitions.ServiceHooks;

import io.cucumber.core.api.Scenario;
public class UtilityMethods {
private static Logger logger=Logger.getLogger(UtilityMethods.class);
	
	public static void takeScreenShot(Scenario scenario, String... screenShotName) {
		logger.info("Taking screenshot");
		final byte[] screenshot = ((TakesScreenshot) ServiceHooks.getAppiumDriver()).getScreenshotAs(OutputType.BYTES);
		if (screenShotName.length > 0) {
			scenario.embed(screenshot, "image/png", screenShotName[0]);
		} else {
			scenario.embed(screenshot, "image/png", scenario.getName());
		}
	}
	// to implement framework related common methods  here 

}
