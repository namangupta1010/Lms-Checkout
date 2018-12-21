package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  
public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver c = new ChromeDriver();
		c.get("http://output.jsbin.com/usidix/1");
		
		//c.findElement(By.xpath("//input[@id='hoursPerMonth']")).sendKeys("20");
		//c.navigate().back ();
		//c.switchTo().frame("classFrame");
		
		c.findElement(By.xpath("//input[@value='Go!']")).click();
		c.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	c.switchTo().alert().dismiss	();
		
		//System.out.println(text);
		
		//Thread.sleep(5000);
		//c.findElement(By.xpath("//div[@class='modal-dialog']//button[@type='button'][contains(text(),'×')]")).click();

	}    
  
}   
