package com.primusbank.constants;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.primusbank.library.AdminHomePage;
import com.primusbank.library.PrimusBankHomePage;

public class AdminModuleConstants extends PrimusBankConstants 
{
	
	@BeforeMethod
	public void adminLogin()
	{
		PrimusBankHomePage phome=new PrimusBankHomePage();
		phome.adminuid="Admin";
		phome.adminpwd="Admin";
		phome.adminLogin(phome.adminuid,phome.adminpwd);
	}
	
	@AfterMethod
	public void adminLogout()
	{
		AdminHomePage ahome=new AdminHomePage();
		ahome.adminLogout();
	}
}
