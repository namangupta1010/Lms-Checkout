package java_package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("http://www.popuptest.com/goodpopups.html");
		c.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		Thread.sleep(2000);
		
		//getwindowHandles returns the in terms of set String(It will store all of the window id's)
		Set<String> Handler=c.getWindowHandles();
		
		//To fetch the values from Handler object we use iterator method which returns Iterator String
		Iterator<String> It=Handler.iterator();
		
		
		//Now to move to first location of window id i.e parent window
		String Parentwindowid=It.next();
		System.out.println(Parentwindowid);
		
		
		//Now to move to Second location of window id i.e Child window
		String ChildWindowid=It.next();
		System.out.println(ChildWindowid);
		
		c.switchTo().window(ChildWindowid);
		
		System.out.println(c.getTitle());
		
		c.switchTo().window(Parentwindowid);
		System.out.println(c.getTitle());
		
		c.quit();	
	}
}