package test;

//import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Sukhi {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://widget-test-site.s3.amazonaws.com/THEMES_TEST/tac_button_theme_test.html");
		Thread.sleep(5000);
		c.findElement(By.xpath("//img[@src='//dev.turnacar-content.redlineinventory.com/player_themes/lib/lexus-00/open_turnacar.png']")).click();
		Thread.sleep(5000);
		c.switchTo().frame("rl-tac-iframe-id");
		
		String frameText=c.findElement(By.id("tickerText")).getText();
		System.out.println(frameText);
		
	

		
		
		
		
		
		/*c.findElement(By.xpath("//img[@src='//dev.turnacar-content.redlineinventory.com/player_themes/lib/lexus-00/open_turnacar.png']"));
		BufferedImage d = ImageIO.read(new File("E:\\open_turnacar.png")); 
		String imageText = new OCR().recognizeCharacters((RenderedImage) d);
		System.out.println("Text From Image : \n"+ imageText);  
		   System.out.println("Length of total text : \n"+ imageText.length());
		*/

	}

}
