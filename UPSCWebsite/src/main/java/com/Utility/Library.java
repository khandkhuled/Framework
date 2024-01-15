package com.Utility;

import org.openqa.selenium.WebElement;

public class Library {
	
	public static void custom_sendkeys (WebElement element,String value, String Fieldname) {
		try {
		element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	public static void custom_click(WebElement element,String Fieldname) {
		try {
		element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
