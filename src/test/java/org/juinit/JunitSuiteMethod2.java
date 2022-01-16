package org.juinit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitSuiteMethod2 {
	
 @Test
 public void tc55() {
	Result rs = JUnitCore.runClasses(Swan.class,Tiger.class);
	int runCount = rs.getRunCount();
	System.out.println("runcount is"+runCount);
	System.out.println("ignore count is"+rs.getIgnoreCount());
	System.out.println("failure count is"+rs.getFailureCount());
	System.out.println("runtime is"+rs.getRunTime());
	List<Failure> li = rs.getFailures();
	for (Failure x : li) {
		System.out.println(x);
		
	}

}


}
