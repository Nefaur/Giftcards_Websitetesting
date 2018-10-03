package com.giftcards.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.giftcards.framework.DriverFactory;
import com.giftcards.utilities.JavaScriptActions;


public class LoginPage {
	
	private WebDriver driver;
	
	private JavaScriptActions js=new JavaScriptActions();
	
	@FindBy(how=How.XPATH,using="//input[@type='email']") 
	WebElement SIGN_IN_EMAIL_INPUT;
	
	@FindBy(how=How.XPATH,using="//input[@type='password']") 
	WebElement SIGN_IN_PASSWORD_INPUT;
	
	@FindBy(how=How.XPATH,using="//button[@id='submitButtonName']")
	WebElement SIGN_IN_SUBMIT_BUTTON;
	
	private String loginPageURL="https://www.giftcards.com/login";
	private String loginPageTitle="Login - GiftCards.com";
	

	public LoginPage(){
		loadLoginPage();
	}
	
	private void loadLoginPage() {
		this.driver=DriverFactory.initialize().getdriver();
		PageFactory.initElements(driver, this);
	}
	
	public void verify_LoginPage() {
		String expectedLoginPageURL=driver.getCurrentUrl();
		Assert.assertEquals(expectedLoginPageURL, loginPageURL);
		System.out.println("Loginpage URL is: "+expectedLoginPageURL);
		String expectedLoginPageTitle=driver.getTitle();
		Assert.assertEquals(expectedLoginPageTitle, loginPageTitle);
		System.out.println("Loginpage title is: "+expectedLoginPageTitle);
	}
		
	public void enterUsername(String username) {
		SIGN_IN_EMAIL_INPUT.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		SIGN_IN_PASSWORD_INPUT.sendKeys(password);
	}
	
	public void clickSubmit() {
		js.javaClickWebElement(SIGN_IN_SUBMIT_BUTTON, driver);
	}
	
}
