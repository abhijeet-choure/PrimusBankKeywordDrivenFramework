package com.primusbank.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

import com.primusbank.constants.PrimusBankConstants;

public class PrimusBankHomePage extends PrimusBankConstants 
{
	
	public String adminuid;
	public String adminpwd;
	public String branchname;
	public String bankeruid;
	public String bankerpwd;
	public String custuid;
	public String custpwd;
	
	
	public void login(String uid,String pwd)
	{
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		//Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();		
	}
	
	
	
	public boolean adminLogin(String uid,String pwd)
	{
		String expurl,acturl;
		expurl="adminflow";
		login(uid, pwd);
		acturl=driver.getCurrentUrl();
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
	
	public boolean bankerLogin(String brname,String uid,String pwd)
	{
		String expurl,acturl;
		expurl="Bankers_flow";
		WebElement brlistelement;
		brlistelement=driver.findElement(By.id("drlist"));
		Select brlist=new Select(brlistelement);
		brlist.selectByVisibleText(brname);
		login(uid, pwd);
		//Sleeper.sleepTightInSeconds(5);
		acturl=driver.getCurrentUrl();
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		{
			return true;
		} else 
		{
			return false;
		}
		
		
	}
	
	
	public boolean customerLogin(String uid,String pwd)
	{
		String expurl,acturl;
		expurl="personal_bank";
		driver.findElement(By.id("personal")).click();
		driver.findElement(By.id("idtxt")).sendKeys(uid);
		driver.findElement(By.id("pswdtxt")).sendKeys(pwd);
		driver.findElement(By.id("btnGO")).click();
		acturl=driver.getCurrentUrl();
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
	
	
	
	
	
}
