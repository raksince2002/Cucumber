package microsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteAccess {
	
	WebDriver wd = new ChromeDriver();
	
	public void init() {
		wd.get("https://webservices.ignou.ac.in/");
	}
	
	public void clickInternet() {
		wd.findElement(By.xpath("//a[@href='http://go.microsoft.com/fwlink/?linkid=66138&clcid=0x409']")).click();
	}
	
	public void clickIIS() {
		wd.findElement(By.xpath("//a[contains(text(),'Get Started with IIS')]")).click();
	}
	
	public String webScrap() {
		return wd.findElement(By.xpath("//p[contains(text(),'Deploy and manage Web sites and applications across large farms of Web servers from a central place.')]")).getText();
	}
	
}
