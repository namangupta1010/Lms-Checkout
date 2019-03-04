package test;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {

	public static void main(String[] args)    {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Naman\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.get("https://mbawizards.com");

		List<WebElement> AllLinksandImages    =		c.findElements(By.xpath("//a"));

		AllLinksandImages.addAll(c.findElements(By.xpath("//img")));

		System.out.println(AllLinksandImages.size());
		
		
		ArrayList<WebElement> activeLinks = new ArrayList<WebElement>();
		
		
		for(int i=0;i<AllLinksandImages.size();i++)
		{


			if(AllLinksandImages.get(i).getAttribute("href")!= null)
			{
				activeLinks.add(AllLinksandImages.get(i));
			}
		}
		System.out.println(activeLinks.size());
		
		
		
		for(int j=2;j<activeLinks.size();j++)
		{
			String LinksHref  = activeLinks.get(j).getAttribute("href");
			//System.out.println(LinksHref);
			 URL url=null;
			try {
				url = new URL(LinksHref);
			
			 HttpURLConnection http = (HttpURLConnection)url.openConnection();
			 http.connect();
			String response = http.getResponseMessage();
			http.disconnect();
			System.out.println(j +LinksHref +response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("exception for link "+LinksHref);
				//e.printStackTrace();
			}
			
		}
		c.close();	
	}

}
