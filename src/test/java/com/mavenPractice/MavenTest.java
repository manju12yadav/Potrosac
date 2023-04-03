package com.mavenPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenTest 
{
	@Test(groups = "smoke")
	public void testScript1()
	{
		Reporter.log("-----Test Case :-1 Executed -----",true);
	}
	
	@Test(groups = "regression")
	public void testScript2()
	{
		Reporter.log("-----Test Case :-2 Executed -----",true);
	}
}
