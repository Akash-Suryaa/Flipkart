package com.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends BrowserLunch {

	@Given("^User navigate to flipkart page$")
	public void user_navigate_to_flipkart_page() {
		LoginTest.open_flipkart_page();

	}

	@When("^entered username and password$")
	public void entered_username_and_password() {

		LoginTest.enterDetails();
	}

	@Then("^succefully logged in$")
	public void succefully_logged_in() {
		LoginTest.click_on_login();
	}

	@Given("^click on Electronics and Check the all product\\.$")
	public void click_on_Electronics_and_Check_the_all_product() throws InterruptedException {

		LoginTest.check_electronic_product();
	}

	@When("^user click on home button$")
	public void user_click_on_home_button() throws InterruptedException {
		LoginTest.home_test();
	}

	@Then("^check label , button, and links on home pages$")
	public void check_label_button_and_links_on_home_pages() {
	}

	@Then("^close browser$")
	public void close_browser() {
		LoginTest.close_driver();
	}

}
