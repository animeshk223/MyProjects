package com.w2a.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.pages.AddCustomerPage;
import com.w2a.pages.BankManagerPage;
import com.w2a.pages.LoginPage;
import com.w2a.utils.ExcelUtilTest;


public class AddCustomerPageTest extends TestBase{
	
	LoginPage loginPage;
	BankManagerPage bankManagerPage;
	AddCustomerPage addCustomerPage;
	
	public AddCustomerPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		loginPage.loginAsBankManager();
		bankManagerPage = new BankManagerPage();
		bankManagerPage.clickOnAddCustomerBttn();
		addCustomerPage = new AddCustomerPage();
		System.out.println("AddCustomerPageTest_@BeforeTest_setup");
	}
	
	
	 @Test
	 public void validateAddCustPageTest() {
	 Assert.assertTrue(addCustomerPage.validateAddCustPage()); 
	 System.out.println("AddCustomerPageTest_@Test_validateAddCustPageTest");
	 }
	 
	 
		
	 @Test(dataProvider="dp")
		public void validateCustomerAddedTest(String fname,String lName,String pCode) {	
			addCustomerPage.enterFirstName(fname);
			addCustomerPage.enterLastName(lName);
			addCustomerPage.enterPostCode(pCode);
			addCustomerPage.validateCustomerAdded();
			
			System.out.println("AddCustomerPageTest_@Test_validateCustomerAddedTest");
			//validation of add customer
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			Assert.assertTrue(alert.getText().contains("Customer added successfully with customer id"));
			alert.accept();
		}
	 
	 @DataProvider(name = "dp")
		public Iterator<Object[]> getTestData(){
			ArrayList<Object[]> testData = ExcelUtilTest.getDataFromExcel();
			for(Object[] ob:testData) {
			}
			return testData.iterator();
		}
		
	
	
	
	@AfterMethod
	public void teardown() {
		
		System.out.println("AddCustomerPageTest_@AfterTest_teardown");
		driver.quit();
	}
	
}
