package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;

public class POMWrite {
	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Baby\\eclipse-workspace\\Maven10\\target\\TestData\\GreensData.xlsx");
		boolean a = f.createNewFile();
		System.out.println(a);
		
		Workbook w=new XSSFWorkbook();
		
		Sheet s = w.createSheet("GreensTech");
		Row r = s.createRow(1);
		Row r1 = s.createRow(2);
		
		Cell c = r.createCell(0);
		Cell c1 = r1.createCell(3);
		c.setCellValue("london");
		c1.setCellValue("new jersy");
		
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);
		
	}

}
