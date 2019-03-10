package lmsc_package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Forgot_Password {
	WebDriver c;
	
	 @BeforeMethod 
	  public void brow1serLaunch()
	  {
		 
		  System.setProperty("webdriver.chrome.driver","D:\\Naman\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  c= new ChromeDriver();
		  c.manage().window().maximize();
		  c.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  c.get("https://naman1.lmscheckouttest.com/User/forgotPassword");  
		  //c.manage().deleteAllCookies();
	  }
	 
	 @Test
	 public void forgot() throws InterruptedException
	 {
		 c.findElement(By.xpath("//input[@id='forgotpwdemail']")).sendKeys("naman.gupta@webners.com");
		 Thread.sleep(500);
		 c.findElement(By.xpath("//button[@id='btnforgotpwdsubmit']")).click();
		 String SuccessMessage = c.findElement(By.xpath("//div[@id='flashMessage']")).getText();
		 String ActualMessage ="Password reset email has been sent to naman.gupta@webners.com";
		 Assert.assertEquals(ActualMessage, SuccessMessage);

		 System.out.println(SuccessMessage);
		  	 	 
		 //Switching to email
		 
		 c.navigate().to("https://www.gmail.com");
		 c.findElement(By.xpath("//input[@type='email']")).sendKeys("");
		 c.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 c.findElement(By.xpath("//input[@name='password']")).sendKeys("");
		 
		 Thread.sleep(1000);
		 c.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 Thread.sleep(5000);
		 List<WebElement> Subjects=c.findElements(By.xpath("//span[@class='bog']"));
		 for(int i=0;i<Subjects.size();i++)
		 {
			 //System.out.println(Subjects.size());
			 
			 if(Subjects.get(i).getText().equals("Password reset request for naman1"))
			 {
				 
				 System.out.println("-------Subject of email--------");
				 System.out.println(Subjects.get(i).getText());
				 Subjects.get(i).click();
				 Thread.sleep(500); 
				String handle= c.getWindowHandle();
				System.out.println(handle);
				 c.findElement(By.xpath("//a[starts-with(text(),'https://naman1.')]")).click();
				 

				 for (String handle1 : c.getWindowHandles()) 
				 {
			        	System.out.println(handle1);
			        	c.switchTo().window(handle1);	
			        	
				 }
				 Thread.sleep(5000);			          
				 System.out.println(c.getCurrentUrl());
				 c.findElement(By.xpath("//input[@id='rpnewpassowrd']")).sendKeys("Naman123!");	
				 c.findElement(By.xpath("//button[@id='btnresetpwdsubmit']")).click();
				 
				String SuccessResetPw= c.findElement(By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12']//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12']//h3[1]")).getText();
				System.out.println(SuccessResetPw);
				c.close();
				c.switchTo().window(handle);
				
			 }
			 }
		 
		// https://stackoverflow.com/questions/36198527/how-to-click-on-a-particular-email-from-gmail-inbox-in-selenium	 
	 } 
	 
	 @AfterMethod
	  public void exit() 
	  {
		  c.close();
	  }

}
