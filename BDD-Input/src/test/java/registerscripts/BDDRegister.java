package registerscripts;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import registerdemo.RegisterDemo;

public class BDDRegister {
	
	RegisterDemo r = new RegisterDemo();
	
	@Given("I am in login and signup page of the application")
	public void I_am_in_login_and_signup_page_of_the_application() {
		r.launch();
	}
	
	@When("^I enter the (.*$)")
	public void I_enter_the_name(String name) {
		r.enter_name(name);
	}
	
	@When("^I give the email address as (.*$)")
	public void I_enter_the_email(String email) {
		r.enter_email(email);
	}
	
	@Then("^I verify the (.*$)")
	public void I_verify_the_status(String status) {
		String verify = r.signup(status);
		assertEquals((status.equals("Fail")?"Email Address already exist!":"ENTER ACCOUNT INFORMATION"),verify);
		System.out.println(verify);
	}

}
