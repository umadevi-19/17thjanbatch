package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POM {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		File f=new File("C:\\Users\\Baby\\eclipse-workspace\\Maven10\\Excel files\\Details.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Thread.sleep(3000);
		
		Sheet mysheet=wb.getSheet("Datas");
		Row r=mysheet.getRow(3);
		
	Cell c1 = r.getCell(1);
	Cell c2 = r.getCell(0);
	Cell c3=r.getCell(2);

	
	System.out.println(c1);
	System.out.println(c2);	
	System.out.println(c3);
		
		
	}

}
