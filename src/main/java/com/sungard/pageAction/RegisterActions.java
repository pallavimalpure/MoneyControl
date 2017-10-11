package com.sungard.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sungard.models.Register;
import com.sungard.pageObject.*;
import com.sungard.keywords.*;

public class RegisterActions 
{
	By Locator;
	RegisterObjects regWebObjs = new RegisterObjects();
	WebDriver driver;
	
	public RegisterActions(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void RegisterClick()
	{
		Locator = regWebObjs.RegisterO;
		Click ckickobj = new Click();
		ckickobj.Execute(driver,Locator);
	}
	
	public void SelectCountry(String country)
	{
		Locator = regWebObjs.country;
		SelectDropDown selobj = new SelectDropDown();
		selobj.Execute(driver, country, Locator);
		
	}
	
	public void SetFirstName(String FirstName)
	{
		Locator = regWebObjs.firstName;
		EnterText selobj = new EnterText();
		selobj.Execute(driver, FirstName, Locator);
		
	}
	
	public void ClickHomePage()
	{
		Locator = regWebObjs.HomePage;
		Click ckickobj = new Click();
		ckickobj.Execute(driver,Locator);
	}
}
