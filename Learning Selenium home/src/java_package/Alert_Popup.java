package java_package;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://support.webnerproducts.com/createCustomSupportPlan");
		
		c.findElement(By.linkText("Projects in which technologies are Maintained/Developed?")).click();
		
		//c.findElement(By.xpath(".//*[@id='featureList']/div/div/div[1]/button")).click();
		Thread.sleep(5000);
		System.out.println("-----");
	System.out.println(c.findElement(By.className("modelTable")).getText());
		}

}
