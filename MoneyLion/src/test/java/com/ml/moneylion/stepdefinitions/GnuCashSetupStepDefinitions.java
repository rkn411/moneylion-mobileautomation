package com.ml.moneylion.stepdefinitions;

import org.testng.Assert;

import com.ml.moneylion.screen.GNUSetupScreen;
import com.ml.moneylion.screen.accounts.AccountsScreen;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class GnuCashSetupStepDefinitions {
	GNUSetupScreen setupScreen=null;
	public GnuCashSetupStepDefinitions(GNUSetupScreen setupScreen){
		this.setupScreen=setupScreen;
	}
	
	@Given("user launch application")
	public void user_launch_application() {
		setupScreen.isScreenDisplayed();
	}

	@When("user accept application permissions")
	public void user_accept_application_permissions() {
		//setupScreen.gnuCashPreSetup();
	}
	
	@When("user accept application permissions {string} {string} {string}")
	public void user_accept_application_permissions(String currency, String account, String feedbackOptions) {
		setupScreen.gnuCashPreSetup(currency, account, feedbackOptions);
	}

	@Then("user should see the {string} in dash board list")
	public void user_should_see_the_in_dash_board_list(String accountName) {
		Assert.assertTrue(new AccountsScreen().verifyAccount(accountName), "Account with name "+accountName+" does not exist");
	}

	@Then("user should select account from the list")
	public void user_should_select_account_from_the_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user fills the {string} field")
	public void user_fills_the_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user should verify amount field with {string} data")
	public void user_should_verify_amount_field_with_data(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user click on spend button")
	public void user_click_on_spend_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("use select the search button")
	public void use_select_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user should verify the {string} in dash board list")
	public void user_should_verify_the_in_dash_board_list(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}

