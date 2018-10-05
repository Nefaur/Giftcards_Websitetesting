package com.giftcards.framework;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;


public class DriverFactory {
	
	private ThreadLocal<WebDriver> driverBase = new ThreadLocal<WebDriver>();

	private static DriverFactory instance=null;
	private static String Hub_URL= "http://192.168.137.1:4444/wd/hub";

	public static final String USERNAME = "nefaurbhuiyan1";
	public static final String AUTOMATE_KEY = "YBtZTy2e8jPmbemabR4t";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
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
			
			if(browser.equalsIgnoreCase("chrome")) {
				ChromeDriverManager.getInstance().arch32().setup();;
				WebDriver driver=new ChromeDriver();
				instance.driverBase.set(driver);
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				FirefoxDriverManager.getInstance().arch32().setup();
				FirefoxOptions options = new FirefoxOptions();
				options.setCapability("marionette", true);
				WebDriver driver = new FirefoxDriver(options);
				instance.driverBase.set(driver);
			}
			else if(browser.equalsIgnoreCase("ie")) {
				InternetExplorerDriverManager.getInstance().arch32().setup();
				WebDriver driver=new InternetExplorerDriver();
				instance.driverBase.set(driver);
			}
			else if(browser.equalsIgnoreCase("ch-grid")) {
				DesiredCapabilities caps = new DesiredCapabilities();
		         caps.setPlatform(Platform.ANY);
		         caps.setBrowserName("chrome");
		         try {
					WebDriver driver=new RemoteWebDriver(new URL(Hub_URL), caps);
					instance.driverBase.set(driver);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}
			else if(browser.equalsIgnoreCase("ff-grid")) {
				DesiredCapabilities caps = new DesiredCapabilities();
		         caps.setPlatform(Platform.ANY);
		         caps.setBrowserName("firefox");
		         caps.setCapability("marionette", true);
		         try {
					WebDriver driver=new RemoteWebDriver(new URL(Hub_URL), caps);
					instance.driverBase.set(driver);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}
			else if(browser.equalsIgnoreCase("ie-grid")) {
				DesiredCapabilities caps = new DesiredCapabilities();
		         caps.setPlatform(Platform.ANY);
		         caps.setBrowserName("internet explorer");
		         caps.setVersion("10");
		         try {
					WebDriver driver=new RemoteWebDriver(new URL(Hub_URL), caps);
					instance.driverBase.set(driver);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}else if(browser.equalsIgnoreCase("ch-cloud")) {
				DesiredCapabilities caps = new DesiredCapabilities();
			    caps.setCapability("browser", "Chrome");
			    caps.setCapability("browser_version", "62.0");
			    caps.setCapability("os", "Windows");
			    caps.setCapability("os_version", "10");
			    caps.setCapability("resolution", "2048x1536");

			    try {
					WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
					instance.driverBase.set(driver);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
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
		driverBase.set(null);
	}
	
	}
	
	
	

