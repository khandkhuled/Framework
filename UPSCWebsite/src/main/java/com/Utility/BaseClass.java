package com.Utility;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ConfigDataProvider config;
	
	@BeforeSuite
	public void BS() throws Exception {
	 excel=new ExcelDataProvider();
	 config=new ConfigDataProvider();
	 
	}
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void setup(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get(config.getBaseUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
