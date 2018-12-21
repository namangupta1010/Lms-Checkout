package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Naman\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.get("https://www.google.com/");
}
}