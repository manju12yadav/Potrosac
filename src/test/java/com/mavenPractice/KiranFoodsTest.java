package com.mavenPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KiranFoodsTest 
{
	@Test(groups = "smoke")
	public void menuList()
	{
		
		Reporter.log("Masala Dosa",true);
		System.out.println("Mushroom");
		
	}
	@Test(groups = "regression")
	public void curryPoint()
	{
		System.out.println("Guntur Chicken");
	}
	
}
