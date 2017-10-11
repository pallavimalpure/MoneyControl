package com.sungard.tests;

import org.testng.annotations.Test;

import com.sungard.keywords.ExplicitWait;
import com.sungard.keywords.IKeyword;
import com.sungard.keywords.ImplicitWait;
import com.sungard.keywords.OpenBrowser;
import com.sungard.models.Register;
import com.sungard.pageAction.RegisterActions;
import com.sungard.pageObject.RegisterObjects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import com.sungard.DAO.*;

public class RegisterTest 
{
	WebDriver driver;
	
  @Test(dataProvider = "RegisterData")
  public void isRegisterSuccessfully(Register regObj) 
  {
	  RegisterActions regAct = new RegisterActions(driver);

	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	  
	  regAct.RegisterClick();
	  regAct.SelectCountry(regObj.Country);
	  regAct.SetFirstName(regObj.FirstName);
	  
  
	  ImplicitWait impwait = new ImplicitWait();
	  impwait.Execute(driver);
	  
	  ExplicitWait expWait = new ExplicitWait();
	  WebElement element = (WebElement) expWait.Execute(driver, RegisterObjects.HomePage);
	  element.click();
	  //regAct.ClickHomePage();
  }

  @DataProvider(name = "RegisterData")
  public Object[][] dp() 
  {
	  String fpath = "./TestData/RegisterData.xls";
	  String str = this.toString();
	  RegisterDAO regDAO = new RegisterDAO();
	  List<Register> regList = regDAO.loadExcelData(fpath);
	  
	  //Second dimension of array represents no of parameters to test method
	  Object[][] records = new Object[regList.size()][1];
	  
	  for(int i = 0; i< regList.size();i++)
	  {
		  records[i][0] = regList.get(i);
	  }
	  
	  
	  return records;
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	  OpenBrowser openBrowser = new OpenBrowser();
	  driver = (WebDriver) openBrowser.Execute();
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
	  
  }

}
