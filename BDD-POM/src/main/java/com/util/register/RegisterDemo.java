package com.util.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemo {
	
	protected WebDriver wd = new ChromeDriver();
	
	public void init() {
		wd.get("https://awesomeqa.com/ui/index.php?route=account/register");
	}
	
	public void firstname() {
		wd.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("abc");
	}
	
	public void lastname() {
		wd.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("D");
	}
	
	public void email() {
		wd.findElement(By.xpath("//input[@id='input-email']")).sendKeys("abc@gmail.com");
	}
	
	public void telephone() {
		wd.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9876543210");
	}
	
	public void password() {
		wd.findElement(By.xpath("//input[@id='input-password']")).sendKeys("abc@1222");
		wd.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("abc@1222");
	}
	
	public void checkbox() {
		wd.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	
	public void create() {
		wd.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
}
