package com.mavenPractice;

import org.testng.annotations.Test;

public class ParameterTest 
{
	@Test
	public void test()
	{
		String Url = System.getProperty("url");
		String Env = System.getProperty("env");
		String Browser = System.getProperty("browser");
		String UN = System.getProperty("un");
		String PW = System.getProperty("pw");
		System.out.println(Url+"---"+Env+"---"+Browser+"---"+UN+"---"+PW);
	}
}
