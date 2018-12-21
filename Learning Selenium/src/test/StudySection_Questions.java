package test;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



	public class StudySection_Questions
	{
		WebDriver c;
	
		 @BeforeMethod 
		  public void browserLaunch()
		  {
			  System.setProperty("webdriver.chrome.driver","D:\\Naman\\Selenium\\chromedriver_win32\\chromedriver.exe");
			  c= new ChromeDriver();
			  c.manage().window().maximize();
			  c.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  c.get("https://www.studysection.com/StartTest/computer-fundamentals-foundation");  
			  //c.manage().deleteAllCookies();
		  }
		 
		 @Test
		 public void questions() throws InterruptedException
		 {
			c.findElement(By.xpath("//a[@id='existing_users_tab']")).click();
			c.findElement(By.xpath("//div[@class='input text required']//input[@id='UserEmail']")).sendKeys("vikas.dalal@webners.com");
			c.findElement(By.xpath("//input[@id='UserPassword']")).sendKeys("hello@123");
			c.findElement(By.xpath("//div[@class='users form onsiteForms']//form[@id='UserIndexForm']//div//input[@title='Start Test']")).click();
			Thread.sleep(5000);
			
			List<WebElement> Elements =c.findElements(By.xpath("//tr[contains(@id,'question_')]"));
			for(int i=0; i<Elements.size();i++)
			{
			System.out.println(Elements.get(i).getText());
		
			List<WebElement> Elements1 =c.findElements(By.xpath("//img[@src='/img/next.png']"));
			if(i<Elements.size()-1) {
			Elements1.get(i).click();
			
			}
			
			}		 
}
}