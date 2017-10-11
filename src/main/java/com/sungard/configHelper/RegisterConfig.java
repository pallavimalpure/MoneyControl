package com.sungard.configHelper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RegisterConfig 
{
	private String Country;
	private String FirstName;
	
	InputStream input = null;
	
	private RegisterConfig()
	{
		ReadProperties();
	}
	
	static RegisterConfig regConfig = new RegisterConfig();

	public String getCountry() 
	{
		return Country;
	}

	public static RegisterConfig getRegConfig() 
	{
		return regConfig;
	}
	
	public String getFirstName() {
		return FirstName;
	}

	private void ReadProperties()
	{
		Properties prop = new Properties();
		try 
		{
			input = new FileInputStream("register.properties");
			prop.load(input);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		Country = prop.getProperty("Country");
		FirstName = prop.getProperty("FirstName");
	}

}
