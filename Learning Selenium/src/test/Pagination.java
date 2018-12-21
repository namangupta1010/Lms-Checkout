package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver c = new ChromeDriver();
			c.get("https://blog.webnersolutions.com/");
			c.manage().window().maximize();
			
			List<WebElement> pages=c.findElements(By.xpath("//div[(@class='pager')]//a"));
			System.out.println(pages.size());
			for(int i=1;i<pages.size();i++)
			{
				
				//System.out.println(i);
				List<WebElement> pages1=c.findElements(By.xpath("//div[contains(@class,'page')]//a"));
				System.out.println(pages1.get(0));
				System.out.println("\n");
			//	pages1.get(i).click();
			}
	}

}
