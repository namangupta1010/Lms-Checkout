package java_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class signup2 {
	
	@BeforeClass
	public void TC1()
	{
		System.out.println("++++++++");
	}
	@Test
	public void TC2()
	{
	System.out.println("****");
	}
	@AfterTest
	public void TC3()
	{
		System.out.println("--------");
	}
    @BeforeTest()
    public void TC4()
    {
	System.out.println("^^^^^^^^^");
}
}
