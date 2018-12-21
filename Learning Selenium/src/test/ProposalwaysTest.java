package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;


public class ProposalwaysTest {
	WebDriver c;
 
  @BeforeMethod
  public void BrowserLaunch() {
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  c= new ChromeDriver();
	  c.get("https://www.proposalways.com/");
	  c.manage().deleteCookieNamed("https://www.proposalways.com");
  }
  @Test(priority=1,groups="login")
  public void login () 
  {
	  c.get("https://www.proposalways.com/userLogin"); 
  c.findElement(By.id("user_email")).sendKeys("naman.gupta@webners.com");
  c.findElement(By.id("user_password")).sendKeys("abc123");
  c.findElement(By.id("loginButton")).click();
  
 

 // c.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);	
  //Thread.sleep("5000");
  }	
  /*
  @Test(priority=2,groups="login")
  public void AgainCheckinglogin () 
  {
	  c.get("https://www.proposalways.com/userLogin");
	  c.findElement(By.id("user_email")).sendKeys("umang1.pasricha@webners.com");
	  c.findElement(By.id("user_password")).sendKeys("abc123");
	  c.findElement(By.id("loginButton")).click();
	  
  }
  */
  @AfterMethod
  public void logout()  {
	  WebDriverWait wait=new WebDriverWait(c, 200000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Help')]")));
	  c.findElement(By.id("navbarDropdownMenuLink")).click();
	  c.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	  c.close();
  }

}
