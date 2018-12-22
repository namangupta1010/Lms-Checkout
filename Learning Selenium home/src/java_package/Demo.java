package java_package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		//*[@id='user_company_url']
		
		c.get("https://www.proposalways.com");
		c.findElement(By.xpath("//a[@id='playBtnLink']")).click();
		/*c.findElement(By.id("user_first_name")).sendKeys("Naman");
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
		c.findElement(By.cssSelector("#signUp")).click();
		*/
		
		

	}

}
