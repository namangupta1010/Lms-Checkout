package excelpackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class DataDrivenTesting 
{

	@Test
	public void ExcelRead() throws IOException
	{
		File filesource = new File("D:\\Proposalways.xlsx");
		FileInputStream fileLoad =new FileInputStream(filesource);
		XSSFWorkbook wb=new XSSFWorkbook(fileLoad);
		XSSFSheet sheet= wb.getSheet("Login Credentials");
		
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		
		System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(3).getCell(1).getStringCellValue());
		
		System.out.println(sheet.getRow(4).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(4).getCell(1).getStringCellValue());
	}
	
		

	

}
