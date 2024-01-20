package com.Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	
	public static ExtentTest test;
	
	//Send Keys
	public static void custom_sendkeys (WebElement element,String value, String Fieldname) {
		try {
		element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	//Element Click
	public static void custom_click(WebElement element) {
		try {
		element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//Alert Handle
	public static Alert cutom_HandleAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	//Handle Iframe by name
	public static void custom_HandleIFrame_name(WebDriver driver, String Name) {
		driver.switchTo().frame(Name);
		
	}
	//Handle Iframe by identifying WebElement
	public static void custom_HandleIFrame_Webelement(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
		
	}
	//To return main page from IFrame
		public static void custom_HandleIFrame_MainPage(WebDriver driver) {
			driver.switchTo().defaultContent();
			
		}
	// Dropdown
		public static void custom_HandleDropdown(WebElement element, String value) {
			Select select=new Select(element);
			select.selectByVisibleText(value);
			
		}
		
	
}
