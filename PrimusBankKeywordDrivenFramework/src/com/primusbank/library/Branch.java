package com.primusbank.library;

import javax.servlet.jsp.SkipPageException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;

import com.primusbank.constants.PrimusBankConstants;

public class Branch extends PrimusBankConstants 
{

	public String brname;
	public String add1;
	public String add2;
	public String add3;
	public String area;
	public String zipcode;
	public String country;
	public String state;
	public String city;
	
	
	
	public boolean createBranch(String branchname,String add1,String zipcode,String country,String state,String city)
	{
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(branchname);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		driver.findElement(By.id("txtZip")).sendKeys(zipcode);
		
		WebElement countryelement;
		countryelement=driver.findElement(By.id("lst_counrtyU"));
		Select countrylist=new Select(countryelement);
		try 
		{
			countrylist.selectByVisibleText(country);
		} catch (Exception e) 
		{
			throw new SkipException("given Country no Present in the List");
		}
		
		Sleeper.sleepTightInSeconds(5);
		WebElement stateelement;
		stateelement=driver.findElement(By.id("lst_stateI"));
		Select statelist=new Select(stateelement);
		try 
		{
			statelist.selectByVisibleText(state);
		} catch (Exception e) 
		{
			throw new SkipException("given State not Present in the List");
		}
		
		Sleeper.sleepTightInSeconds(5);
		WebElement cityelement;
		cityelement=driver.findElement(By.id("lst_cityI"));
		Select citylist=new Select(cityelement);
		try 
		{
			citylist.selectByVisibleText(city);
		} catch (Exception e) 
		{
			throw new SkipException("given City is not Present in the List");
		}		
		driver.findElement(By.id("btn_insert")).click();
		String alertmsg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if (alertmsg.toLowerCase().contains("new branch with")) 
		{
			return true;
		} else 
		{
			return false;
		}
		
	}
	
}
