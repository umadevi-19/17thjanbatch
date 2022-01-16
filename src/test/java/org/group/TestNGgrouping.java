package org.group;

import org.testng.annotations.Test;

public class TestNGgrouping {
	
	@Test(groups="regression")
	
	private void tc3() {
		System.out.println("Test 3");

	}
	@Test(groups="smoke")
	
	private void tc1() {
		
		System.out.println("Test 1");

}
	@Test(groups="smoke")
	private void tc2() {
		System.out.println("Test 2");
}

}

