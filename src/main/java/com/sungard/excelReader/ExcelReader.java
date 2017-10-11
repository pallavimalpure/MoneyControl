package com.sungard.excelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import com.sungard.models.Register;

public class ExcelReader 
{
	
	public HSSFSheet getSheet(String fpath)
	{
	  HSSFWorkbook wb;
	  HSSFSheet sheet;
	  FileInputStream fis = null;
	  
	  try 
	  {
		fis = new FileInputStream(fpath);
		wb = new HSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		return sheet;
	  } 
	  catch (FileNotFoundException e) 
	  {
		e.printStackTrace();
		return null;
	  } 
	  catch (IOException e) 
	  {
		e.printStackTrace();
		return null;
	  }
/*	  finally
	  {
		  if (fis != null)
		  {
			  try 
			  {
				fis.close();
			} catch (IOException e) 
			  {
				e.printStackTrace();
			}
		  }
	  }*/
	}  
}
