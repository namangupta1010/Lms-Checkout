package java_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class signup {
	WebDriver c;

@BeforeTest
	public void launchPage()
	{
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		c = new ChromeDriver();
		c.get("https://www.proposalways.com");
	}
	@Test
	public void link()
		{
		c.get("https://support.webnerproducts.com/createCustomSupportPlan");
		c.findElement(By.id("hoursPerMonth")).sendKeys("67");
	}
	@BeforeTest
	public void apple()
	{
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		c = new ChromeDriver();
		c.get("https://www.proposalways.com/userRegistration");
		
	c.findElement(By.id("user_first_name")).sendKeys("Naman");
	c.findElement(By.name("last_name")).sendKeys("Gupta");
	c.findElement(By.id("user_company_name")).sendKeys("webner");
	//c.findElement(By.tagName("input")).sendKeys("www.webner.com");
	//c.findElement(By.linkText("Sign In")).click();
	//c.findElement(By.partialLinkText("Password")).click();
	c.findElement(By.cssSelector("#user_company_url")).sendKeys("www.webners.com");
	c.findElement(By.xpath("//input[@id='user_email']")).sendKeys("namangupta1010@gmail.com");
	c.findElement(By.name("password")).sendKeys("abc123");
	c.findElement(By.xpath("//input[@id='user_password-confirm']")).sendKeys("abc123");
	c.findElement(By.cssSelector("#term-condition-checkbox")).click();
	//c.findElement(By.cssSelector("#signUp")).click();
	}

}
