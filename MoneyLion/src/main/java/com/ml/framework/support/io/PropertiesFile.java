package com.ml.framework.support.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	private Properties properties;

	/**
	 * Load the properties file information
	 * 
	 * @param filePath
	 *            - Path of the properties file
	 */
	public PropertiesFile(String filePath) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Config.properties file is not found at " + filePath
					+ ", please make sure config exist at specified location");
		}
	}

	/**
	 * Get the value of key by reading properties file
	 * 
	 * @param name
	 *            - keyName
	 */
	public String getProperty(String name) {
		return properties.getProperty(name);
	}

}
