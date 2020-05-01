package com.ml.moneylion.screen;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.ml.framework.utilities.DriverWait;
import com.ml.moneylion.Base;
import com.ml.moneylion.screen.accounts.AccountsScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GNUSetupScreen extends Base {

	public GNUSetupScreen() {
		logger = Logger.getLogger(GNUSetupScreen.class);
	}

	@AndroidFindBy(id = "android:id/title")
	private MobileElement welcomeTitle;

	@AndroidFindBy(id = "org.gnucash.android:id/btn_save")
	private MobileElement nextBtn;

	@AndroidFindBy(xpath = "//android.widget.ListView")
	private MobileElement radioBtns;

	@AndroidFindBy(id = "org.gnucash.android:id/btn_cancel")
	private MobileElement cancelBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='DISMISS']")
	private MobileElement dismissBtn;

	public MobileElement getRadioOptions(String radioButtonName) {
		return driver.findElement(By.xpath("//*[@text='" + radioButtonName + "']"));
	}

	/**
	 * Validates whether GNU welcome is displayed or not
	 */
	@Override
	public void isScreenDisplayed() {
		Assert.assertTrue(DriverWait.isElementDisplayed(welcomeTitle), "GNU Welcome screen is not displayed");
		logger.info("GNU Welcome screen is displayed");
	}

	/**
	 * Clicks on next button in setup screen
	 * 
	 * @return
	 */
	public GNUSetupScreen clickNextButton() {
		nextBtn.click();
		return new GNUSetupScreen();
	}

	/**
	 * This method is used to select radio buttons in GNU setup screen
	 * 
	 * @param radioBtnName
	 *            - name of the radio button
	 */
	public void selectGNUPreSetupRadioBtns(String radioBtnName) {
		getRadioOptions(radioBtnName).click();
		logger.info("Selected " + radioBtnName + " radio button");
	}

	/**
	 * Clicks back button in GNU setup screen
	 */
	public void clickBackButton() {
		cancelBtn.click();
	}

	/**
	 * This method is used to click done button once GUN setup is done
	 */
	public void clickDoneButton() {
		clickNextButton();
		clickDismissButton();
		new AccountsScreen().isScreenDisplayed();
		logger.info(" GNU pre setup is completed");
	}

	/**
	 * Clicks dismiss button in instruction pop up
	 */
	public void clickDismissButton() {
		dismissBtn.click();
	}

	/**
	 * This method is used to set GNU launch setup
	 * 
	 * @param currency
	 *            - currency
	 * @param account
	 *            - account option
	 * @param feedbackOptions
	 *            - feedback options for crash reports
	 */
	public void gnuCashPreSetup(String currency, String account, String feedbackOptions) {
		logger.info("Setting GNU pre setup");
		clickNextButton();
		selectGNUPreSetupRadioBtns(currency);
		clickNextButton();
		selectGNUPreSetupRadioBtns(account);
		clickNextButton();
		selectGNUPreSetupRadioBtns(feedbackOptions);
		clickNextButton();
		clickDoneButton();
	}
}
