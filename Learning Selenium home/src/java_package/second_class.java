package java_package;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class second_class {
	
	public static void main(String[] args) {		
		System.setProperty("webdriver.gecko.driver","F:\\naman QA\\Selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}}
	