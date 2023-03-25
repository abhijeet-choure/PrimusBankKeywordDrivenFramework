package com.primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.primusbank.constants.AdminModuleConstants;
import com.primusbank.library.AdminHomePage;
import com.primusbank.library.Branch;

public class NewBranchCreationTest extends AdminModuleConstants 
{
	
	@Test
	public void newBranchCreation()
	{
		AdminHomePage ahome=new AdminHomePage();
		ahome.navigateToBranchDetailsPage();
		Branch br=new Branch();
		br.brname="MyBranch4";
		br.add1="TestAdd1";
		br.zipcode="12345";
		br.country="INDIA";
		br.state="Andhra Pradesh";
		br.city="Hyderabad";
		boolean res;
		res=br.createBranch(br.brname, br.add1, br.zipcode, br.country, br.state, br.city);
		Assert.assertTrue(res);		
	}
	
	
}
