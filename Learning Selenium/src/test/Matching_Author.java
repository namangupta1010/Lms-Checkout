package test;
		
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class Matching_Author {

			static String author = "Author - Naman Gupta";
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub

				  System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				WebDriver c=new ChromeDriver();
				c.manage().window().maximize();
				c.get("https://blog.webnersolutions.com/page/2");
				Thread.sleep(5000);
				
				List<WebElement> pages=c.findElements(By.xpath("//div[(@class='pager')]//a"));
				//System.out.println(pages.size());
				for(int i=3;i<pages.size();i++)
				{
					List<WebElement> pages1=c.findElements(By.xpath("//div[(@class='pager')]//a"));
					pages1.get(i).click();
				
					List <WebElement> Authors=c.findElements(By.xpath("//div[@class='demo']"));
					{
						//System.out.println(Authors.size());
						for(int j=0;j<Authors.size();j++)
						{
							
							{
							String nameofAuthors=Authors.get(j).getText();
							if(nameofAuthors.equalsIgnoreCase(author))
							{
						System.out.println(nameofAuthors);
						List <WebElement> AuthorTitle =c.findElements(By.xpath("//h3[@class='post-title entry-title']"));
						System.out.println(AuthorTitle.get(j).getText());
					}
					}
					}
					}

	}


			}}
