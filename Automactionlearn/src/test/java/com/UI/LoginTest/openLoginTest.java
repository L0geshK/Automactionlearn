package com.UI.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.UI.Page.Homepage;
import com.UI.Page.LoginPage;
import com.UI.Utility.BrowserUtility;

public class openLoginTest {

	public WebDriver Driver;
	
	@Test
	public  void launchbrowserlogin() {
		Driver = new ChromeDriver();
		
		Homepage h1 = new Homepage(Driver);
		LoginPage loginpage = h1.gotologinpage();
	String username=loginpage.doLoginWith("wejido8886@cpaurl.com", "Passcode").getUserName();
		System.out.println(username);
		
//		BrowserUtility utility = new BrowserUtility(Driver);
//		
//		
//		utility.gotourl("http://www.automationpractice.pl/index.php");
//		utility.maximun();
//		
//		
////		Driver.get("http://www.automationpractice.pl/index.php");
////		Driver.manage().window().maximize();
////		
//	By Sign=	By.xpath("//*[@class='header_user_info']");
//	utility.clickOn(Sign);
//	
//	By email = By.id("email");
//	//Driver.findElement(email).sendKeys("wejido8886@cpaurl.com");
//	utility.EnterText(email, "wejido8886@cpaurl.com");
//	
//	By Pass =By.id("passwd");
//	//Driver.findElement(Pass).sendKeys("Passcode");
//	utility.EnterText(Pass, "Passcode");
//	
//	By submit = By.id("SubmitLogin");
//	utility.clickOn(submit);
//		
//		
	}
	@AfterTest
	public void CloseBrowser() {
		Driver.quit();
	}
	
	
}
