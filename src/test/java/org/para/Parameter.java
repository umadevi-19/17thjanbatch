package org.para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;


public class Parameter extends BaseClass {
	@BeforeClass
	private void chrome() {
		launchchrome();
loadurl("https://www.facebook.com/");
winMax();

	}
	@Parameters({"Username","Password"})
	@Test
	
private void tc1(@Optional("Selnium") String usertxt,@Optional("python")String passtxt) {
	WebElement username = driver.findElement(By.id("email"));
	fill(username, usertxt);
	WebElement password = driver.findElement(By.id("pass"));
	fill(password, passtxt);

}
}
