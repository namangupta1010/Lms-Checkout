package java_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLunitDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new HtmlUnitDriver();
		c.get("https://www.proposalways.com/");
		Thread.sleep(10000);
		System.out.println(c.getTitle());
		
	}

}
