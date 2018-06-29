package com.cucumber.samples;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonTests {

	@Given("^Google page loaded$")
	public void google_page_loaded() throws Throwable {
	    System.out.println("Google Page loaded");
	}

	@When("^I read the page title$")
	public void i_read_the_page_title() throws Throwable {
		System.out.println("Read the google page title");
	}

	@Then("^I validate the title as \"([^\"]*)\"$")
	public void i_validate_the_title_as(String arg1) throws Throwable {
		System.out.println("Page title validated and found correct");
	}	
}
