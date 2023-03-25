package com.primusbank.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.primusbank.constants.PrimusBankConstants;
import com.primusbank.library.AdminHomePage;
import com.primusbank.library.PrimusBankHomePage;

public class AdminLoginTest extends PrimusBankConstants 
{

	@Test
	public void adminLoginTest()
	{
		boolean res;
		PrimusBankHomePage phome=new PrimusBankHomePage();
		phome.adminuid="Admin";
		phome.adminpwd="Admin";
		res=phome.adminLogin(phome.adminuid, phome.adminpwd);
		Assert.assertTrue(res);
		AdminHomePage ahome=new AdminHomePage();
		ahome.adminLogout();
	}
	
	
	
	
	
	
	
}
