package com.w2a.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.LogStatus;
import com.w2a.utils.TakeScreenShot1;

public class CustomListener extends ExtentReportManager implements ITestListener {

	public void onTestStart(ITestResult result) {

		extentTest = extent.startTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {

		extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
		extent.endTest(extentTest);

	}

	public void onTestFailure(ITestResult result) {

		extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
		extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in
		// extent report
		try {
			String screenshotPath = TakeScreenShot1.takeScreenShot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extent.endTest(extentTest);

	}

	public void onTestSkipped(ITestResult result) {

		extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		extent.endTest(extentTest);

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		if(extent == null) {
		setExtent();
		}
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		if (extent != null) {
			extent.flush();
			}
		
		}

}
