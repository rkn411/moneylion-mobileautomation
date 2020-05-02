package com.ml.moneylion.screen.accounts;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.ml.framework.utilities.DriverWait;
import com.ml.moneylion.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewTransactionScreen extends Base {
	public NewTransactionScreen() {
		logger = Logger.getLogger(NewTransactionScreen.class);
	}

	@AndroidFindBy(id = "org.gnucash.android:id/input_transaction_name")
	private MobileElement descritionTxtField;

	@AndroidFindBy(id = "org.gnucash.android:id/input_transaction_amount")
	private MobileElement amountField;
	
	@AndroidFindBy(id="org.gnucash.android:id/input_transaction_type")
	private MobileElement transactionType;

	@AndroidFindBy(id = "org.gnucash.android:id/menu_save")
	private MobileElement saveBtn;

	@Override
	public void isScreenDisplayed() {
		Assert.assertTrue(DriverWait.isElementDisplayed(saveBtn), "New Transaction screen is not displayed");
		logger.info("New Transaction screen is displayed");
	}

	/**
	 * Enter data in amount field
	 * @param amount
	 */
	public void enterAmount(String amount) {
		amountField.sendKeys(amount);
	}
	
	/**
	 * Click on transaction type switch
	 */
	public void clickTrasactionTypeIcon() {
		transactionType.click();
	}
	
	/**
	 * Validates screen is not changed when invalid amount is given
	 */
	public void verifyAmountField() {
		isScreenDisplayed();
		logger.info("As expected characters are not allowed in amount fiel");
	}
	
	/**
	 * Click on save button
	 */
	public void clickSaveButton() {
		saveBtn.click();
	}
}
