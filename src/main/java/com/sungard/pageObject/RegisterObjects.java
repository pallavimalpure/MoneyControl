package com.sungard.pageObject;

import org.openqa.selenium.By;

import com.sungard.configHelper.ConfigHelper;
import com.sungard.configHelper.RegisterConfig;

public class RegisterObjects 
{
	String Register = ConfigHelper.getGetconfig().getRegister();
	public By RegisterO = By.linkText(Register);
	
	String Country = RegisterConfig.getRegConfig().getCountry();
	public By country = By.id(Country);
	
	String FirstName = RegisterConfig.getRegConfig().getFirstName();
	public By firstName = By.id(FirstName);
	
	public static By HomePage = By.xpath(".//div[@class = 'logo pull-left']/a");

}
