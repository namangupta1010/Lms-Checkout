package test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Naman\\Selenium\\chromedriver_win32\\chromedriver");
		WebDriver c=new ChromeDriver();
		c.get("https://naman1.lmscheckouttest.com/Course/index");
		Thread.sleep(5000);
		 String att= c.findElement(By.partialLinkText("Account")).getAttribute("class");
		System.out.println(att);
		
	}

}
