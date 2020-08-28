package com.Tiger2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream f = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(f);
		String value = p.getProperty(key);
		return value; 
	}
	
	public String getExcelData(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		FileInputStream f = new FileInputStream("./data/Vtiger_PIS_testscript.xlsx");
		Workbook w=WorkbookFactory.create(f);
		String data = w.getSheet(sheetname).getRow(row).getCell(cell).toString();
		return data;
	}
	
	public void setExcelData(String sheetname,int row, int cell,String setvalue) throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		FileInputStream f = new FileInputStream("./data/Testscript1.xlsx");
		Workbook w=WorkbookFactory.create(f);
		w.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(setvalue);
		FileOutputStream fo = new FileOutputStream("./data/Testscript1.xlsx");
		w.write(fo);
		w.close();
	}
}
