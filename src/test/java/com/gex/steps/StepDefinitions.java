package com.gex.steps;

import com.PageObject.Homepage;
import com.PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {


	Homepage homepage;
	LoginPage loginPage;

	@Given("^I openGex$")
	public void i_openGex() {
		homepage.open();
	}

	@When("^I click on My invoices$")
	public void i_click_on_My_invoices() {
		homepage.navigateToMyInvoices();
	}

	@And("^I select the first invoice$")
	public void i_select_the_first_invoice() {
		homepage.selectFirstInvoice();
	}

	@Then("^I am redirected to the contents of the invoice$")
	public void i_am_redirected_to_the_contents_of_the_invoice() {

	}

	
	
	
	
}
