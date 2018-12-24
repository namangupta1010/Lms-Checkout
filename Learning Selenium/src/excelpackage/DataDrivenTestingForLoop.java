package excelpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class DataDrivenTestingForLoop {


	@Test
	public void ExcelRead() throws IOException
	{
		File filesource = new File("D:\\Proposalways.xlsx");
		FileInputStream fileLoad =new FileInputStream(filesource);
		XSSFWorkbook wb=new XSSFWorkbook(fileLoad);
		XSSFSheet sheet= wb.getSheet("Login Credentials");
		
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
			System.out.println(sheet.getRow(i).getCell(1).getStringCellValue());
		}

}
}
