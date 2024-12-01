package com.UI.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.UI.Utility.BrowserUtility;

public class MyAccount extends BrowserUtility {
	
	public MyAccount(WebDriver driver) {
		 super(driver);
	}

	
	private static final By USER_NAME_LOCATOR= By.xpath("//a[@title='View my customer account']/span");
	
	
	public String getUserName() {
		return getusername(USER_NAME_LOCATOR);
		
	}
}
