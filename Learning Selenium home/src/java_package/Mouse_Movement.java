package java_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Movement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.proposalways.com/userLogin");
		c.findElement(By.id("user_email")).sendKeys("naman.gupta@webners.com");
		c.findElement(By.id("user_password")).sendKeys("abc123");
		c.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		c.findElement(By.id("arrowsidenavbar")).click();
		
		Actions d = new Actions(c);
		d.moveToElement(c.findElement(By.linkText("Sections"))).build().perform();
		Thread.sleep(2000);
		c.findElement(By.linkText("New")).click();
		//
		
		c.switchTo().frame(0);
		Thread.sleep(5000);
		c.findElement(By.id("showMatrix")).click();
		c.findElement(By.id("btn_2_3")).click();
		/*d.clickAndHold(c.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(c.findElement(By.xpath("//*[@id='droppable']")))
		.release().build().perform();
		*/


		
		
	}

}
