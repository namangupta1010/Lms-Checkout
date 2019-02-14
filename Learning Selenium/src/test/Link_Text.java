package test;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Naman\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.get("https://www.studysection.com/");

		List<WebElement> AllLinksandImages    =		c.findElements(By.xpath("//a"));

		AllLinksandImages.addAll(c.findElements(By.xpath("//img")));

		System.out.println(AllLinksandImages.size());
		
		
		ArrayList<WebElement> activeLinks = new ArrayList<WebElement>();
		activeLinks.addAll(AllLinksandImages);
		System.out.println(activeLinks.size());

		for(int i=0;i<AllLinksandImages.size();i++)
		{


			if(AllLinksandImages.get(i).getAttribute("href")!= null)
			{
				activeLinks.add(AllLinksandImages.get(i));
			}
		}
		System.out.println(activeLinks.size());
		c.close();	
	}

}
