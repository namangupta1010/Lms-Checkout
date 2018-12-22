package java_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://blog.webnersolutions.com");
		Thread.sleep(5000);
		
		List <WebElement> pages =c.findElements(By.xpath("//div[@class='pager']//a" ));
		//System.out.println(pages.size());
		for(int i=2;i<=pages.size();i++)
		{
			List <WebElement> pages1 =c.findElements(By.xpath("//div[@class='pager']//a" ));
		pages1.get(i).click();
		


	}

}
}
