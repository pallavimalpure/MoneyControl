package com.sungard.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown extends BaseKeyword
{
	@Override
	public Object Execute(WebDriver driver, String valueToSet, By Locator) 
	{
		WebElement element = driver.findElement(Locator);
		Select sel = new Select(element);
		sel.selectByValue(valueToSet);
		return driver;
	}

}
