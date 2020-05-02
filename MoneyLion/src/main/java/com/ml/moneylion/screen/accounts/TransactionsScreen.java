package com.ml.moneylion.screen.accounts;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.ml.framework.utilities.DriverWait;
import com.ml.moneylion.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TransactionsScreen extends Base {
	public TransactionsScreen() {
		logger = Logger.getLogger(TransactionsScreen.class);
	}

	@AndroidFindBy(xpath = "//*[@resource-id='org.gnucash.android:id/fragment_transaction_list']//*[@resource-id='org.gnucash.android:id/primary_text']")
	private MobileElement transactionsList;

	@AndroidFindBy(id = "org.gnucash.android:id/fab_create_transaction")
	private MobileElement createTransactionBtn;

	@Override
	public void isScreenDisplayed() {
		Assert.assertTrue(DriverWait.isElementDisplayed(createTransactionBtn), "Transactions screen is not displayed");
		logger.info("Transactions screen is displayed");
	}

	/**
	 * Clicks on create transaction icon
	 */
	public void clickCreateTransactionIcon() {
		createTransactionBtn.click();
		new NewTransactionScreen().isScreenDisplayed();
	}
}
