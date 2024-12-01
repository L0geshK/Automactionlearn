package com.UI.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.UI.Utility.BrowserUtility;

public class LoginPage extends BrowserUtility{
	
	
	public LoginPage(WebDriver driver) {
		 super(driver);
	}
   private 	static final By email_Locator = By.id("email");
   private static final By Pass_locator =By.id("passwd");
   private static final By submit_locator  = By.id("SubmitLogin");
	
	public MyAccount doLoginWith(String email ,String Pass) {
		EnterText(email_Locator,email);
		EnterText(Pass_locator,Pass);
	
		
		clickOn(submit_locator);
	
		FrameByname("FrameByname");
		
		
	   MyAccount myaccount = new MyAccount(getDriver());
	   return myaccount;
		
	}

}
