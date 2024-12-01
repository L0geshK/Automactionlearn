package com.UI.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.UI.Utility.BrowserUtility;



public  final class Homepage extends BrowserUtility  {
	
	 private  static  final By Sign_Loactor =By.xpath("//*[@class='header_user_info']");
	
	 
	 public  Homepage(WebDriver driver) {
		 super(driver);
		 gotourl("http://www.automationpractice.pl/index.php");
		 maximun();
		 
	 }
	 
	
	public LoginPage gotologinpage() {//page function---> in page object desgin 
		clickOn(Sign_Loactor);
		LoginPage login = new LoginPage(getDriver());
			return login;
		
	}



}
