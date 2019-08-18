package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

	@Given("^User is on Netbanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {

		// Code to navigate to app url
		System.out.println("Navigating ....");

	}

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {

		System.out.println("Username :: " + strArg1);
		System.out.println("Password :: " + strArg2);
	}

	

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {

		// Code for home page validation

		System.out.println("home page ....");

	}

	@And("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are_something(String strArg1) throws Throwable {
		System.out.println("Cards are getting displayed ::" + strArg1);
	}

}