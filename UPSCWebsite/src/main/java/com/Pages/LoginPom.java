package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),Helpline)]")
	private WebElement helpline;
	
	@FindBy(how=How.XPATH,using="//h4[contains(text(),'Contact')]")
	private WebElement contactus;
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),Helpline)]")
	private WebElement btn_login;
	
	@FindBy(how=How.XPATH,using="//h4[text()='Skip To Main Content']")
	pir
	///
	public WebElement get_Helpline() {
		return helpline;
	}
		
		public WebElement get_ContactUs() {
			return contactus;
	}

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_password() {
		return txt_password;
	}


	public WebElement getBtn_login() {
		return btn_login;
	}

	

}
