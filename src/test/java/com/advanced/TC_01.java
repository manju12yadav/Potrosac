package com.advanced;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01 
{
	@Test()
	public void crossBrowser1()
	{
		Reporter.log("Good Morning",true);
		Assert.fail();
		Reporter.log("Hello",true);
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
	}
	
}
