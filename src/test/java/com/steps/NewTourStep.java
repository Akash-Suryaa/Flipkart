package com.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTourStep {

	@Given("^User Navigate to newtour page$")
	public void user_Navigate_to_newtour_page() throws InterruptedException {
		NewTourTest.open_newtour_page();

	}

	@Given("^click on sign_on$")
	public void click_on_sign_on() throws InterruptedException {
		NewTourTest.click_sing_on();
	}

	@Then("^validate sign in link is working$")
	public void validate_sign_in_link_is_working() {
		NewTourTest.verify_sing_on();
	}

	@Then("^click on regitstration$")
	public void click_on_regitstration() throws InterruptedException {
		System.out.println("Regstration Button");
		NewTourTest.click_registration();

	}

	@Then("^validate regitstration link is working$")
	public void validate_regitstration_link_is_working() {
	}

	@Then("^click on support and validate support$")
	public void click_on_support_and_validate_support() throws InterruptedException {
		System.out.println("Support");
		NewTourTest.click_support();

	}

	@Then("^click on contact and validate contact$")
	public void click_on_contact_and_validate_contact() throws InterruptedException {
		System.out.println("conatct");
		NewTourTest.click_contact();
	}

	@When("^user login successfully$")
	public void user_login_successfully() throws InterruptedException {
		System.out.println("user_login_successfully");
		NewTourTest.validlogin();

	}

	@Then("^serach flight$")
	public void serach_flight() throws InterruptedException {
		System.out.println("serach_flight");
		NewTourTest.search_flight();
	}

	@Then("^click on sign out$")
	public void click_on_sign_out() throws InterruptedException 
	{
		System.out.println("sign_out");
		NewTourTest.sign_out();
		
	}

}
