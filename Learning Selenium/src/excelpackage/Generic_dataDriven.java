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
	public String naman =null;
	public  Generic_dataDriven(String FilePath, String WorkBook) throws IOException
	{
		naman=FilePath;
		File filesource = new File(FilePath);
		FileInputStream fileLoad =new FileInputStream(filesource);
		wb= new XSSFWorkbook(fileLoad);
		 sheet= wb.getSheet(WorkBook);
		//sheet.getRow(i).createCell(2).setCellValue("pass");
		 
		// FileOutputStream fout = new FileOutputStream(FilePath);
		//	wb.write(fout);
		
	}
	public void dataread(int row, int cell)
	{
		System.out.println(sheet.getRow(row).getCell(cell).getStringCellValue());
		//System.out.println(sheet.getRow(row).getCell(cell).getStringCellValue());
			
	}
	
	public void dataWrite(int row, int cell)
	{
	sheet.getRow(row).createCell(cell).setCellValue("pass");
//tem.out.println(sheet);
	}
	
	
	
	public void write(String FilePath) throws IOException
	{
		 FileOutputStream fout = new FileOutputStream(FilePath);
			wb.write(fout);
	}
	
	
	
	//Generic Method of getting data from excel for dataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		System.out.println(sheet.getRow(0).getLastCellNum());
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
			data[i][k]=sheet.getRow(i+1).getCell(k).getStringCellValue();		
		}
		}
		return data;

	}
		
	}
	

	

	