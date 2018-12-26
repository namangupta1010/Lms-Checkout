package excelpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WriteExcel {

	WebDriver c;
	 
	  @BeforeMethod
	  public void BrowserLaunch()
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\Naman\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  c= new ChromeDriver();
		  c.get("https://www.proposalways.com/userLogin");
		  c.manage().deleteAllCookies();
	  }
	@Test
	public void ExcelRead() throws IOException, InterruptedException
	{
	

		File filesource = new File("D:\\Proposalways.xlsx");
		FileInputStream fileLoad =new FileInputStream(filesource);
		XSSFWorkbook wb=new XSSFWorkbook(fileLoad);
		XSSFSheet sheet= wb.getSheet("Login Credentials");
		
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
			System.out.println(sheet.getRow(i).getCell(1).getStringCellValue());
			
			c.findElement(By.id("user_email")).clear();
			c.findElement(By.id("user_password")).clear();
			c.findElement(By.id("user_email")).sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			c.findElement(By.id("user_password")).sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
			c.findElement(By.id("loginButton")).click();
			
			Thread.sleep(2000);
			if(c.getTitle().contentEquals("Design Proposals for Free using Proposalways Proposal Management System"))
			{
			WebDriverWait wait=new WebDriverWait(c, 2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Help')]")));
			
			
			
			c.findElement(By.id("navbarDropdownMenuLink")).click();
			
			c.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			c.navigate().to("https://www.proposalways.com/userLogin");
			
		
			sheet.getRow(i).createCell(2).setCellValue("pass");
			
			FileOutputStream fout = new FileOutputStream("D:\\Proposalways.xlsx");
			wb.write(fout);
			}
			else
			{
				sheet.getRow(i).createCell(2).setCellValue("Fail");
				
				FileOutputStream fout = new FileOutputStream("D:\\Proposalways.xlsx");
				wb.write(fout);
			}
		}
	}
		 @AfterMethod
		  public void logout() 
		 {
			 c.close();
		 }

}


