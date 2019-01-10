package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Learning {
	
	WebDriver c;
	@BeforeMethod

	  public void beforeMethod() 
	  {
		  
		  System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		  c= new ChromeDriver();
		  c.get("http://localhost/wordpress/");

}
	
	@Test
	
	public void test() throws InterruptedException
	{
		c.findElement(By.xpath("//a[@class='signin-link open-signin-modal']")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("//div[@class='inner-form signin-form']//input[@id='user_login']")).sendKeys("test_1");
		c.findElement(By.xpath("//div[@class='inner-form signin-form']//input[@type='password']")).sendKeys("abc123");
		c.findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();
		Thread.sleep(1000);
		String CurrentUrl =c.getCurrentUrl();
		System.out.println(CurrentUrl);
		
		Assert.assertEquals( CurrentUrl,"http1://localhost/wordpress/dashboard/");
		
		c.findElement(By.xpath("//img[@src='http://localhost/wordpress/wp-content/themes/microjobengine/assets/img/logo.png']")).click();
		
	}
	@Test
	
	public void test1() throws InterruptedException
	{
		SoftAssert obj = new SoftAssert();
		c.findElement(By.xpath("//a[@class='signin-link open-signin-modal']")).click();
		Thread.sleep(1000);
		c.findElement(By.xpath("//div[@class='inner-form signin-form']//input[@id='user_login']")).sendKeys("test_1");
		c.findElement(By.xpath("//div[@class='inner-form signin-form']//input[@type='password']")).sendKeys("abc123");
		c.findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();
		Thread.sleep(1000);
		String CurrentUrl =c.getCurrentUrl();
		System.out.println(CurrentUrl);
		
		obj.assertEquals( CurrentUrl,"http1://localhost/wordpress/dashboard/");
		
		c.findElement(By.xpath("//img[@src='http://localhost/wordpress/wp-content/themes/microjobengine/assets/img/logo.png']")).click();
		obj.assertAll();
	}
	
	
}