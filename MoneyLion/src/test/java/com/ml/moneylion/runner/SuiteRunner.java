package com.ml.moneylion.runner;

import com.ml.framework.manager.CucumberFeatureManager;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		monochrome=true,
		strict = true,
		features = "src/test/resources/features",
		glue = {"com.ml.moneylion.stepdefinitions"},
		tags = {"@fieldsValidations"},
		plugin = {"html:reports/cucumber-reports/cucumber-pretty",
				"json:reports/cucumber-reports/cucumber-html-report.json",
				"usage:reports/cucumber-reports/cucumber-usage.json",
				"rerun:reports/cucumber-reports/failedscenarios.txt" })

public class SuiteRunner extends CucumberFeatureManager{

}
