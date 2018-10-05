package com.giftcards.pages;





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



public class MemberPage {

	private WebDriver driver;
	
	@FindBy(how=How.CLASS_NAME,using="logged-in-name")
	static WebElement loggedinuser;
	
	@FindBy(how=How.LINK_TEXT,using="Log out") 
	WebElement LOGOUT;
	
	private String expectedMemberPageURL="https://www.giftcards.com/member";
	private String expectedMemberPageTitle="Previous Orders | GiftCards.com";
	LoginPage logPage=new LoginPage();
	JavaScriptActions js=new JavaScriptActions();

	
	public MemberPage() {
		getMemberPage();
	}
		
	private void getMemberPage() {
		this.driver=DriverFactory.initialize().getdriver();
		PageFactory.initElements(driver, this);
	}
	
	public void verify_MemberPage() {
		delay(8000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String memberPageURL=driver.getCurrentUrl();
		Assert.assertEquals(expectedMemberPageURL, memberPageURL);
		System.out.println("Memberpage URL is: "+memberPageURL);
		String memberPageTitle=driver.getTitle();
		Assert.assertEquals(expectedMemberPageTitle, memberPageTitle);
		System.out.println("Memberpage title is: "+memberPageTitle);
	}

	public void verify_Member(){
		delay(2000);
		String user=PropertyReader.USERNAME.toLowerCase();
		String userfound=loggedinuser.getText().toLowerCase();
		
		String split=""; //blank string to store loop results.
		for(int i=0; i<=4; i++){
			split=split+user.charAt(i); 
	
		}System.out.println(split);
		
		String splituser=""; //blank string to store loop results.
		for(int i=0; i<=4; i++){
			splituser=splituser+userfound.charAt(i);
		}System.out.println(splituser);
		Assert.assertEquals(split, splituser);
		}
	
	public void logout() {
		delay(2000);
		js.javaClickWebElement(LOGOUT, driver);
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


