package com.giftcards.framework;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;


public class DriverFactory {
	
	private ThreadLocal<WebDriver> driverBase = new ThreadLocal<WebDriver>();

	private static WebDriver driver=null;
	private static DriverFactory instance=null;
	
	private DriverFactory() {
		
	}
	
	public static DriverFactory initialize() {
				
		return initialize(null);
	}
	
	public static DriverFactory initialize(String browser) {
		if(instance == null) {
			instance = new DriverFactory();
		}
		
		if(browser == null) {
			browser = "";
		}
		
		if(instance.driverBase.get() == null) {
			
			if(PropertyReader.BROWSER_TO_RUN.equalsIgnoreCase("chrome")) {
				ChromeDriverManager.getInstance().arch32().setup();;
				WebDriver driver=new ChromeDriver();
				instance.driverBase.set(driver);
			}else if(PropertyReader.BROWSER_TO_RUN.equalsIgnoreCase("firefox")) {
				FirefoxDriverManager.getInstance().arch32().setup();
				FirefoxOptions options = new FirefoxOptions();
				options.setCapability("marionette", true);
				WebDriver driver = new FirefoxDriver(options);
				instance.driverBase.set(driver);
			}			
		}
			
		return instance;
	}
	
	public WebDriver getdriver() {
			
		return driverBase.get();
	}
	
	public void tearDown() {
		driverBase.get().close();
		driverBase.get().quit();
		driverBase.remove();
		driver=null;
	}
	
	}
	
	
	

