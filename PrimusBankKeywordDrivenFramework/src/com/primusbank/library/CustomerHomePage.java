package com.primusbank.library;

import org.openqa.selenium.By;

import com.primusbank.constants.PrimusBankConstants;

public class CustomerHomePage extends PrimusBankConstants 
{

	public boolean customerLogout()
	{
		driver.findElement(By.xpath("//table/tbody/tr/td[3]/a/img")).click();
		if (driver.findElement(By.id("login")).isDisplayed()) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
	
}
