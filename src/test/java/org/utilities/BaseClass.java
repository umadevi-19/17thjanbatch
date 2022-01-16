package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Alert a;
	public static Actions b;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Select s;
	
	public static void launchchrome() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
	}
	public static void loadurl(String url) {
		 	 	driver.get(url);

}
	public static void winMax() {
		driver.manage().window().maximize();

	}
	
	public static void fill(WebElement ele,String value) {
		ele.sendKeys(value);
		
	}
	
	public static void btnClick(WebElement ele) {
		ele.click();
	

}
	public static void printTitle() {
	System.out.println(driver.getTitle());
}
	public static void printcurrentUrl() {
		System.out.println(driver.getCurrentUrl());

}
	public static void  quitbrowser() {
	driver.quit();
	

}
	public static void closebrowser() {
		driver.close();
		

	}
	public static void urlrefresh() {
		driver.navigate().refresh();

	}
	public static void urlnavigate() {
		driver.navigate().back();

		
	}
	public static void pagesource() {
	driver.getPageSource();

}
	public static void gettxt(WebElement ele) {
		String text1 = ele.getText();
		System.out.println(text1);
	

}

	public static void acceptalert() {
		a = driver.switchTo().alert();
        a.accept();

	}
	
	public static void dismissalert() {
	a=driver.switchTo().alert();
	a.dismiss();
}
	
	public static void alertwithtextbox(String value) {
		a=driver.switchTo().alert();
		a.sendKeys(value);
	}
	public static void textfromalert() {
		a=driver.switchTo().alert();
		System.out.println(a.getText());

	}
	public static void dragdrop(WebElement src,WebElement destn) {
		
		 b = new Actions(driver);
		 b.dragAndDrop(src, destn).perform();
	}
	public static void mouseover(WebElement ele) {
		b = new Actions(driver);
		b.moveToElement(ele).build().perform();
		

	}
	public static void screenshot(String snap) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\Baby\\eclipse-workspace\\Maven10\\Screenshot\\"+snap+".png");
		FileUtils.copyFile(Source, target);

	}
	public static void doubleclick(WebElement ele) {
		b = new Actions(driver);
		b.doubleClick(ele).perform();
	}
	public static void contextclick(WebElement ele) {
		b = new Actions(driver);
		b.contextClick(ele).perform();;

	}
	public static void clickfirst() throws AWTException {
		r=new Robot();
	    r.keyPress(KeyEvent.VK_UP);
	    r.keyRelease(KeyEvent.VK_UP);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void clicklast() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);

	}
	public static void robocopy() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_C);
		
	}
	public static void robopaste() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);

	}
	public static void roboselectall() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_A);

	}
	public static void robotab() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		
	    r.keyRelease(KeyEvent.VK_TAB);

	}
	public static void roboCut() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_X);

	}
	public static void scrolldown(WebElement ele) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
	public static void scrollup(WebElement ele) {
		js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(false)", ele);

	}
	public static void singledrop(WebElement ele,String value) {
		s=new Select(ele);
		s.selectByValue(value);

	}
	public static void singleDropVisibletext(WebElement ele,String value) {
		s=new Select(ele);
		s.selectByVisibleText(value);

	}
	public static void singleDropIndex(WebElement ele,int index) {
		s=new Select(ele);
		s.selectByIndex(index);

	}
	public static void deselectSingledrop(WebElement ele,String value) {
		s=new Select(ele);
		s.deselectByValue(value);

	}
	public static void deselectSingledropvisible(WebElement ele,String value) {
		s=new Select(ele);
		s.deselectByVisibleText(value);

	}
	public static void deselectSingledropIndex(WebElement ele,int index) {
		s=new Select(ele);
s.deselectByIndex(index);
	}
	public static void ismultipleSelect(WebElement ele) {
	s=new Select(ele);
	boolean y = s.isMultiple();
	System.out.println(y);
	

	}
	public static String getData(int rowNumber, int cellNumber) throws IOException {
		File f = new File("C:\\Users\\Baby\\eclipse-workspace\\Maven10\\Excel files\\Details.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("GreensTech");
		
		Row row = s.getRow(rowNumber);
		Cell cell = row.getCell(cellNumber);
		
		int cellType = cell.getCellType();
		
		String value =" ";
		if (cellType == 1) {
			value = cell.getStringCellValue();			
		}else if (cellType == 0) {
			if(DateUtil.isCellInternalDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				
				SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
				value = sim.format(d);
				
				
			}else {
				
				
				double d = cell.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);

	}
		

		}
		return value;
		}

	public static void quitchrome() {
		driver.quit();

	}


}


