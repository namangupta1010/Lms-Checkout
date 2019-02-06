package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Mouse_Movement {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Naman\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.proposalways.com/userLogin");
		c.findElement(By.id("user_email")).sendKeys("naman.gupta@webners.com");
		c.findElement(By.id("user_password")).sendKeys("abc123");
		c.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		c.findElement(By.id("arrowsidenavbar")).click();

		Actions d = new Actions(c);
		d.moveToElement(c.findElement(By.linkText("Proposals"))).build().perform();
		Thread.sleep(2000);
		c.findElement(By.linkText("View")).click();

		Thread.sleep(2000);
		c.findElement(By.xpath("//a[@href='sendproposalpages/S6999N']")).click();


		String date ="2019-02-04";
		String datearr[] =date.split("-");
		for(String print : datearr)
			System.out.println(print);

		//WebElement duedate =c.findElement(By.xpath("//input[@id='due_date']"));



		/*		String due_date ="2019-02-06";
		System.out.println(duedate);
		Calender(duedate,c,due_date);
		System.out.println("hello proposalways");
		Thread.sleep(3000);

		//c.findElement(By.xpath("//th[contains(text(),'September 2019')]")).click();

	}
		public static void Calender(WebElement element, WebDriver c, String DateValue)
		{

		JavascriptExecutor js=((JavascriptExecutor)c);
		js.executeScript("arguments[0].setAttribute('value','"+DateValue+"');",element);

		//table[@class=' table-condensed']//th[@class='next']

		}

		 */

		c.findElement(By.xpath("//input[@id='due_date']")).click();
		/*List<WebElement> Years =c.findElements(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-top']//div[@class='datepicker-years']"
				+ "//tbody//tr//td//span[contains(@class,'year')]"));*/

		List<WebElement> Days =c.findElements(By.xpath("//div[@class='datepicker-days']//tbody//tr//td[contains(@class,'day')]"));

		//System.out.println(Years.size());

		for(WebElement DaysList : Days)
			//System.out.println(Days.get(i).getAttribute("textContent"));
			
			if((DaysList.getText().equals("20")))
			 {
				//System.out.println("hello world");
				  DaysList.click();
				  break;
			 }

				}

		
		/*for(WebElement Dayslistlist : Days)

			System.out.println(Dayslistlist.getText());

		List<WebElement> Months =c.findElements(By.xpath("//div[@class='datepicker-months']//table//tbody//tr//td//span[contains(@class,'month')]"));
		System.out.println(Months.size());
		for(WebElement Monthslist : Months)

			System.out.println(Monthslist.getAttribute("textContent"));*/
		

	}
/*c.switchTo().frame(0);
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
 */
/*
		d.clickAndHold(c.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(c.findElement(By.xpath("//*[@id='droppable']")))
		.release().build().perform();*/
/*
		c.findElement(By.id("showMatrix")).click();
		c.findElement(By.id("btn_2_3")).click();
 */





