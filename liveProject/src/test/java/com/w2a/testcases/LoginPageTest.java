package com.w2a.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.pages.LoginPage;
import com.w2a.pages.BankManagerPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	BankManagerPage bankManagerPage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		System.out.println("LoginPageTest_@BeforeMethod_setup");
	}
	
	@Test (priority=1)
	public void loginPageUrlTest() {
		String url = loginPage.validateLoginPageUrl();
		Assert.assertEquals(url, "http://www.way2automation.com/angularjs-protractor/banking/#/login");
		System.out.println("LoginPageTest_@Test_loginPageUrlTest");
	}
	
	
	@AfterMethod
	public void teardown() {
		System.out.println("LoginPageTest_@AfterMethod_teardown");
		driver.quit();
	}
}
