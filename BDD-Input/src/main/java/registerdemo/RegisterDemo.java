package registerdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemo {
	
	WebDriver wd = new ChromeDriver();
	
	public void launch() {
		wd.get("https://automationexercise.com/login");
	}
	
	public void enter_name(String n) {
		wd.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(n);
	}
	
	public void enter_email(String e) {
		wd.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys(e);
	}
	
	public String signup(String s1) {
		wd.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		String s = (s1.equals("Fail"))?(wd.findElement(By.xpath("//p[@style='color: red;']")).getText()):wd.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]")).getText();
		return s;
	}
	
	
}
