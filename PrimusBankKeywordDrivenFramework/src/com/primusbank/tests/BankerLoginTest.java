package com.primusbank.tests;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.primusbank.constants.PrimusBankConstants;
import com.primusbank.library.BankerHomePage;
import com.primusbank.library.PrimusBankHomePage;

public class BankerLoginTest extends PrimusBankConstants 
{
	@Test
	public void bankerLoginTest()
	{
		
		boolean res;
		PrimusBankHomePage phome=new PrimusBankHomePage();
		phome.branchname="Ameerpet";
		phome.bankeruid="Richards";
		phome.bankerpwd="demo";
		res=phome.bankerLogin(phome.branchname, phome.bankeruid, phome.bankerpwd);
		Assert.assertTrue(res);		
		BankerHomePage bhome=new BankerHomePage();
		bhome.bankerLogout();  
		
	}
	
}
