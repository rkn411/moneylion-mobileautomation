package com.ml.framework.manager;

import java.io.File;

import org.testng.log4testng.Logger;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/**
 * This class contains utility methods for starting and stopping appium server
 * 
 * @author rk
 *
 */
public class AppiumServerManager {
	private Logger logger = Logger.getLogger(AppiumServerManager.class);
	private static AppiumDriverLocalService service;

	/**
	 * Start appium server on user defined IP Address and port
	 * 
	 * @param ipAddress
	 *            - IP Address where appium server should run
	 * @param port
	 *            - Port on which server has to run
	 */
	public void startServer(String ipAddress, String port) {
		AppiumServiceBuilder builder = new AppiumServiceBuilder()
				.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
		        .withIPAddress(ipAddress);
		builder.usingPort(Integer.parseInt(port));
		service = AppiumDriverLocalService.buildService(builder);
		service.start();
		logger.info("Appium Server is started successfully");
	}

	private boolean checkServerRunningStatus() {
		return service.isRunning();
	}

	/**
	 * Stop appium service
	 */
	public void stopServer() {
		service.stop();
		logger.info("Appium Server is stopped successfully");
	}
}
