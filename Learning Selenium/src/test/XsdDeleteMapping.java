package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XsdDeleteMapping {

	private static final String WebDriverRefrence = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("http://xsd.webnerserver.com/");
		c.findElement(By.id("navbarDropdownMenuLink")).click();
		c.findElement(By.id("login")).click();
		
		Thread.sleep(1000);
		c.findElement(By.id("email")).sendKeys("mahesh.kumar@webners.com");
		c.findElement(By.id("password")).sendKeys("abc123");
		
		c.findElement(By.xpath("//button[@type='submit']")).click();
		c.findElement(By.xpath("//a[contains(text(),'Convert JSON to ACORD XML')]")).click();
		Thread.sleep(500);
		
		Select drop = new Select(c.findElement(By.id("xsd_parent")));
		drop.selectByVisibleText("WorkCompLineBusiness");
		c.findElement(By.id("json")).sendKeys("E:\\test_json_1copy.json");
		c.findElement(By.xpath("//button[@name='submit']")).click();
		Thread.sleep(5000);
		
		List<WebElement> tags=c.findElements(By.xpath("//button[@class='xsd_tagss']"));
		for(int i=0;i<tags.size();i++)
		{
			
			tags.get(i).getAttribute("style");
			if(tags.get(i).getAttribute("style").equals("display: none; float: right; margin-top: 4px; width: 15px; height: 15px;"))
			{
				System.out.println("No box");
			}
			else
			{
				tags.get(i).click();
				
			WebElement YesButton=c.findElement(By.xpath("//div[@class='modal-dialog modal-md']//div//button[@id='modal-btn-yes']"));
			//Thread.sleep(2000);
			YesButton.click();
//Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(c,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='xsd_tagss']")));
			
			}
		
		}	

			}
			}
