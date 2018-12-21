package lmsc_package;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.sql.Statement;

public class Create_Account 
{
	WebDriver c;
	String Lastname     ="test";
	String Firstname    ="Selenium";
	String EmailAddress ="Selenium@mailinator.com";
	String PhoneNumber  ="988902898";
	String Password     ="Selenium123!";
	
	
	@BeforeMethod 
	  public void browserLaunch()
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\Naman\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  c= new ChromeDriver();
		  c.manage().window().maximize();
		  c.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  c.get("https://naman1.lmscheckouttest.com/");  
		  c.navigate().to("https://naman1.lmscheckouttest.com/User/createAccount");
		  c.manage().deleteAllCookies();
	  }
	
	 @Test
	 public void AccountCreate() throws InterruptedException, ClassNotFoundException, SQLException
	 {
		 c.findElement(By.xpath("//input[@id='RegistrationLastname']")).sendKeys(Lastname);
		 c.findElement(By.xpath("//input[@id='RegistrationFirstname']")).sendKeys(Firstname);
		 c.findElement(By.xpath("//input[@id='RegistrationEmail']")).sendKeys(EmailAddress);
		 c.findElement(By.xpath("//input[@id='RegistrationPhonenumber']")).sendKeys(PhoneNumber);
		 c.findElement(By.xpath("//input[@id='RegistrationPassword']")).sendKeys(Password);
		 c.findElement(By.xpath("//button[@id='btnaccountsubmit']")).click();
		
		 Thread.sleep(1000);
		 
		 //DataBase Connection to fetch the account create data
		 Pgadmin_Connection obj = new Pgadmin_Connection();
		 Statement obj1 =  obj.LocalDatabase();
			
             ResultSet rs=obj1.executeQuery("Select * from users where Firstname='Selenium';");
			
			while(rs.next())
			{
			System.out.println(rs.getInt(1)   +"          "+     rs.getString(3)  +  "            " + rs.getString(4)  + rs.getString(5));
		
	 }}
	 
	 @AfterMethod
	  public void exit() 
	  {
		  c.close();
	  }
}
