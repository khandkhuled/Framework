package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePom {
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),Helpline)]")
	private WebElement Helpline;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Contact')]")
	private WebElement ContactUs;
	

}
