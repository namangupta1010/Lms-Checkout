package excelpackage;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting 
{
	WebDriver c;
	 
	  @BeforeMethod
	  public void BrowserLaunch()
	  {
		  System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		  c= new ChromeDriver();
		  c.get("https://www.proposalways.com/userLogin");
		  c.manage().window().maximize();
		  c.manage().deleteAllCookies();
	  }
	@Test(dataProvider="proposalways Data")
	public void ProposalwaysLogin(String email,String Password,String un)
	{
		c.findElement(By.id("user_email")).sendKeys(email);
		c.findElement(By.id("user_password")).sendKeys(Password);
		System.out.println(un);
		
	}
	
	@DataProvider(name ="proposalways Data")	
	public Object[][] testData() throws IOException 
	{
		
		Generic_dataDriven obj = new Generic_dataDriven("C:\\Users\\HP\\git\\Lms-Checkout\\Learning Selenium\\src\\excelpackage\\Proposalways.xlsx","Login Credentials");
		Object data[][]=obj.getData();
		return data;
		
	}

	@AfterMethod
	  public void logout() 
	 {
		 c.close();
	 }
}
