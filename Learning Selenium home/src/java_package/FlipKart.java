package java_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	static String url = "https://www.flipkart.com/";
	static WebDriver driver;




	public static void main(String[] args) throws InterruptedException {

		initBrowser(url);
		login();
		search();

	}



	public static void initBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}

	public static void login()
	{
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//a[(text()='Login & Signup')]")).click();
		driver.findElement(By.xpath("//div[@class='_39M2dM']//input[@type='text']")).sendKeys("namangupta1010@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ng@123456");
		driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Login')]")).click();
	}
	
	
	public static void search() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("selenium" + Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(@class,'_1HmYoV _35HD7C')]//div[2]//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[1]//img[1]")).click();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	}

}
