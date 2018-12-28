package excelpackage;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;

public class CallingFromGeneric {
	
	@Test
	public void testData() throws IOException
	{
		String fp="D:\\Proposalways.xlsx";
		Generic_dataDriven obj = new Generic_dataDriven(fp,"Login Credentials");
	      
		obj.dataread(0, 1);
		obj.dataread(5, 0);
		
		//sheet.getRow(i).createCell(2).setCellValue("pass");
		obj.dataWrite(7, 2);
		obj.write(fp);
		
		//result.getRow(7).createCell(2).setCellValue("Hello World");
		
		
	//	obj.Writesheet("D:\\Proposalways.xlsx","Login Credentials");
		
	}

}
