package java_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
			
			WebDriver c = new ChromeDriver();
			c.get("https://www.proposalways.com/");
			Thread.sleep(5000);

			WebElement playBtnLink=c.findElement(By.xpath("//a[@id='playBtnLink']"));                  
			drawBorder(playBtnLink, c);	
			generateAlert(c,"Bhaiya Bug hai");
			c.switchTo().alert().accept();
			scrollDown(c);
	}
	
//Method to draw a border on element
public static void drawBorder(WebElement element, WebDriver c)
{
	JavascriptExecutor js=((JavascriptExecutor)c);
	js.executeScript("arguments[0].style.border='3px solid red'",element);
}
// Method to generate alert when we get some bug
public static void generateAlert(WebDriver c, String Message)
{
	JavascriptExecutor js=((JavascriptExecutor)c);
	js.executeScript("alert('"+Message+"')");
	
}
public static void scrollDown(WebDriver c)
{
	JavascriptExecutor js=((JavascriptExecutor)c);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

}
}