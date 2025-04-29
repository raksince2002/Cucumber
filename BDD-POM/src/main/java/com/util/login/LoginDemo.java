package com.util.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.register.RegisterDemo;

public class LoginDemo extends RegisterDemo {
	
//	WebDriver wd = new ChromeDriver();
	
	public void launch_login() {
		wd.get("https://awesomeqa.com/ui/index.php?route=account/login");
	}
	
	public void enter_email(String em) {
		wd.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys(em);
	}
	
	public void enter_password(String pw) {
		wd.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pw);
	}
	
	public void click_login() {
		wd.findElement(By.xpath("//input[@value='Login']")).click();		
	}
	
	public String assert_login() throws InterruptedException {
		Thread.sleep(5000);
		WebElement w = wd.findElement(By.xpath("(//div[@id='content']//h2)[2]"));
		return w.getText();
	}
	
	
	
}
