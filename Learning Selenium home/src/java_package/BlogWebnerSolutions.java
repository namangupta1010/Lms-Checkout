package java_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlogWebnerSolutions {
	static String author = "Author - Harpal Singh";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://blog.webnersolutions.com/");
		Thread.sleep(5000);
		
			List <WebElement> Authors=c.findElements(By.xpath("//div[@class='demo']"));
			{
				System.out.println(Authors.size());
				for(int i=0;i<Authors.size();i++)
				{
					
					{
					String nameofAuthors=Authors.get(i).getText();
					if(nameofAuthors.equalsIgnoreCase(author))
					{
				System.out.println(nameofAuthors);
			}
			}
			}
		/*List <WebElement> Pagination =c.findElements(By.xpath("//div[@class='pager']//center"));
		System.out.println(Pagination.size());
		
		for(int i=1;i<=Pagination.size();i++)
		{
			Pagination.get(i).click();
			
		}
	}*/
	}
	}
}

