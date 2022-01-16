package org.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class Paa extends BaseClass {

	@Test
	private void tc22() {
		
		System.out.println("TC2: "+Thread.currentThread().getId());
		launchchrome();
		loadurl("https://www.facebook.com/");
		winMax();
		WebElement username = driver.findElement(By.id("email"));
		fill(username, "ramya");
		WebElement password = driver.findElement(By.id("pass"));
		fill(password, "raty");

	}
	@Test
	private void tc11() {
		System.out.println("TC1: "+Thread.currentThread().getId());
		launchchrome();
		loadurl("https://www.amazon.in/");
		winMax();

	}
	@Test
private void tc31() {
	System.out.println("TC3: "+Thread.currentThread().getId());
	launchchrome();
	loadurl("https://www.snapdeal.com/");
	winMax();


}
}
