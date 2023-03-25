package com.primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.primusbank.constants.PrimusBankConstants;
import com.primusbank.library.CustomerHomePage;
import com.primusbank.library.PrimusBankHomePage;

public class CustomerLoginTest extends PrimusBankConstants 
{

	@Test
	public void customerLoginTest()
	{
		boolean res;
		PrimusBankHomePage phome=new PrimusBankHomePage();
		phome.custuid="ramana";
		phome.custpwd="govinda";
		res=phome.customerLogin(phome.custuid, phome.custpwd);
		Assert.assertTrue(res);
		CustomerHomePage chome=new CustomerHomePage();
		chome.customerLogout();
	}
	
		
	
}
