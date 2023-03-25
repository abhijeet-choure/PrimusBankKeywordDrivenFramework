package com.primusbank.library;

import org.openqa.selenium.By;

import com.primusbank.constants.PrimusBankConstants;

public class AdminHomePage extends PrimusBankConstants 
{

	public boolean adminLogout()
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
	
	public void navigateToBranchDetailsPage()
	{
		driver.findElement(By.xpath("//table/tbody/tr[2]/td/a/img")).click();
	}
	
}
