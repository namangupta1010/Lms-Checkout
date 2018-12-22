package java_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dynamic_Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("http://www.google.com");
		
	c.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("hell");
	Thread.sleep(2000);
	List<WebElement> searchList =c.findElements(By.xpath("//ul[@role='listbox']//li"));
	System.out.println(searchList.size());
	for(int i=0;i<searchList.size();i++)
	{
		//System.out.println(searchList.get(i).getText());
		if(searchList.get(i).getText().equals("hello brother"))
		{
			searchList.get(i).click();
			break;
		}
	}
}
}