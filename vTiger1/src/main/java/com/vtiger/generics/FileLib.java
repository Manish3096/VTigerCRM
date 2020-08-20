package com.vtiger.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/data/vTigerCommonData.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis= new FileInputStream("./src/test/resources/data/VtigerTestScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		return data;
	}
	
	public void setExcelData(String sheetname,int row,int cell,String setValue) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/data/VtigerTestScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(setValue);
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data/VtigerTestScript.xlsx");
		wb.write(fos);
		wb.close();
	}

}
