package lmsc_package;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Landing_Page {
	WebDriver c;
	String SearchCourseName = "Paula Summary Test Course";
	//String XpathCourseName ="//font[contains(text(),'Dummy Course')]";
	public void login_Credentials(String email,String password)
	{
		  c.findElement(By.xpath("//input[@id='UserUsername']")).sendKeys(email);
		  c.findElement(By.xpath("//input[@id='UserPassword']")).sendKeys(password);
		  c.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@BeforeMethod 
	  public void browserLaunch()
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\Naman\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  c= new ChromeDriver();
		  c.manage().window().maximize();
		  c.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  c.get("https://naman1.lmscheckouttest.com/");  
		  c.navigate().to("https://naman1.lmscheckouttest.com/User/login");
		  c.manage().deleteAllCookies();
	  }
		
	@Test(description="Number of courses per page when select drop down")
	  public void Courses_per_page() throws InterruptedException 
	  {
		  login_Credentials("mahesh.kumar@webners.com", "Mahesh123!");
		  
		  Select drp = new Select(c.findElement(By.xpath("//select[@id='coursesPerPageVal']")));
		  drp.selectByVisibleText("100");
		  
		  Thread.sleep(5000);
		  
		 List<WebElement> courses = c.findElements(By.xpath("//font[contains(@id,'className')]"));
		 
		 System.out.println("Number of courses are " + courses.size());
		 Assert.assertEquals(courses.size(), 100);
		 for(int i=0;i<courses.size();i++)
		 {		 
			 System.out.println(courses.get(i).getText());	 
		 }	 
		 
		 }	 
	@Test(description="Testing search icon")
	public void search_icon()
	{
		login_Credentials("mahesh.kumar@webners.com", "Mahesh123!");
		c.findElement(By.xpath("//a[@class='search_link']")).click();
		c.findElement(By.xpath("//input[@id='search_from_icon']")).sendKeys(SearchCourseName);
		c.findElement(By.xpath("//input[@value='Search']")).click();
		
	List<WebElement> ExpectedCourseName =	c.findElements(By.xpath("//font[contains(@id,'className')]"));
	System.out.println(ExpectedCourseName.size());
	
	if(ExpectedCourseName.size()==0) 
	{
		System.out.println(c.findElement(By.xpath("//font[@color='red']")).getText());
	}
	else
	{
		System.out.println("List of Courses you have searched for");
		
			for(int i=0;i<ExpectedCourseName.size();i++)
			{
		System.out.println(ExpectedCourseName.get(i).getText());
			}
	
	}
	}
	
	@Test(description="Add to cart functionality")
	public void Cart() throws InterruptedException
	{
		search_icon();
		Thread.sleep(5000);
		
		String courseprize =c.findElement(By.xpath("//div[@class='row']//h2[2]")).getText();
		System.out.println("Prize of " + SearchCourseName +"="+  courseprize);
		
		c.findElement(By.xpath("//a[@class='front a_addtocart']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) c;
		WebElement Element = c.findElement(By.xpath("//a[@class='back back-flipped']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		//Dynamic wait to convert "add to cart" to checkout  
		WebDriverWait wait = new WebDriverWait(c,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[@class='back back-flipped']"))));
		c.findElement(By.xpath("//a[@class='back back-flipped']")).click();
		
		
		String totalprize = c.findElement(By.xpath("//td[@class='mobile-hide']//div[1]")).getText();
		System.out.println("Total prize after adding to cart" + totalprize);
	}
	
	
	@AfterMethod
	  public void exit() 
	  {
		  c.close();
	  }
}
