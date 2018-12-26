package excelpackage;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;

public class CallingFromGeneric {
	
	@Test
	public void testData() throws IOException
	{
		Generic_dataDriven obj = new Generic_dataDriven("D:\\Proposalways.xlsx","Login Credentials");
	      
		obj.data(0, 1);
		obj.data(5, 0);
		
		//result.getRow(7).createCell(2).setCellValue("Hello World");
		
		
	//	obj.Writesheet("D:\\Proposalways.xlsx","Login Credentials");
		
	}

}
