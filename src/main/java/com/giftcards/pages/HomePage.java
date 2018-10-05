package com.giftcards.pages;



import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.giftcards.framework.DriverFactory;
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
		driver.navigate().to(website);
		String homePageURL=driver.getCurrentUrl();
		Assert.assertEquals(homePageURL,expectedHomePageURL);
		System.out.println("Homepage URL is: "+homePageURL);
		String homePageTitle=driver.getTitle();
		Assert.assertEquals(homePageTitle,expectedHomePageTitle);
		System.out.println("Homepage title is: "+homePageTitle);
	}
	
	public void hoverOnSignIn() {
		mousefunction.mouseHover(driver, SIGN_IN_HOVER, SIGN_IN_LINK);
	}
	
	public void clickSignIn() {
		assertTrue(SIGN_IN_LINK.isDisplayed());
		mousefunction.mouseClick(driver, SIGN_IN_LINK);
	}
	
	
	
}
