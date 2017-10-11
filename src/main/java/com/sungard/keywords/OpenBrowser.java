package com.sungard.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.sungard.configHelper.ConfigHelper;

public class OpenBrowser extends BaseKeyword
{
	WebDriver driver;
	
	@Override
	public Object Execute() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yewal\\eclipse-workspace\\OpalCardOrder\\Resources\\chromedriver.exe");
		String Browser = ConfigHelper.getGetconfig().getBrowser();
		switch(Browser)
		{
			case "Chrome":
				driver = new ChromeDriver();
				break;
			case "IE":
				driver = new InternetExplorerDriver();
				break;
			case "FireFox":
				driver = new FirefoxDriver();
				break;
			default:
				driver = new FirefoxDriver();
				break;
		}
		
		String URL = ConfigHelper.getGetconfig().getUrl();
		driver.get(URL);
		driver.manage().window().maximize();
		
		return driver;
	}
	
}
