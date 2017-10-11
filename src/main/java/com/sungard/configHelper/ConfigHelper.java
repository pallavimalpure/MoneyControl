package com.sungard.configHelper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//Config helper class
public class ConfigHelper
{
	private String url = null;
	private String filePath = null;		
	private String browser = null;
	private String register = null;

	InputStream input = null;
	
	static ConfigHelper getconfig = new ConfigHelper();
	
	public static ConfigHelper getGetconfig() {
		return getconfig;
	}

	private ConfigHelper()
	{
		ReadProperties();
	}
		
	public String getUrl() 
	{
		return url;
	}

	public String getFilePath() 
	{
		return filePath;
	}

	public String getBrowser()
	{
		return browser;
	}
	
	public String getRegister() 
	{
		return register;
	}

	private void ReadProperties()
	{
		Properties prop = new Properties();
		try 
		{
			input = new FileInputStream("config.properties");
			prop.load(input);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		url = prop.getProperty("URL");
		filePath = prop.getProperty("filepath");
		browser = prop.getProperty("browser");
		register = prop.getProperty("Register");
	}
	
}
