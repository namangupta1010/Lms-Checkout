package test;

    import org.openqa.selenium.WebDriver;  
	import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.firefox.FirefoxDriver;
	public class Temp1 {
	
	public static void main(String[] args)
	{
	
	//System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver c = new ChromeDriver();
	
		String Url="https://www.proposalways.com/";
		//String Title1="";
		c.get(Url);
		String OrignalTitle=c.getTitle();
		String expectedTitle="Design Proposals for Free using Proposalways Proposal Management System";
		//c.getCurrentUrl();
		
		System.out.println(OrignalTitle);
		
		if(OrignalTitle.equals(expectedTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		
	c.close();
	}
	

}
