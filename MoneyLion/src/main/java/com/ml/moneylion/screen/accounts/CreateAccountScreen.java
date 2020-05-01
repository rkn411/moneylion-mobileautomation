package com.ml.moneylion.screen.accounts;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.ml.framework.utilities.DriverWait;
import com.ml.moneylion.Base;
import com.ml.moneylion.utilities.FunctionalUtility;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateAccountScreen extends Base {
	public CreateAccountScreen() {
		logger = Logger.getLogger(CreateAccountScreen.class);
	}

	@AndroidFindBy(id = "org.gnucash.android:id/input_account_name")
	private MobileElement accountNameTxtField;

	@AndroidFindBy(id = "org.gnucash.android:id/input_currency_spinner")
	private MobileElement currencyDropDown;

	@AndroidFindBy(id = "org.gnucash.android:id/input_account_type_spinner")
	private MobileElement accountTypeDropDown;

	@AndroidFindBy(id = "org.gnucash.android:id/input_account_description")
	private MobileElement accountDescription;

	@AndroidFindBy(id = "org.gnucash.android:id/input_parent_account")
	private MobileElement parentAccountChkBox;

	@AndroidFindBy(id = "org.gnucash.android:id/checkbox_placeholder_account")
	private MobileElement placeholdeChkBox;

	@AndroidFindBy(id = "org.gnucash.android:id/menu_save")
	private MobileElement saveBtn;

	@Override
	public void isScreenDisplayed() {
		Assert.assertTrue(DriverWait.isElementDisplayed(saveBtn), "Create Account screen is not displayed");
		logger.info("Create Account Screen is displayed");
	}

	public void enterAccountName(String accountName) {
		accountNameTxtField.sendKeys(accountName);
	}
	
	public void selectCurrency(String currency) {
		FunctionalUtility.selectDropDownOptions(currencyDropDown, currency);
	}
	
	public void saveAccount() {
		saveBtn.click();
		new AccountsScreen().isScreenDisplayed();
	}
}
