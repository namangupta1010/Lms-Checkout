package excelpackage;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;

public class CallingFromGeneric {
	
	@Test
	public void testData() throws IOException
	{
		Generic_dataDriven obj = new Generic_dataDriven();
		XSSFSheet result = obj.ExcelGenricCode("C:\\Users\\webner\\git\\Lms-Checkout\\Learning Selenium\\src\\excelpackage\\Proposalways.xlsx","Sample Data");
		
		System.out.println(result.getRow(1).getCell(0).getStringCellValue());
		System.out.println(result.getRow(1).getCell(1).getNumericCellValue());
	}

}
