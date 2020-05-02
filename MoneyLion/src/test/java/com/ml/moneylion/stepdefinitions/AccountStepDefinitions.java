package com.ml.moneylion.stepdefinitions;

import org.testng.Assert;

import com.ml.moneylion.screen.accounts.AccountsScreen;
import com.ml.moneylion.screen.accounts.CreateAccountScreen;
import com.ml.moneylion.screen.accounts.NewTransactionScreen;
import com.ml.moneylion.screen.accounts.TransactionsScreen;

import io.cucumber.java.en.Then;

public class AccountStepDefinitions {
	
	private AccountsScreen accountScreen;
	private CreateAccountScreen createAccount;
	private TransactionsScreen transactionsListScreen;
	private NewTransactionScreen transactionScreen;
	public AccountStepDefinitions(AccountsScreen accountScreen,CreateAccountScreen createAccount,TransactionsScreen transactionsListScreen,NewTransactionScreen transactionScreen) {
		this.accountScreen=accountScreen;
		this.createAccount=createAccount;
		this.transactionsListScreen=transactionsListScreen;
		this.transactionScreen=transactionScreen;
	}

	@Then("user should see the dash board screen")
	public void user_should_see_the_dash_board_screen() {
		accountScreen.isScreenDisplayed();
	}

	@Then("user tap on plus icon to create new account")
	public void user_tap_on_plus_icon_to_create_new_account() {
		accountScreen.clickAddAccountButton();
	}

	@Then("user fills new account name field with {string}")
	public void user_fills_new_account_name_field_with(String accountName) {
		createAccount.enterAccountName(accountName);
	}

	@Then("user selects the {string} from the drop down")
	public void user_selects_the_from_the_drop_down(String currency) {
		createAccount.selectCurrency(currency);
	}

	@Then("user tap on save button")
	public void user_tap_on_save_button() {
		createAccount.saveAccount();
	}
	
	@Then("user should select account from the list {string}")
	public void user_should_select_account_from_the_list(String accountName) {
		accountScreen.clickAccount(accountName);
	}
	
	@Then("user search for created account {string}")
	public void user_search_for_created_account(String accountName) {
		accountScreen.searchAccount(accountName);
	}
	
	@Then("user tap on plus icon to create new transaction")
	public void user_tap_on_plus_icon_to_create_new_transaction() {
		transactionsListScreen.clickCreateTransactionIcon();
	}
	
	@Then("user fills the {string} field")
	public void user_fills_the_field(String amount) {
		transactionScreen.enterAmount(amount);
	}
	
	@Then("user click on save button in new transaction page")
	public void user_click_on_save_button() {
		transactionScreen.clickSaveButton();
	}
	
	@Then("user should verify amount field allows only numberic values")
	public void user_should_verify_amount_field_allows_only_numberic_values() {
		transactionScreen.verifyAmountField();
	}
}