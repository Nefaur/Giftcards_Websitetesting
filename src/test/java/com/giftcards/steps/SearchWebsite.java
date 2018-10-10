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
import io.cucumber.datatable.DataTable;

public class SearchWebsite extends TestBase{
	
	private ScriptBase base=new ScriptBase();
	private HomePage home=PageManager.getInstance().getHome();
	private LoginPage login=PageManager.getInstance().getLogin();
	private MemberPage member=PageManager.getInstance().getMember();

	@Given("Valid User opens browser")
	public void valid_User_opens_browser() {
		base.setUp();
	}

	@When("Valid User goes to {string} website")
	public void valid_User_goes_to_website(String website) {
		home.goToHomepage(website);
	}

	@Then("Valid User hovers to sign_in_link")
	public void valid_User_hovers_to_sign_in_link() {
		home.hoverOnSignIn();
	}

	@Then("Valid User clicks sign_in_link")
	public void valid_User_clicks_sign_in_link() {
		home.clickSignIn();
	}

	@Then("Valid User enters username and password in login text fields")
	public void valid_User_enters_username_and_password_in_login_text_fields(DataTable dataTable) {
		login.verify_LoginPage();
	}

	@Then("Valid User clicks on submit button")
	public void valid_User_clicks_on_submit_button() {
		login.clickSubmit();
	}

	@Then("Valid User is taken to member page")
	public void valid_User_is_taken_to_member_page() {
		member.verify_MemberPage();
		member.verify_Member();
	}

	@Then("Valid User enters text in search field")
	public void valid_User_enters_text_in_search_field(DataTable dataTable) {

	}

	@Then("Valid User chooses the selection from search box field")
	public void valid_User_chooses_the_selection_from_search_box_field() {

	}

	@Then("Valid User filters the selection by choosing Brand and subtype")
	public void valid_User_filters_the_selection_by_choosing_Brand_and_subtype() {

	}

	@Then("Valid User clicks on first selection from search result")
	public void valid_User_clicks_on_first_selection_from_search_result() {

	}

	@Then("Valid User logouts")
	public void valid_User_logouts() {

	}

	@Then("Valid User closes browser")
	public void valid_User_closes_browser() {
		PageManager.getInstance().closePages();
		base.tearDown();
	}
}
