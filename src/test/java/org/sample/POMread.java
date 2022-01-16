package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POMread {
public static void main(String[] args) throws IOException, InterruptedException {
		
		File f=new File("C:\\Users\\Baby\\eclipse-workspace\\Maven10\\Excel files\\Details.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Thread.sleep(3000);
		
		Sheet s=wb.getSheet("Datas");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row allrows = s.getRow(i);
			
			
			for (int j = 0; j < allrows.getPhysicalNumberOfCells(); j++) {
				Cell cell = allrows.getCell(j);
				
				int cellType = cell.getCellType();
				
				//celltype--->1 that is string cell
				//other than 1----->datecell or numeric cell
				
				if (cellType==1) {
					
					String value = cell.getStringCellValue();
					
					System.out.println(value);
					
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date d = cell.getDateCellValue();//20-oct-2000
					
					SimpleDateFormat s1=new SimpleDateFormat("dd MMMM yyyy");
					String f1 = s1.format(d);
					System.out.println(f1);
					
					
					
				}
				else {
					double dd = cell.getNumericCellValue();
					
					long l=(long)dd;
					
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
				}
				
			}
			
			
		}

}
}