package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

public class SampleTesting {
 WebDriver c;
 
 @Parameters({"browser","Url"})
  @BeforeMethod()

  public void beforeMethod(String browser ,String Url) 
  {
	 if (browser.equalsIgnoreCase("Chrome"))
	 { 
	  System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
	  c= new ChromeDriver();
	  c.get(Url);
  }
 }
  @Parameters({"Email","Password"})
  @Test()
  public void Login(String Email, String Password) throws InterruptedException   {
	  c.findElement(By.id("ctl00_cphReg_txtEmailId")).sendKeys(Email);
	  c.findElement(By.id("ctl00_cphReg_txtPassword")).sendKeys(Password);
	  
	  c.findElement(By.id("ctl00_cphReg_btnLogin")).click();
	  c.findElement(By.id("ctl00_cphReg_txtvarify")).sendKeys("");
	  c.findElement(By.id("ctl00_cphReg_btnAuthenticate")).click();
	  
	Thread.sleep(2000);
	c.findElement(By.xpath("//button[contains(text(),'×')]")).click();
	c.findElement(By.xpath("//li[@class='pull-right clearfix responsive-logout']//a[@class='dash-nav-bar']")).click();
	  
}

  @AfterMethod
  public void afterMethod()
  {
	  c.close();
  }
  

}
