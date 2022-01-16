package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class BrowserLaunch extends BaseClass {
	public static void main(String[] args) throws IOException {
		launchchrome();
		loadurl("https://www.facebook.com/");
		winMax();
		LoginPojo l=new LoginPojo();
		
		fill(l.getTxtuser(),getData(1,0));
		
		fill(l.getTxtpass(),getData(1,0));
		printTitle();
		printcurrentUrl();
		
		btnClick(l.getLogin());
		
	}

	


	
	

}
