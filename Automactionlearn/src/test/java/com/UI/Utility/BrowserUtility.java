package com.UI.Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public  abstract class  BrowserUtility {
	
	private WebDriver driver;  //Instance variable (Constructor are use to intialize intance variable)
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver=driver;
	}
	
	public  void gotourl(String url) {
		driver.get(url);
		
	}
	
	public void maximun( ) {
		driver.manage().window().maximize();
	}
	
	
	public void clickOn(By Locatoer) {
	 WebElement element= driver.findElement(Locatoer);
	 element.click();
	}
	
	public void EnterText(By locator,String Entertext) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(Entertext);
	}
	
	public String getusername(By Locatoer) {
		WebElement element = driver.findElement(Locatoer);
		return element.getText();
		
	}
	
	public void SelectValueFromDropDown(WebElement element,String value) {
		
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	public void FrameByname(String name) {
		driver.switchTo().frame(name);
	}
	
	public void Waitelement(WebDriver driver,WebElement Element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(Element)).click();
		
	}
}



