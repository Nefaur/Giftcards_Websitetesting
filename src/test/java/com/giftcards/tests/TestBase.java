package com.giftcards.tests;


import org.openqa.selenium.WebDriver;
import com.giftcards.framework.DriverFactory;
import com.giftcards.framework.PropertyReader;

public class TestBase {

	protected WebDriver driver=DriverFactory.initialize(PropertyReader.BROWSER_TO_RUN).getdriver();
	
	
	
}
