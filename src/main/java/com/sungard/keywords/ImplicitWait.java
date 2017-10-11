package com.sungard.keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ImplicitWait extends BaseKeyword
{
	public Object Execute(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
