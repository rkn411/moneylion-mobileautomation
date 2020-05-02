package com.ml.framework.utilities;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import com.ml.moneylion.Base;

public class DriverWait {
	/**
	 * This method makes web driver to wait more than 2 mints for web element to
	 * display, if web element is not visible or not displayed after 2mints then
	 * method return false otherwise return true
	 * 
	 * @param element
	 *            - element to display 
	 * @return boolean
	 */
	public static boolean isElementDisplayed(MobileElement element) {
		for (int itrCount = 1; itrCount <= 60; itrCount++) {
			try {
				return element.isDisplayed();
			} catch (NoSuchElementException noSuch) {

			} catch (StaleElementReferenceException stale) {

			}
			customSleep(1);
		}
		return false;
	}

	/**
	 * This method makes web driver to wait more than 2 mints for web element to
	 * display, if web element is not visible or not displayed after 2mints then
	 * method return false otherwise return true
	 * 
	 * @param locator
	 *            - locator to display 
	 * @return boolean
	 */
	public static boolean isElementDisplayed(By locator) {
		for (int itrCount = 1; itrCount <= 60; itrCount++) {
			try {
				return Base.driver.findElement(locator).isDisplayed();
			} catch (NoSuchElementException noSuch) {

			} catch (StaleElementReferenceException stale) {

			}
			customSleep(1);
		}
		return false;
	}

	/**
	 * Makes web driver to wait for element is enabled, if element is enabled in 2
	 * mints then return false
	 * 
	 * @param element - element to display
	 * @return boolean
	 */
	public static boolean isElementEnabled(MobileElement element) {
		if (isElementDisplayed(element)) {
			int itrCount = 1;
			do {
				if (element.isEnabled()) {
					return true;
				}
				customSleep(1);
				itrCount++;
			} while (itrCount <= 30);
		}
		return false;
	}

	/**
	 * Make thread to sleep for specified time
	 * 
	 * @param waitTime
	 *            - wait time in long
	 */
	public static void customSleep(long waitTime) {
		try {
			Thread.sleep(1000 * waitTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}
}
