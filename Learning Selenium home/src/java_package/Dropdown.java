package java_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.get("http://support.webnerproducts.com/createCustomSupportPlan");
		
		
		c.findElement(By.id("hoursPerMonth")).sendKeys("55");
		c.findElement(By.linkText("Projects in which technologies are Maintained/Developed?")).click();
		//c.findElement(By.xpath("//div[@class='modal-dialog']//button[@type='button'][contains(text(),'×')]")).click();
		
		Select d=new Select(c.findElement(By.id("select")));
		d.selectByVisibleText("Bhutan");

	}

}
