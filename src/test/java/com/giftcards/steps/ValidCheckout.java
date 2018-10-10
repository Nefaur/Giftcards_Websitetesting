package com.giftcards.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.giftcards.pages.HomePage;
import com.giftcards.pages.LoginPage;
import com.giftcards.pages.MemberPage;
import com.giftcards.pages.PageManager;
import com.giftcards.tests.ScriptBase;
import com.giftcards.tests.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ValidCheckout extends TestBase {

	private ScriptBase base=new ScriptBase();
	private HomePage home=PageManager.getInstance().getHome();
	private LoginPage login=PageManager.getInstance().getLogin();
	private MemberPage member=PageManager.getInstance().getMember();
	
	@Given("Existing Valid User opens browser")
	public void existing_Valid_User_opens_browser() {
		base.setUp();
	}

	@When("Existing Valid User goes to {string} website")
	public void existing_Valid_User_goes_to_website(String website) {
		home.goToHomepage(website);
	}

	@Then("Existing Valid User hovers to sign_in_link")
	public void existing_Valid_User_hovers_to_sign_in_link() {
		home.hoverOnSignIn();
	}

	@Then("Existing Valid User clicks sign_in_link")
	public void existing_Valid_User_clicks_sign_in_link() {
		home.clickSignIn();
	}

	@Then("Existing Valid User enters username and password in login text fields")
	public void existing_Valid_User_enters_username_and_password_in_login_text_fields(DataTable usercredentials) {
		login.verify_LoginPage();
		login.dataTable(usercredentials);
	}

	@Then("Existing Valid User clicks on submit button")
	public void existing_Valid_User_clicks_on_submit_button() {
		login.clickSubmit();
	}

	@Then("Existing Valid User is taken to member page")
	public void existing_Valid_User_is_taken_to_member_page() {
		member.verify_MemberPage();
		member.verify_Member();
	}

	@Then("Existing Valid User enters text in search field")
	public void existing_Valid_User_enters_text_in_search_field(DataTable dataTable) {
	}

	@Then("Logged in User chooses the selection from search box field")
	public void logged_in_User_chooses_the_selection_from_search_box_field() {
	}

	@Then("Logged in User filters the selection by choosing Brand and subtype")
	public void logged_in_User_filters_the_selection_by_choosing_Brand_and_subtype() {
	}

	@Then("Logged in User clicks on first selection from search result")
	public void logged_in_User_clicks_on_first_selection_from_search_result() {
	}

	@Then("Logged in User enters personal details for purchase")
	public void logged_in_User_enters_personal_details_for_purchase(DataTable dataTable) {
	}

	@Then("Logged in User logouts")
	public void logged_in_User_logouts() {
		member.logout();
	}

	@Then("Logged out User closes browser")
	public void logged_out_User_closes_browser() {
		PageManager.getInstance().closePages();
		base.tearDown();
	}

	
}
