package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1_HomePageNavigation extends BaseClass {
	
	@Test
	public void verify_HomePageNavigation () {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_sendkeys(login.getTxt_email(),excel.getStringDataFrom_Excel("Login_Page", 1, 0),"Email ID");
		Library.custom_sendkeys(login.getTxt_password(), excel.getStringDataFrom_Excel("Login_Page", 1, 1),"Password");
		Library.custom_click(login.getBtn_login(),"Login Button");
		
		
		//Verify
/*		String title=driver.getTitle();  // Actual Title
		String Etitle="Facebook";  
		
		Assert.assertEquals(title, Etitle);          */
	}

}
