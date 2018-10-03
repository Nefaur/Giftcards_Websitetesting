package com.giftcards.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class PropertyReader {
	
	private static PropertyReader instance = null;
	private Properties properties = new Properties();
	private Map<String, String> envVariable = System.getenv();
	
	private PropertyReader() {
		load();
	}
	
	public static PropertyReader getInstance() {
		if(instance == null) {
			instance = new PropertyReader();
		}
		return instance;
	}

	public String getProperty(String key) {
		String value = properties.getProperty(key);
		return value;
	}
	public String getEnvProperty(String key) {
		String value = null;
		if(envVariable.containsKey(key)) {
			value = envVariable.get(key);
		}
		return value;
	}
	private void load(){	
		
		InputStream input = null;

		try {

			input = new FileInputStream("I:\\eclipse-workspace\\giftcards.bdd\\src\\main\\resources\\TestResource\\Config.properties");
			// load a properties file
			properties.load(input);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		
	}
	
	public static String BROWSER_TO_RUN=PropertyReader.getInstance().getProperty("browser");
	public static String USERNAME=PropertyReader.getInstance().getProperty("username");
	public static String PASSWORD=PropertyReader.getInstance().getProperty("password");
}
