package org.group;

import org.testng.annotations.Test;

public class Griuptest {
@Test(groups="regression")
	
	private void tc33() {
		System.out.println("Test 33");

	}
	@Test(groups= {"sanity,regression"})
	
	private void tc11() {
		
		System.out.println("Test 11");

}
	@Test(groups="sanity")
	private void tc22() {
		System.out.println("Test 22");
}

}




