package com.practice.mvn;

import org.testng.annotations.Test;

public class ContactTest 
{
	@Test(groups = "smoke")
	public void createContactTest()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser","chrome");
		System.out.println(URL);
		System.out.println(BROWSER);
		

		System.out.println("Execute create contact test");
		System.out.println("Execute create smoke test");
		
	}
	
	@Test(groups = "smoke")
	public void modifyContactTest()
	{
		System.out.println("Modify contact test");
		System.out.println("Execute create smoke test");

	}

}
