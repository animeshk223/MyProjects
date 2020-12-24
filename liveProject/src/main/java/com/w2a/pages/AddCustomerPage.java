package com.w2a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.TestBase;
import com.w2a.utils.TestUtil;

public class AddCustomerPage extends TestBase {
	
	
	@FindBy(xpath = "//input[@type='text' and @ng-model='fName']")
	WebElement firstNameText;
	
	@FindBy(xpath = "//input[@type='text' and @ng-model='lName']")
	WebElement lastNameText;
	
	@FindBy(xpath = "//input[@type='text' and @ng-model='postCd']")
	WebElement postCode;
	
	@FindBy(xpath = "//button[@type='submit' and text()='Add Customer']")
	WebElement addCustBttn;
	
	public AddCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateAddCustPage() {
		
		boolean flagAddCustPage = firstNameText.isDisplayed();
		return flagAddCustPage;
	}
	
	public void validateCustomerAdded() {
		addCustBttn.click();
	}
	
	
	public void enterFirstName(String Fname) {
		firstNameText.clear();
		firstNameText.sendKeys(Fname);
	}
	
	public void enterLastName(String Lname) {
		lastNameText.clear();
		lastNameText.sendKeys(Lname);
	}
	
	public void enterPostCode(String pCode) {
		postCode.clear();
		postCode.sendKeys(pCode);
	}
	
	
}
