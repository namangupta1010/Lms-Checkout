package lmsc_package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Logout
{
	WebDriver c;
	

	public void login_Credentials(String email,String password)
	{
		  c.findElement(By.xpath("//input[@id='UserUsername']")).sendKeys(email);
		  c.findElement(By.xpath("//input[@id='UserPassword']")).sendKeys(password);
		  c.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Parameters("browser")
	 @BeforeMethod 
	  public void browserLaunch(String browser)
	  {
		 if(browser.equalsIgnoreCase("firefox"))
		 {
		  System.setProperty("webdriver.gecko.driver","D:\\Naman\\Selenium\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		  c= new FirefoxDriver();
		  c.manage().window().maximize();
		  c.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  c.get("https://naman1.lmscheckouttest.com/");  
		  c.navigate().to("https://naman1.lmscheckouttest.com/User/login");
		  c.manage().deleteAllCookies();
	  }
		 else if (browser.equalsIgnoreCase("chrome"))
		 { 
			 System.setProperty("webdriver.chrome.driver","D:\\Naman\\Selenium\\chromedriver_win32\\chromedriver.exe");
			  c= new ChromeDriver();
			  c.manage().window().maximize();
			  c.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  c.get("https://naman1.lmscheckouttest.com/");  
			  c.navigate().to("https://naman1.lmscheckouttest.com/User/login");
			  c.manage().deleteAllCookies();
		 }
			 
	  }
	 
	@Test
	public void log_out() 
	{
		login_Credentials("mahesh.kumar@webners.com", "Mahesh123!");
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(c, 20);
		WebElement Element= wait.until(ExpectedConditions.elementToBeClickable(c.findElement(By.xpath("//a[@href='/User/logout']"))));
		
		Element.click();
		
		String Expected_LoginText= c.findElement(By.xpath("//a[@href='https://naman1.lmscheckouttest.com/User/login']")).getText();
		String Actual_logintext = "Log In";
		
		Assert.assertEquals(Actual_logintext,Expected_LoginText);
		System.out.println(Expected_LoginText);
		
	}
	
	@AfterMethod
	  public void exit() 
	  {
		  c.close();
	  }
	
	
}
