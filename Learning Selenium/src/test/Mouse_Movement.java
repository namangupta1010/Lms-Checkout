package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Movement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
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
		
		
		c.switchTo().frame(0);
		Thread.sleep(5000);
		
		c.findElement(By.xpath("/html[1]/body[1]/div[16]/div[1]/div[1]"))
		.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"
				+ " when an unknown printer took a galley of type and scrambled it to make a type specimen book. "
				+ "It has survived not only five centuries, but also the leap into electronic typesetting, "
				+ "remaining essentially unchanged. It was popularised in the 1960s with the release of "
				+ "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software"
				+ " like Aldus PageMaker including versions of Lorem Ipsum.");
		c.findElement(By.xpath("/html[1]/body[1]")).sendKeys(Keys.ENTER);
		
		/*
		d.clickAndHold(c.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(c.findElement(By.xpath("//*[@id='droppable']")))
		.release().build().perform();*/

		c.findElement(By.id("showMatrix")).click();
		c.findElement(By.id("btn_2_3")).click();
		
	}

}


