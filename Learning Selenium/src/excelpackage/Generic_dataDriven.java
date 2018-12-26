package excelpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Generic_dataDriven 
{
 
	public XSSFSheet ExcelGenricCode(String FilePath, String WorkBook) throws IOException
	{
		File filesource = new File(FilePath);
		FileInputStream fileLoad =new FileInputStream(filesource);
		XSSFWorkbook wb=new XSSFWorkbook(fileLoad);
		XSSFSheet sheet= wb.getSheet(WorkBook);
		return sheet;
	}
	
	
}
