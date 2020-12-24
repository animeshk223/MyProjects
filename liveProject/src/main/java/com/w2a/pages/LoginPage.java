package com.w2a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
	WebElement bankManagerLoginBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String validateLoginPageUrl() {
		return driver.getCurrentUrl();
	}
	
	 public void loginAsBankManager() { 
	 bankManagerLoginBtn.click();
	 
	 }
	 
}
