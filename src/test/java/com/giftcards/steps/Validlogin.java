package com.giftcards.steps;


import com.giftcards.pages.HomePage;
import com.giftcards.pages.LoginPage;
import com.giftcards.pages.MemberPage;
import com.giftcards.pages.PageManager;
import com.giftcards.tests.ScriptBase;
import com.giftcards.tests.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Validlogin extends TestBase{
		
	private ScriptBase base=new ScriptBase();
	private HomePage home=PageManager.getInstance().getHome();
	private LoginPage login=PageManager.getInstance().getLogin();
	private MemberPage member=PageManager.getInstance().getMember();
	
	
	@Given("User opens browser")
	public void user_opens_browser() {
		base.setUp();
	}

	@When("User goes to {string} website")
	public void user_goes_to_website(String website) {
		home.goToHomepage(website);
	}

	@Then("User hovers to sign_in_link")
	public void user_hovers_to_sign_in_link() {
		home.hoverOnSignIn();
	}

	@Then("User clicks sign_in_link")
	public void user_clicks_sign_in_link() {
		home.clickSignIn();
	}

	@Then("User enters {string} as username")
	public void user_enters_as_username(String username) {
		login.verify_LoginPage();
		login.enterUsername(username);
	}
	
	@Then("User enters {string} as password")
	public void user_enters_as_password(String password) {
		login.enterPassword(password);
	}

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		login.validUserClickSubmit();
	}

	@Then("User is taken to member page")
	public void user_is_taken_to_member_page() {
		member.verify_MemberPage();
		member.verify_Member();
	}

	@Then("User logsout")
	public void user_logsout() {
		member.logout();
	}
	
	@Then("User closes browser")
	public void user_closes_browser() {
		PageManager.getInstance().closePages();
//		base.tearDown();
	}
	
	
}
