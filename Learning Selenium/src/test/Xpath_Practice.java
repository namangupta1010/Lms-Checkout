package test;

import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver c = new ChromeDriver();
		c.get("https://www.proposalways.com/userLogin");
		/*c.findElement(By.xpath("//input[@id='username']")).sendKeys("naman.gupta@webners.com");
		c.findElement(By.xpath("//input[@name='pw']")).sendKeys("abcd1234");
		c.findElement(By.xpath("//input[@id='Login']")).click();
*/		
		/*c.get("https://www.google.com/intl/en-GB/gmail/about/");
		c.findElement(By.xpath("//div[@class='gmail-nav__logo gmail-logo']")).click();
		//c.findElement(By.linkText("SIGN IN")).click();
		 
*/	
		//c.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("naman.gupta@webners.com");	
		Point loc=c.findElement(By.xpath("//input[@id='user_email']")).getLocation();
		System.out.println(loc.x);
		System.out.println(loc.y);
		c.navigate().to("https://www.proposalways.com/userRegistration");
		String Url=c.getCurrentUrl();
		System.out.println(Url);
	
	}

}
