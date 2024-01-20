package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test2_Helpline extends BaseClass {
	
	@Test
	public void VerifyHelpline() {
			
			LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
			Library.custom_click(login.get_Helpline());
		
		
		System.out.println("Home Page Navigation is Successfull");
	}

}
