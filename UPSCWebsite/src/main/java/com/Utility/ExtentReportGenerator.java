package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String path="C:\\Users\\Dipak\\git\\repository2\\UPSCWebsite\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("UPSC Website Cross Browser Testing Report");
//		reporter.config().setTheme(Theme.DARK);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name","UPSC Website");
		extent.setSystemInfo("Automation Tool", "Selenium WebDriver");
		extent.setSystemInfo("Operating System", "Windows 11 Pro");
		extent.setSystemInfo("QA Team", "Akanksha & Team");
		return extent;
		
	}

}
