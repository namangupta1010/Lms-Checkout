package java_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learn_autoMouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();	
		c.get("http://learn-automation.com/");
		
		
		c.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(3000);
		c.findElement(By.xpath("//a[@id='sendx-close-dNnOns5gBj56SFGkOimE4p']")).click();
		scrollDown(c);
		Thread.sleep(3000);
		Actions d =new Actions(c);
		d.moveToElement(c.findElement(By.xpath("//span[contains(text(),'Selenium(Java) Basic')]"))).build().perform();
		Thread.sleep(1000);
		d.moveToElement(c.findElement(By.linkText("Must Read Article Before Start"))).build().perform();
		c.findElement(By.linkText("List of Java Topics")).click();


	}
	public static void scrollDown(WebDriver c)
	{
		JavascriptExecutor js=((JavascriptExecutor)c);
		js.executeScript("window.scrollTo(0,500)");

}
}