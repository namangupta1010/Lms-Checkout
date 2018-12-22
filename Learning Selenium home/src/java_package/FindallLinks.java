package java_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindallLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.proposalways.com/");
		
		List <WebElement> Links =c.findElements(By.tagName("a"));
		//total count of all links in the page
		
		System.out.println(Links.size());
		System.out.println("All links in webpage are");
		for(int i=0;i<Links.size();i++)
		{
			String LinksText=Links.get(i).getText();
			
		
		System.out.println(LinksText);
	}
		c.close();

	}
}
