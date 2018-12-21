package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

public class SampleTesting {
 WebDriver c;
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  c= new ChromeDriver();
	  c.get("https://www.fundzbazar.com/signin");
	
  }
  
  
  @Test()
  public void SimpleTest() throws InterruptedException   {
	  c.findElement(By.id("ctl00_cphReg_txtEmailId")).sendKeys("namangupta1010@gmail.com");
	  c.findElement(By.id("ctl00_cphReg_txtPassword")).sendKeys("");
	  
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
