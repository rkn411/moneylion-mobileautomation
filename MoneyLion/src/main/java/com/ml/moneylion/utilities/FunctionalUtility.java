package com.ml.moneylion.utilities;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.ml.framework.utilities.DriverWait;
import com.ml.moneylion.Base;

import io.appium.java_client.MobileElement;

public class FunctionalUtility {

	/**
	 * Gets locator for global drop down options
	 * 
	 * @param dropdownOptions
	 * @return By instance
	 */
	private static By getDropDownOptions(String dropdownOptions) {
		return By.xpath("//android.widget.CheckedTextView[@text='" + dropdownOptions + "']");
	}

	/**
	 * Utility method to select drop down option 
	 * @param spinnerElement  - Drop Down mobile element
	 * @param dropdownOption - option to select in drop down
	 */
	public static void selectDropDownOptions(MobileElement spinnerElement, String dropdownOption) {
		spinnerElement.click();
		Assert.assertTrue(DriverWait.isElementDisplayed(getDropDownOptions(dropdownOption)),
				dropdownOption + "Option is not avaiable in dropdown");
		Base.driver.findElement(getDropDownOptions(dropdownOption)).click();
	}
}
