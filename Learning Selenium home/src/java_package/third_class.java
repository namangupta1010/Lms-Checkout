package java_package;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class third_class 
{ 
public static void main(String[] args){
WebDriver driver;
//int i = 1;

//OPEN THE GOOGLE CHROME BROWSER
System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
		
//GOTO THE URL
driver.get("https://webnersolutions.com");

// DECLARE THE JAVASCRIPT METHOD
JavascriptExecutor openjs  = (JavascriptExecutor)driver;
		
//DEFINE ARRAY TO CLICK THE SUB HEADING IN HEADING USING             JAVASCRIPT
WebElement element = driver.findElement(By.xpath("//ul[@id = 'menu-main-menu']/li[@id = 'menu-item-7935']/ul/li/a"));
openjs.executeScript("arguments[0].click();", element);
		
//GET THE TITLE OF CURRENT OPEN PAGE
String title =  openjs.executeScript("return document.title;").toString();
System.out.println(title);	
driver.quit();
}
}
