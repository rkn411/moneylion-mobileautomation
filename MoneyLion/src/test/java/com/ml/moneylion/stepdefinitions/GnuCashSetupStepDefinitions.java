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
	
	@When("user accept application permissions {string} {string} {string}")
	public void user_accept_application_permissions(String currency, String account, String feedbackOptions) {
		setupScreen.gnuCashPreSetup(currency, account, feedbackOptions);
	}

	@Then("user should see the {string} in dash board list")
	public void user_should_see_the_in_dash_board_list(String accountName) {
		Assert.assertTrue(new AccountsScreen().verifyAccount(accountName), "Account with name "+accountName+" does not exist");
	}
	@When("user validates {string} screen title")
	public void user_validates_screen_title(String title) {
		setupScreen.validateTitle(title);
	}
	
	@When("user tap on next button")
	public void user_tap_on_next_button() {
		setupScreen.clickNextButton();
	}
	
}

