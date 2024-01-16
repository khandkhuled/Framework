package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	
	Properties pro ;
	public ConfigDataProvider () throws Exception {
		
		String path="C:\\Users\\Dipak\\git\\repository2\\UPSCWebsite\\Config\\config.Properties";
		
		FileInputStream fis=new FileInputStream(path);
		
		 pro=new Properties();
		pro.load(fis);
				
	}
	public String getBaseUrl () {
		return pro.getProperty("BaseUrl");
		
	}

}
