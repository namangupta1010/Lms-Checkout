package test;
	
	import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
	import org.openqa.selenium.remote.RemoteWebDriver;

	import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


	public class Study_Section {
			 // static WebDriver c;
			public static void main(String[] args) throws InterruptedException, MalformedURLException {
				
				// TODO Auto-generated method stub
				
				WebDriver c ;
				DesiredCapabilities capability = DesiredCapabilities.chrome();
		        		capability.setBrowserName("chrome");
		       		capability.setPlatform(Platform.WIN8_1); 
		        	c = new RemoteWebDriver(new URL("http://192.168.1.52:5566/wd/hub"), capability);
		        		c.manage().window().maximize();
				
				
				c.get("https://www.studysection.com/Categories/basic-computer-skills");
				
				List <WebElement> slugs= c.findElements(By.xpath("//span[@class='ajax-certificate-name data_for_search cursor_pointer']"));
				System.out.println("Total Exam List   " + slugs.size());
				{
					for(int i=0;i<slugs.size();i++)
					{
						String text=slugs.get(i).getText();
						System.out.println(text);	
			}
				}
		System.out.println("-------------------------------");

				c.findElement(By.xpath("//input[@id='btnFreeExams']")).click();
				Thread.sleep(2000);
				List <WebElement> Foundationslugs= c.findElements(By.xpath("//span[@class='ajax-certificate-name cursor_pointer']"));
				System.out.println("Total Exam List    " +Foundationslugs.size());
				{
					for(int i=0;i<Foundationslugs.size();i++)
					{
						String text=Foundationslugs.get(i).getText();
						System.out.println(text);	
						//span[@class='ajax-certificate-status']
			}
	}
	}		}




