package java_package;

//import java.awt.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Study_Section {
		 // static WebDriver c;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
			WebDriver c= new ChromeDriver();
			c.manage().window().maximize();
			
			c.get("https://www.studysection.com/Categories/basic-computer-skills");
			
			List <WebElement> slugs= c.findElements(By.xpath("//span[@class='ajax-certificate-name data_for_search cursor_pointer']"));
			System.out.println("Total Exam List" + slugs.size());
			{
				for(int i=0;i<slugs.size();i++)
				{
					String text=slugs.get(i).getText();
					System.out.println(text);	
		}
}
	System.out.println("-------------------------------");

			c.findElement(By.xpath("//input[@id='btnFreeExams']")).click();
			Thread.sleep(2000);
			List <WebElement> Foundationslugs= c.findElements(By.xpath("//span[@class='ajax-certificate-name cursor_pointer']"));
			System.out.println("Total Exam List" +Foundationslugs.size());
			{
				for(int i=0;i<Foundationslugs.size();i++)
				{
					String text=Foundationslugs.get(i).getText();
					System.out.println(text);	
		}
}
}		}
