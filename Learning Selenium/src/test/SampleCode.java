package test;

import org.openqa.selenium.Dimension;

import java.util.List;

//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.studysection.com/Categories/basic-computer-skills");
		
		
		if(c.findElement(By.xpath("//input[@id='level_1']")).isSelected())
		{
		System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
	}

}

		

