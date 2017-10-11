package com.sungard.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterText extends BaseKeyword
{
	@Override
	public Object Execute(WebDriver driver, String valueToSet, By Locator) 
	{
		driver.findElement(Locator).sendKeys(valueToSet);
		return driver;
	}
}
