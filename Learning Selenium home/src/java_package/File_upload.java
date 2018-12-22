package java_package;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class File_upload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		c.get("http://demo.guru99.com/test/upload/");
		
		Thread.sleep(8000);
		
		c.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("F:\\open_turnacar.png");
	}
	

}
