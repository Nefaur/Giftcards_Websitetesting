package com.giftcards.pages;



import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.giftcards.framework.DriverFactory;
import com.giftcards.framework.PropertyReader;
import com.giftcards.utilities.Mouseactions;



public class HomePage{
	
	private WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//span[@class='my-account']") 
	WebElement SIGN_IN_HOVER;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Sign In')]")
	WebElement SIGN_IN_LINK;
	
	private Mouseactions mousefunction=new Mouseactions();
	private String expectedHomePageURL="https://www.giftcards.com/";
	private String expectedHomePageTitle="Buy Gift Cards, eGift Cards, Visa & Discount | GiftCards.com";
	
	public HomePage() {
		loadHomePage();
	}
	
	private void loadHomePage() {
		this.driver=DriverFactory.initialize().getdriver();
		PageFactory.initElements(driver, this);
	}

	public void goToHomepage(String website) {
		delay(8000);
		driver.navigate().to(website);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String homePageURL=driver.getCurrentUrl();
		Assert.assertEquals(homePageURL,expectedHomePageURL);
		System.out.println("Homepage URL is: "+homePageURL);
		String homePageTitle=driver.getTitle();
		Assert.assertEquals(homePageTitle,expectedHomePageTitle);
		System.out.println("Homepage title is: "+homePageTitle);
	}
	
	public void hoverOnSignIn() {
		delay(4000);
		mousefunction.mouseHover(driver, SIGN_IN_HOVER, SIGN_IN_LINK);
	}
	
	public void clickSignIn() {
		delay(2000);
		assertTrue(SIGN_IN_LINK.isDisplayed());
		mousefunction.mouseClick(driver, SIGN_IN_LINK);
	}
	
	private void sleeper(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void delay(int time) {
		String tbrowser=PropertyReader.BROWSER_TO_RUN;
		switch (tbrowser) {
		
		case "chrome":
			sleeper(time-time);
			break;
		
		case "ch-grid":
			sleeper(time-time);
			break;
			
		case "ch-cloud":
			sleeper(time-time);
			break;
		default:
			sleeper(time);
			break;
	}
	
	
}
}
