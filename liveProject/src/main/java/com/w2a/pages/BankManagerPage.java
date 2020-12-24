package com.w2a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.TestBase;

public class BankManagerPage extends TestBase{
	
	@FindBy(xpath = "//button[@ng-class='btnClass1']")
	WebElement addCustBttn;
	
	@FindBy(xpath = "//button[@ng-class='btnClass2']")
	WebElement openAcctBttn;
	
	@FindBy(xpath = "//button[@ng-class='btnClass3']")
	WebElement customersBttn;
	
	
	
	public BankManagerPage(){
		PageFactory.initElements(driver,this);
	}
	
	public boolean validateBankManagerPage() {
		boolean flag = addCustBttn.isDisplayed();
		return flag;
		
	}
	
	public AddCustomerPage clickOnAddCustomerBttn() {
		addCustBttn.click();
		return new AddCustomerPage();
	}
	
	public OpenAccount clickOnOpenAccountBttn() {
		addCustBttn.click();
		return new OpenAccount();
	}
	
	public Customers clickOnCustomersBttn() {
		addCustBttn.click();
		return new Customers();
	}
}
