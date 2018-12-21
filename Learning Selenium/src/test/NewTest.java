package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

	   public String baseUrl = "https://www.proposalways.com/";
	   //System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver ; 
	    
	 @Test
	 public void verifyHomepageTitle() {
	      
	     System.out.println("launching chrome browser"); 
	     System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get(baseUrl);
	     String expectedTitle = "Design Proposals for Free using Proposalways Proposal Management System";
	     String actualTitle = driver.getTitle();
	     Assert.assertEquals(actualTitle, expectedTitle);
	     driver.close();
	 }
	}
