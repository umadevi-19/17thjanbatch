package org.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Testcase extends BaseClass {
	@Parameters("browser")
	@Test
	
	private void tc2(String browsername) {
		
		WebDriver driver;
		
		if (browsername.equals("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if (browsername.equals("firefoxbrowser")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();	
				
		}
		winMax();
		loadurl("https://www.facebook.com/");
	}
	
}