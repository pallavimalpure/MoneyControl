package com.sungard.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface IKeyword 
{
	Object Execute();
	Object Execute(WebDriver driver, By Locator);
	Object Execute(WebDriver driver, String valueToSet, By Locator);
}
