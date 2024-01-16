package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws Exception {
		
		String filepath="C:\\Users\\Dipak\\git\\repository2\\UPSCWebsite\\TestData\\Data.xlsx";
		
		FileInputStream file= new FileInputStream(filepath);
		wb=new XSSFWorkbook(file);	
	}
	
	public String getStringDataFrom_Excel(String sheetname, int row, int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		
	}
	public String getNumericDataFrom_Excel(String sheetname, int row, int cell) {
		double data= wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
		
		String data_string=String.valueOf(data);
		return data_string.replaceAll(".", "");
		
		
	}

}
