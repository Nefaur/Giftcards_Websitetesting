package com.giftcards.pages;



import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.giftcards.framework.DriverFactory;
import com.giftcards.framework.PropertyReader;
import com.giftcards.utilities.JavaScriptActions;
import com.giftcards.utilities.Mouseactions;

import io.cucumber.datatable.DataTable;


public class LoginPage {
	
	private WebDriver driver;
		
	@FindBy(how=How.XPATH,using="//input[@type='email']") 
	WebElement SIGN_IN_EMAIL_INPUT;
	
	@FindBy(how=How.XPATH,using="//input[@type='password']") 
	WebElement SIGN_IN_PASSWORD_INPUT;
	
	@FindBy(how=How.XPATH,using="//button[@id='submitButtonName']")
	WebElement SIGN_IN_SUBMIT_BUTTON;
	
	@FindBy(how=How.XPATH,using="//div[@class='recaptcha-checkbox-checkmark']")
	WebElement CAPTCHA_CHECKBOX;
	
	@FindBy(how=How.XPATH,using="//li[contains(text(),'You did not enter the correct information for the ')]")
	WebElement CAPTCHA_TEXT;
	
	@FindBy(how=How.XPATH,using="//div[@role='alert']")
	WebElement LOGIN_FAIL_ALERT;
	
	private JavaScriptActions js=new JavaScriptActions();
	private Mouseactions mouseactions=new Mouseactions();
	private String loginPageURL="https://www.giftcards.com/login";
	private String loginPageTitle="Login - GiftCards.com";
	private String username;
	private String password;
	

	public LoginPage(){
		loadLoginPage();
	}
	
	private void loadLoginPage() {
		this.driver=DriverFactory.initialize().getdriver();
		PageFactory.initElements(driver, this);
	}
	
	public void verify_LoginPage() {
		delay(8000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		String expectedLoginPageURL=driver.getCurrentUrl();
		Assert.assertEquals(expectedLoginPageURL, loginPageURL);
		System.out.println("Loginpage URL is: "+expectedLoginPageURL);
		String expectedLoginPageTitle=driver.getTitle();
		Assert.assertEquals(expectedLoginPageTitle, loginPageTitle);
		System.out.println("Loginpage title is: "+expectedLoginPageTitle);
//		if(CAPTCHA_TEXT.isDisplayed()){
//			System.out.println(CAPTCHA_TEXT.getText());
//		}else {
//			driver.navigate().refresh();
//		}
	}
		
	public void enterUsername(String username) {
		delay(2000);
		SIGN_IN_EMAIL_INPUT.sendKeys(username);
		System.out.println("Username is: "+username);
		this.username=username;
	}
	
	public void enterPassword(String password) {
		delay(2000);
		SIGN_IN_PASSWORD_INPUT.sendKeys(password);
		System.out.println("Password is: "+password);
		this.password=password;
	}
	
	public void dataTable(DataTable usercredentials) {
	List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
	SIGN_IN_EMAIL_INPUT.sendKeys(data.get(0).get("Username")); 
	SIGN_IN_PASSWORD_INPUT.sendKeys(data.get(0).get("Password"));
	}
	
	public void clickSubmit() {
//		if(CAPTCHA_TEXT.isDisplayed()){
//		System.out.println(CAPTCHA_TEXT.getText());
//		js.javaClickWebElement(CAPTCHA_CHECKBOX, driver);
//		}
		delay(2000);
		js.javaClickWebElement(SIGN_IN_SUBMIT_BUTTON, driver);
		}
	
	public void validUserClickSubmit() {
		delay(2000);
		js.javaClickWebElement(SIGN_IN_SUBMIT_BUTTON, driver);
		sleeper(8000);
		String expectedLoginPageURL=driver.getCurrentUrl();
		Assert.assertEquals(expectedLoginPageURL, loginPageURL);
		System.out.println(CAPTCHA_TEXT.getText());
		System.out.println(CAPTCHA_CHECKBOX.isDisplayed());
		System.out.println("Captcha detected: Reentering valid user credentials");
		enterUsername(username);
		enterPassword(password);
		mouseactions.mouseClick(driver, CAPTCHA_CHECKBOX);
//		js.javaClickWebElement(CAPTCHA_CHECKBOX, driver);
		sleeper(4000);
		js.javaClickWebElement(SIGN_IN_SUBMIT_BUTTON, driver);
		}
	
	public void failedLogin() {
		assertTrue(LOGIN_FAIL_ALERT.isDisplayed());
		String msg=LOGIN_FAIL_ALERT.getText();
		System.out.println(msg);
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