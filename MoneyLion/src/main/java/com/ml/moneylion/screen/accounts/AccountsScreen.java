package com.ml.moneylion.screen.accounts;

import java.util.List;
import org.apache.log4j.Logger;
import org.testng.Assert;
import com.ml.framework.utilities.DriverWait;
import com.ml.moneylion.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AccountsScreen extends Base {

	public AccountsScreen() {
		logger = Logger.getLogger(AccountsScreen.class);
	}

	@AndroidFindBy(id = "org.gnucash.android:id/fab_create_account")
	private MobileElement createAccountBtn;

	@AndroidFindBy(xpath = "//*[@resource-id='org.gnucash.android:id/tab_layout']//android.widget.TextView")
	private MobileElement accountsTab;
	
	@AndroidFindBy(id = "org.gnucash.android:id/fab_create_transaction")
	private MobileElement createSubAccountBtn;
	
	@AndroidFindBy(xpath="//*[contains(@resource-id,'fragment_account_list')]//*[@resource-id='org.gnucash.android:id/primary_text']")
	private List<MobileElement> accountList;
	
	@AndroidFindBy(id="org.gnucash.android:id/menu_search")
	private MobileElement searchButton;
	
	@AndroidFindBy(id="org.gnucash.android:id/search_src_text")
	private MobileElement searchInputField;
	/**
	 * Validates whether Accounts screen is displayed or not
	 */
	@Override
	public void isScreenDisplayed() {
		Assert.assertTrue(DriverWait.isElementDisplayed(createAccountBtn), "Accounts screen is not displayed");
		logger.info("Pre Setup is done successfully and accounts screen is displayed");
	}
	
	/**
	 * Clicks on Add Account button and validate create account screen is displayed or not
	 * @return
	 */
	public CreateAccountScreen clickAddAccountButton() {
		createAccountBtn.click();
		logger.info("Clicked on Create Account button in accounts screen");
		new CreateAccountScreen().isScreenDisplayed();
		return new CreateAccountScreen();
	}
	
	/**
	 * Clicks on Add Sub Account button and validate create account screen is displayed or not
	 * @return
	 */
	public CreateAccountScreen clickAddSubAccountButton() {
		createSubAccountBtn.click();
		new CreateAccountScreen().isScreenDisplayed();
		return new CreateAccountScreen();
	}
	
	/**
	 * This method get specified account mobile element
	 * @param accountName - name of the specific account
	 * @return MobileElement
	 */
	public MobileElement getAccount(String accountName) {
		for(MobileElement account:accountList) {
			if(account.getAttribute("text").equals(accountName)) {
				return account;
			}
		}
		return null;
	}
	
	/**
	 * Click on account in account list
	 * @param mainAccountName - Name of the main account on which user has to click
	 */
	public void clickAccount(String accountName) {
		if(getAccount(accountName)!=null) {
			getAccount(accountName).click();
		}else {
			Assert.assertFalse(false,"Account does not with "+accountName+" name");
		}
	}

	/**
	 * Iterate over account list and compare whether account list has specified account or not
	 * @param accountName - name of the account looking for
	 * @return boolean true- if account exist or else false
	 */
	public boolean verifyAccount(String accountName) {
		if(getAccount(accountName)!=null) {
			logger.info("Account is available in "+accountName);
			return true;
		}
		return false;
	}

	/**
	 * Clicks on search
	 */
	public void selectSearch() {
		searchButton.click();
	}
	
	/**
	 * Enter text in search
	 * @param accountName
	 */
	public void searchAccount(String accountName) {
		selectSearch();
		searchInputField.sendKeys(accountName);
	}
}
