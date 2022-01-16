package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POMUpdate {
	public static void main(String[] args) throws IOException {
File f=new File("C:\\Users\\Baby\\eclipse-workspace\\Maven10\\target\\TestData\\GreensData.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet s=wb.getSheet("GreensTech");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row allrows = s.getRow(i);
			
			
			for (int j = 0; j < allrows.getPhysicalNumberOfCells(); j++) {
				Cell allcells = allrows.getCell(j);
				
				int cellType = allcells.getCellType();
				
				if (cellType==1) {
					String value = allcells.getStringCellValue();
					if (value.contains("london")) {
						allcells.setCellValue("Brane");
						FileOutputStream fout=new FileOutputStream(f);
						wb.write(fout);
						System.out.println("inside if success");
				}
				
					
					
					
				}
			}
		}
				
				System.out.println("SUCCESS");
	}

}