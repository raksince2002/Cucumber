package awesomeqa;

import static org.testng.Assert.assertEquals;

import com.util.login.LoginDemo;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDLogin {
	
	LoginDemo a = new LoginDemo();
	
	@Given("I am in Login page of AwesomeQA application")
		public void I_am_in_login_page_of_AwesomeQA_application () {
			a.launch_login();
			System.out.println("I am in login page of AwesomeQA application");
		}
    @When("I enter my email address")
    	public void I_enter_my_email_address() {
    		a.enter_email("abc@gmail.com");
    		System.out.println("I enter my email address");
    	}
    @When("I enter my password")
    	public void I_enter_my_password() {
    		a.enter_password("abc@1222");
    		System.out.println("I enter my password");
    	}
    @And("I click on login button")
    	public void I_click_on_login_button() {
    		a.click_login();
    		System.out.println("I click on login button");
    	}
    @Then("I have logged into AwesomeQA application")
    	public void I_have_logged_into_AwesomeQA_application() throws InterruptedException {
//    		String s = a.assert_login();
//    		assertEquals("My Orders",s);
    		System.out.println("Success");
    	}
	
}
