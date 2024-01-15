package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1 extends BaseClass {
	
	@Test
	public void verifyLogin_FB () {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_sendkeys(login.getTxt_email(), "Test","Email ID");
		Library.custom_sendkeys(login.getTxt_password(), "@1234","Password");
		Library.custom_click(login.getBtn_login(),"Login Button");
		
		
		//Verify
		String title=driver.getTitle();  // Actual Title
		String Etitle="Facebook";  
		
		Assert.assertEquals(title, Etitle);
	}

}
