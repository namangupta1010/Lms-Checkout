package excelpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Generic_dataDriven 
{
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public  Generic_dataDriven(String FilePath, String WorkBook) throws IOException
	{
		File filesource = new File(FilePath);
		FileInputStream fileLoad =new FileInputStream(filesource);
		wb= new XSSFWorkbook(fileLoad);
		 sheet= wb.getSheet(WorkBook);
		//sheet.getRow(i).createCell(2).setCellValue("pass");
		 
		 FileOutputStream fout = new FileOutputStream(FilePath);
			wb.write(fout);
		
	}
	public void data(int row, int cell)
	{
		System.out.println(sheet.getRow(row).getCell(cell).getStringCellValue());
		//System.out.println(sheet.getRow(row).getCell(cell).getStringCellValue());
		sheet.getRow(row).createCell(cell).setCellValue("pass");
		
		
	}
	
	public void write()
	{
		 FileOutputStream fout = new FileOutputStream(FilePath);
			wb.write(fout);
	}
		
	}
	/*public void Writesheet(String FilePath, String WorkBook) throws IOException
	{
		FileOutputStream fout = new FileOutputStream(FilePath);
		wb.write(fout);
	}*/
/*FileOutputStream fout = new FileOutputStream(FilePath);
wb.write(fout);*/

	

