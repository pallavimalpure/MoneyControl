package com.sungard.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click extends BaseKeyword{
	
	public Object Execute(WebDriver driver, By Locator) 
	{
		driver.findElement(Locator).click();
		return driver;
	}

}
