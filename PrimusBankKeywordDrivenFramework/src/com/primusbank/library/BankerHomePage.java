package com.primusbank.library;

import org.openqa.selenium.By;

import com.primusbank.constants.PrimusBankConstants;

public class BankerHomePage extends PrimusBankConstants
{

	public boolean bankerLogout()
	{
		driver.findElement(By.id("IMG1")).click();
		if (driver.findElement(By.id("login")).isDisplayed()) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
}
