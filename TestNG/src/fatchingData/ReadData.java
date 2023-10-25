package fatchingData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./excel/Data_sheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("LoginData");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(2);
		System.out.println(cell.getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
		
		XSSFSheet sheet2 = wb.getSheet("Qspider");
		XSSFRow row2 = sheet2.getRow(2);
		XSSFCell cell2 = row2.getCell(2);
		System.out.println(cell2.getStringCellValue());
		//total col and row
		   int colNum = row.getLastCellNum();
	       System.out.println("Total Number of Columns in the excel is : "+colNum);
	       int rowNum = sheet.getLastRowNum();
	       System.out.println("Total Number of Rows in the excel is : "+rowNum);
	}

}
