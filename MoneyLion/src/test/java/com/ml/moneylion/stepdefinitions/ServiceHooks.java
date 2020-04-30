package com.ml.moneylion.stepdefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import com.ml.framework.manager.AppiumServerManager;
import com.ml.framework.support.io.PropertiesFile;
import com.ml.framework.utilities.UtilityMethods;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceHooks {
	private Logger logger = Logger.getLogger(ServiceHooks.class);
	private static AppiumDriver<MobileElement> driver;
	public static String baseDir = System.getProperty("user.dir");
	public static PropertiesFile propFile;
	private AppiumServerManager server;

	public static AppiumDriver<MobileElement> getAppiumDriver() {
		return driver;
	}

	@Before
	public void launchApplication(Scenario sceanrio) throws MalformedURLException {
		String path = baseDir + "/src/main/java/com/ml/moneylion";
		propFile = new PropertiesFile(path + "/config/config.properties");

		String IPAddress = propFile.getProperty("IPAddress");
		String port = propFile.getProperty("port");

		server = new AppiumServerManager();
		server.startServer(IPAddress, port);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, propFile.getProperty("deviceName"));
		capabilities.setCapability(MobileCapabilityType.UDID, propFile.getProperty("udid"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, propFile.getProperty("platformName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, propFile.getProperty("platformVersion"));
		capabilities.setCapability(MobileCapabilityType.APP,
				baseDir + "/src/test/resources/apps/" + propFile.getProperty("appPath"));

		if (propFile.getProperty("appType").equalsIgnoreCase("web")) {
			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, propFile.getProperty("browserName"));
			WebDriverManager.chromedriver().setup();
		} else {
			capabilities.setCapability("appPackage", propFile.getProperty("appPackage"));
			capabilities.setCapability("appActivity", propFile.getProperty("appActivity"));
		}

		try {
			if (propFile.getProperty("appPath").contains(".apk")) {
				driver = new AndroidDriver<MobileElement>(new URL("http://" + IPAddress + ":" + port + "/wd/hub"),
						capabilities);
			} else {
				driver = new IOSDriver<MobileElement>(new URL("http://" + IPAddress + ":" + port + "/wd/hub"),
						capabilities);
			}
			logger.info("Application is launched successfully");
		} catch (SessionNotCreatedException session) {
			session.printStackTrace();
			Assert.assertTrue(false,
					"Unable to create session, please check capabilities or requested port might be in use");
		}
	}

	@After
	public void closeSession(Scenario scenario) {
		UtilityMethods.takeScreenShot(scenario, scenario.getName());
		// driver.removeApp(propFile.getProperty("appPackage"));
		driver.quit();
		server.stopServer();
	}
}
