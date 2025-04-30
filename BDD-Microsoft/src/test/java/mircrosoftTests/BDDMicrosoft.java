package mircrosoftTests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.*;
import microsoft.ReadData;
import microsoft.WebsiteAccess;

public class BDDMicrosoft {
	
	WebsiteAccess w = new WebsiteAccess();
	ReadData rd = new ReadData();
	
	@Given("I am in IIS Windows Server Home Page")
	public void launch() {
		w.init();
	}
	
	@When("I click on Internet Information Services button")
	public void click_Internet() {
		w.clickInternet();
	}
	
	@When("I click on Get started with IIS button")
	public void click_Getstarted() {
		w.clickIIS();
	}
	
	@Then("I have reached overview of IIS page and do web scraping on any text element")
	public void overview() throws IOException {
		String[] s = w.webScrap().split(" ");
		assertEquals(rd.ReadExpectedCount(),s.length);
		System.out.println("Length:"+s.length);
	}
	

}
