package java_package;

	import org.testng.annotations.Test;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;
    import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class LMSC {
		WebDriver c;
		
		public void login(String email,String password)
		{
			  c.findElement(By.xpath("//input[@id='UserUsername']")).sendKeys(email);
			  c.findElement(By.xpath("//input[@id='UserPassword']")).sendKeys(password);
			  c.findElement(By.xpath("//button[@type='submit']")).click();
		}
		
		public void errorLogin()
		{
			String ErrorMessage =  c.findElement(By.xpath("//div[@class='col-xs-12 loginerrormessage']//*")).getText();
			String ActualMessage="Invalid Email Address and Password";
			Assert.assertEquals(ActualMessage, ErrorMessage);
		  
		}
		
	  @Test(priority=0,description="Valid email address and valid password")
	  public void case1() 
	  {
		  login("mahesh.kumar@webners.com", "Mahesh123!");
		String Confirmation =  c.findElement(By.xpath("//div[@id='loggedinas']//span[1]")).getText();

		String ActualConfirmation ="You are logged in as Mahesh";
		Assert.assertEquals(ActualConfirmation, Confirmation);
		
		System.out.println("-------"+ Confirmation);
	  }
	  
	  @Test(priority=1,description="Valid email address and Invalid password")
	  public void case2() 
	  {
		   login("mahesh.kumar@webners.com", "Mahesh123!1");
		   errorLogin();
		
	  }
	  
	  @Test(priority=2,description="InValid email address and valid password")
	  public void case3() 
	  {
		  login("mahesh.kumar1@webners.com", "Mahesh123!");
		  errorLogin();
	  }
	  
	  
	  @BeforeMethod 
	  public void browserLaunch()
	  {
		  System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		  c= new ChromeDriver();
		  c.manage().window().maximize();
		  c.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  c.get("https://naman1.lmscheckouttest.com/");  
		  c.navigate().to("https://naman1.lmscheckouttest.com/User/login");
		  c.manage().deleteAllCookies();
	  }
	  
	  
	  @AfterMethod
	  public void exit() 
	  {
		  c.quit();
	  }

	}

	  /*@AfterMethod
	  public void logout() throws InterruptedException
	  {
		  Thread.sleep(1000);
		  try {
		  WebElement Element=c.findElement(By.xpath("//a[@href='/User/logout']"));
		  if(Element.isDisplayed())
		  {
		  
	  WebDriverWait wait = new WebDriverWait(c, 20);
	  WebElement Element1= wait.until(ExpectedConditions.elementToBeClickable(c.findElement(By.xpath("//a[@href='/User/logout']"))));
	  Element1.click();    
	  c.navigate().to("https://naman1.lmscheckouttest.com/User/login");
		  }}
		  catch(Exception e)
		  {
			  System.out.println("No logout button");
		  }
		  }
	  */
	  
	  
	