package java_package;

//import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.asprise.util.ocr.OCR;



public class Image {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\naman QA\\Selenium\\chromedriver win32\\chromedriver.exe");
		
		WebDriver c = new ChromeDriver();
		c.get("https://widget-test-site.s3.amazonaws.com/THEMES_TEST/tac_button_theme_test.html");
		Thread.sleep(10000);
		
		//String imageUrl=c.findElement(By.xpath("//img[@src='//dev.turnacar-content.redlineinventory.com/player_themes/lib/lexus-00/open_turnacar.png']"));
		BufferedImage d = ImageIO.read(new File("F:\\download.png")); 
		String imageText = new OCR().recognizeCharacters((RenderedImage) d);
		System.out.println("Text From Image : \n"+ imageText);  
		   System.out.println("Length of total text : \n"+ imageText.length());
		
		/*URL url = new URL(imageUrl);
		 Image image = ImageIO.read(url);
		 String s = new OCR().recognizeCharacters((RenderedImage) image);
		 System.out.println("Text From Image : \n"+ s);
		 System.out.println("Length of total text : \n"+ s.length());
*/
	}

}