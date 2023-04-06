package com.mavenPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenTest 
{
	@Test(groups = "smoke")
	public void testScript1()
	{
		Reporter.log("-----Test Case :-1 Executed Smoke-----",true);
	}
	
	@Test(groups = "regression")
	public void testScript2()
	{
		Reporter.log("-----Test Case :-2 Executed Regression -----",true);
	}
	@Test(groups = "regression")
	public void testScript3()
	{
		Reporter.log("-----Test Case :-3 Executed Regression -----",true);
		
	}
	
	
}
