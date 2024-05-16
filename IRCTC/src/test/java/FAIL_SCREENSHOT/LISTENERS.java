package FAIL_SCREENSHOT;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class LISTENERS extends TAKE_SCREENSHOT implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("method name" + result.getName());
		System.out.println("test is starting");
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("method status" + result.getStatus());
		System.out.println("test success");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped ");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test is failed!!!!!!!!!!!!!!!!!");
		try {
			takess1();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
