package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learn_Automation_Site {

	public static void main(String[] args)throws InterruptedException  {
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","E:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver c= new ChromeDriver();
			c.manage().window().maximize();
			c.get("http://learn-automation.com/");
			
//Thread.sleep(5000);
c.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
			
			Actions d=new Actions(c);
			d.clickAndHold(c.findElement(By.linkText(" Selenium(Java) Basic"))).build().perform();
			
			d.moveToElement(c.findElement(By.linkText(" Must Read Article Before Start"))).build().perform();
			c.findElement(By.linkText("List of Java Topics")).click();
	}

}
