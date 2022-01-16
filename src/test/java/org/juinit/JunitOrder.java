package org.juinit;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;

import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class JunitOrder extends BaseClass {
	
	
	@BeforeClass
	public static void browserLaunch() {
		launchchrome();
		winMax();
		

	}
@AfterClass
public static void closeTheBrowser() {
	closebrowser();

}
@Before
public void startTime() {
	loadurl("https://www.facebook.com/");
Date d=new Date();	
System.out.println(d);
}
@After
public void endTime() {
	loadurl("https://www.facebook.com/");
	Date d=new Date();	
	System.out.println(d);

}
@Test
public void tc3() throws IOException, InterruptedException {
	String title = driver.getTitle();
	Assert.assertTrue("check spell", title.contains("Facebook"));
	LoginPojo l=new LoginPojo();
	fill(l.getTxtuser(), getData(3, 0));
	fill(l.getTxtpass(), getData(3, 2));
	btnClick(l.getLogin());
	Thread.sleep(2000);

}
@Test
public void tc1() throws IOException, InterruptedException {
	LoginPojo l=new LoginPojo();
	fill(l.getTxtuser(), getData(2, 0));
	fill(l.getTxtpass(), getData(1, 1));
	btnClick(l.getLogin());
	Thread.sleep(2000);
}
@Test
public void tc2() throws IOException, InterruptedException {
	LoginPojo l=new LoginPojo();
	fill(l.getTxtuser(), getData(1, 0));
	fill(l.getTxtpass(), getData(3, 1));
	btnClick(l.getLogin());
	Thread.sleep(2000);
}
}