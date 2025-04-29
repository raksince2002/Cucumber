package com.features.automationex;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;

import com.lib.automationex.AutomationEx;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDInvalid {
	
	AutomationEx a = new AutomationEx();
	
	@Given("I am in the Login page of AwesomeQA application")
	public void login_page () {
		a.launch_login();
		System.out.println("I am in login page of AwesomeQA application");
	}
	@When("I enter invalid email address")
		public void I_enter_invalid_email_address() {
			a.enter_email("rakesh@gmail.com");
			System.out.println("I enter my email address");
		}
	@When("I enter invalid password")
		public void I_enter_invalid_password() {
			a.enter_password("80tyopmh");
			System.out.println("I enter my password");
		}
	@And("Login button is clicked")
		public void login_button() {
			a.click_login();
			System.out.println("I click on login button");
		}
	@Then("Error message is displayed")
		public void Error_message_is_displayed() throws InterruptedException {
			String s = a.assert_invalidLogin();
			assertEquals("Warning: No match for E-Mail Address and/or Password.",s);
			System.out.println(s);
		}
	
}
