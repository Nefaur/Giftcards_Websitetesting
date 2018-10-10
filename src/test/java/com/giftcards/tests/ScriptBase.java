package com.giftcards.tests;



import java.util.concurrent.TimeUnit;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class ScriptBase extends TestBase{

		
	@Before
	public void setUp() {
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
	try {
		driver.close();
		driver.quit();
		driver=null;
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
	
	
	

