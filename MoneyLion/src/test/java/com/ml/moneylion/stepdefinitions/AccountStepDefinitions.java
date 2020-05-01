package com.ml.moneylion.stepdefinitions;

import com.ml.moneylion.screen.accounts.AccountsScreen;
import com.ml.moneylion.screen.accounts.CreateAccountScreen;

import io.cucumber.java.en.Then;

public class AccountStepDefinitions {
	
	private AccountsScreen accountScreen;
	private CreateAccountScreen createAccount;
	public AccountStepDefinitions(AccountsScreen accountScreen,CreateAccountScreen createAccount) {
		this.accountScreen=accountScreen;
		this.createAccount=createAccount;
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
}