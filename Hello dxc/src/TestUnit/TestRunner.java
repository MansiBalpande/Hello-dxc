package TestUnit;

import java.time.temporal.TemporalUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestCase;

public class TestRunner extends TestCase {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TemporalUnit.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	

}
