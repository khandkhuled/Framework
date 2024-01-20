package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;


public class Test11_ContactUs extends BaseClass {
	
	@Test
	public void VerifyContactUs() throws Exception {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_click(login.get_ContactUs());
		Thread.sleep(5000);
		
		//Verify
		 String title=driver.getTitle();  // Actual Title
		 System.out.println(title);
		 String Expected_title="1Contact Us";
		 
		 SoftAssert softAssert = new SoftAssert();
		 
		 softAssert.assertEquals(title, Expected_title);
		 
		 
//		Call assertAll() at the end to mark the test as failed if any soft assert fails
		 softAssert.assertAll();

	}
	
	

}
