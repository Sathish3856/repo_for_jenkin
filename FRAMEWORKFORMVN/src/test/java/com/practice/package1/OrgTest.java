package com.practice.package1;

import org.testng.annotations.Test;

public class OrgTest
{
	@Test(groups = "regression")
	public void createOrgTest()
	{
		System.out.println("Execute createOrg test");
		System.out.println("Execute  regression test");

	}
	
	@Test(groups = "regression")
	public void modifyContactTest()
	{
		System.out.println("Modify Org test");
		System.out.println("Execute  regression test");

	}

}
