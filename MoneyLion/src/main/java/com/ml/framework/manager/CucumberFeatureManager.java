package com.ml.framework.manager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

/**
 * Base for cucumber runner Picks up all options which are mentioned in cucumber
 * runner file and run scenarios based on tag notations given in runner file
 * Customize cucumber report after completion of execution
 *
 */
public class CucumberFeatureManager {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
	public void runScenario(PickleEventWrapper pickleWrapper, CucumberFeatureWrapper featureWrapper) throws Throwable {
		testNGCucumberRunner.runScenario(pickleWrapper.getPickleEvent());
	}

}
