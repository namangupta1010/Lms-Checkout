package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class XSD {

	public static void main(String[] args) throws InterruptedException
	{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver c=new ChromeDriver();
			c.get("http://xsd.webnerserver.com/");
			c.findElement(By.id("navbarDropdownMenuLink")).click();
			c.findElement(By.id("login")).click();
			
			Thread.sleep(1000);
			c.findElement(By.id("email")).sendKeys("mahesh.kumar@webners.com");
			c.findElement(By.id("password")).sendKeys("abc123");
			c.findElement(By.xpath("//button[@type='submit']")).click();
			c.findElement(By.xpath("//a[contains(text(),'Convert JSON to ACORD XML')]")).click();
			Thread.sleep(500);
			
			Select drop = new Select(c.findElement(By.id("xsd_parent")));
			drop.selectByVisibleText("WorkCompLineBusiness");
			c.findElement(By.id("json")).sendKeys("E:\\file2.json");
			c.findElement(By.id("mapping")).sendKeys("E:\\file3.csv");
			
			/*c.findElement(By.xpath("//button[@name='submit']")).click();
			c.findElement(By.linkText("Task Status")).click();
			c.findElement(By.linkText("root_1538390635.xml")).click();
			*/
			
			
	}
	

}
