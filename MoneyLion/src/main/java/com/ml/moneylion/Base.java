package com.ml.moneylion;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.ml.moneylion.stepdefinitions.ServiceHooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class Base {
	public static AppiumDriver<MobileElement> driver;
	public Logger logger;

	public Base() {
		driver = ServiceHooks.getAppiumDriver();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public abstract void isScreenDisplayed();
}
