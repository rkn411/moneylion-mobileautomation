package com.ml.moneylion.runner;

import com.ml.framework.manager.CucumberFeatureManager;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		monochrome=true,
		strict = true,
		features = "src/test/resources/features",
		glue = {"com.ml.moneylion.stepdefinitions"},
		tags = {"@aplhaNumeric"},
		plugin = {"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/cucumber-html-report.json",
				"usage:target/cucumber-reports/cucumber-usage.json",
				"rerun:target/cucumber-reports/failedscenarios.txt" })

public class SuiteRunner extends CucumberFeatureManager{

}
