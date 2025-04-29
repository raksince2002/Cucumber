package awesomeqa;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.register.RegisterDemo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDRegister {
	
	RegisterDemo a = new RegisterDemo();
	
	@Given("I am in Register page of AwesomeQA application")
	public void I_am_in_Register_page_of_AwesomeQA_application () {
		a.init();
		System.out.println("I am in Register page of AwesomeQA application");
	}
	@When("I enter my firstname")
	public void I_enter_my_firstname() {
		a.firstname();
		System.out.println("I enter my firstname");
	}
	@When("I enter my lastname")
	public void I_enter_my_lastname() {
		a.lastname();
		System.out.println("I enter my lastname");
	}
	@When("I enter email address")
		public void I_enter_my_email_address() {
			a.email();
			System.out.println("I enter my email address");
		}
	@When("I enter my telephone number")
	public void I_enter_my_telephone_number() {
		a.telephone();
		System.out.println("I enter my telephone number");
	}
	@When("I enter my password and confirm it")
		public void I_enter_my_password_and_confirm_it() {
			a.password();
			System.out.println("I enter my password and confirm it");
		}
	@When("I accept the Privacy Policy")
	public void I_accept_the_Privacy_Policy() {
		a.checkbox();
		System.out.println("I accept Privacy policy");
	}
	@And("I click on Register button")
		public void I_click_on_Register_button() {
			a.create();
			System.out.println("I click on Register button");
		}
	@Then("I have created my Account successfully")
		public void I_have_created_my_Account_successfully() throws InterruptedException {
			
			System.out.println("Success");
		}
	
}
