package com.giftcards.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.giftcards.framework.DriverFactory;

public class SearchFunction {
	
	private WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='search_terms']")
	WebElement SEARCH;
	
	public SearchFunction() {
		loadSearchFunction();
	}
	
	private void loadSearchFunction() {
		this.driver=DriverFactory.initialize().getdriver();
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearch(String search) {
		SEARCH.sendKeys(search);
	}
	
}
