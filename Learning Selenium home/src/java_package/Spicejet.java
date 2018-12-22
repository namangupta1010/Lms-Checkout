package java_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		
		c.manage().window().maximize();	
		c.get("https://www.spicejet.com/");
		
		Actions d =new Actions(c);
		c.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		d.moveToElement(c.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		
		c.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		d.moveToElement(c.findElement(By.xpath("//li[@class='li-login float-right']//ul//li[@class='hide-mobile']//a[@href='javascript:void();']"))).build().perform();
		
		c.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		c.findElement(By.linkText("Member Login")).click();

	}

}
