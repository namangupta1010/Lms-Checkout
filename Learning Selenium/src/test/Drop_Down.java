package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.get("http://output.jsbin.com/osebed/2");
		
	/*c.findElement(By.id("email")).sendKeys("gopi.chand@webners.com");
	c.findElement(By.id("passwd")).sendKeys("abc123");
		Select d=new Select(c.findElement(By.id("user[type]")));
		d.selectByVisibleText("Staff");
		c.findElement(By.id("signIn")).click();*/
		Select d=new Select(c.findElement(By.id("fruits")));
		d.selectByVisibleText("Orange");
		d.selectByIndex(1);
		d.selectByIndex(0);

		
	}
  
} 
