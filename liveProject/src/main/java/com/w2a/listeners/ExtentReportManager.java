package com.w2a.listeners;

import java.io.File;
import java.io.IOException;

import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.TestBase;
import com.w2a.pages.FreeCRMTest;

public class ExtentReportManager extends TestBase {

	
	public static ExtentReports extent;
	public static  ExtentTest extentTest;

	public void setExtent() {
		
		System.out.println("user directory:--->"+System.getProperty("user.dir"));
		extent = new ExtentReports(System.getProperty("user.dir")+File.separator+"\\ExtentReport.html", true);
		extent.addSystemInfo("Host Name", "Animesh Windows");
		extent.addSystemInfo("User Name", "Animesh's Workstation");
		extent.addSystemInfo("Environment", "QA");
		
	}
	

	public void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in
																							// extent report

			String screenshotPath = FreeCRMTest.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); // to add screenshot in extent
																							// report
			// extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath));
			// //to add screencast/video in extent report
		} else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

		}

		extent.endTest(extentTest); // ending test and ends the current test and prepare to create html report

	}

	public void endReport() {
		extent.flush();
		extent.close();
	}

}
