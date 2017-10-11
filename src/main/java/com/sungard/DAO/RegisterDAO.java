package com.sungard.DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Row;

import com.sungard.excelReader.ExcelReader;
import com.sungard.models.Register;

public class RegisterDAO implements IDAO
{
	
	public List<Register> loadExcelData(String fpath)
	{
		ExcelReader excelread = new ExcelReader();
				  
	 	HSSFSheet sheet = excelread.getSheet(fpath);
	 	  
		int rcount = sheet.getPhysicalNumberOfRows();
		int ccount = sheet.getRow(1).getPhysicalNumberOfCells();
		int row, col;
		Row rw;
		Register regData = null;
		List<Register> dataList = new ArrayList<Register>();

		
		for(row =1;row < rcount ; row ++)
		{
			regData = new Register();
			rw = sheet.getRow(row);
			for(col =0;col <ccount;col++)
			{
				if(col == 1)
				{
					regData.Country = rw.getCell(col).getStringCellValue();
				}
				else if(col == 2)
				{
					regData.Title = rw.getCell(col).getStringCellValue();
				}
				else if(col == 3)
				{
					regData.FirstName = rw.getCell(col).getStringCellValue();
				}
				else if(col == 4)
				{
					regData.LastName = rw.getCell(col).getStringCellValue();
				}
				else if(col == 5)
				{
					regData.EmailId = rw.getCell(col).getStringCellValue();
				}
				else if(col == 6)
				{
					regData.Password = rw.getCell(col).getStringCellValue();
				}
				else if(col == 7)
				{
					regData.conPassword = rw.getCell(col).getStringCellValue();
				}
				else if(col == 8)
				{
					//data.rowId =  Integer.parseInt(rw.getCell(col).getStringCellValue());
					//regData.MobileNo = Integer.parseInt(rw.getCell(col).getStringCellValue());
				}
			}
			
			dataList.add(regData);
		}
	
		return dataList;
	}

}
