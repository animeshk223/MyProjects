package com.w2a.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.pages.BankManagerPage;
import com.w2a.pages.LoginPage;

public class BankManagerPageTest extends TestBase{
	
	LoginPage loginPage;
	BankManagerPage bankManagerPage;
	
	
	public BankManagerPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginPage = new LoginPage();
		loginPage.loginAsBankManager();
		bankManagerPage = new BankManagerPage();
		System.out.println("BankManagerPageTest_@BeforeMethod_setup");

	}
	
	@Test
	public void validateBankManagerPageUrl() {
		boolean bankManagerPageFlag = bankManagerPage.validateBankManagerPage();
		//Assert.assertTrue(bankManagerPageFlag);
		System.out.println("BankManagerPageTest_@Test_validateBankManagerPageUrl");
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("BankManagerPageTest_@AfterMethod_teardown");
		driver.quit();
		
	}
}


