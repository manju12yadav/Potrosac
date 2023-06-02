package com.advanced;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridPractice 
{
	@Test
	public void gridTest() throws MalformedURLException
	{
		String executeMode="remote";
		WebDriver driver=null;
		if(executeMode.equals("remote")) 
		{
		URL url=new URL("http://192.168.1.101:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(url, cap);
		}
		else if(executeMode.equals("local"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.quit();
	}
}

//java -jar "E:\Test Yantra\Softwares\Selenium Grid\selenium-server-standalone-3.141.59.jar" -role hub
//java -Dwebdriver.chrome.driver="E:\Test Yantra\Softwares\Selenium Grid\chromedriver_win32\chromedriver.exe" -Dwebdriver.firefox.driver="E:\Test Yantra\Softwares\Selenium Grid\geckodriver-v0.33.0-win64\geckodriver.exe" -Dwebdriver.edge.driver="E:\Test Yantra\Softwares\Selenium Grid\edgedriver_win64\msedgedriver.exe" -jar "E:\Test Yantra\Softwares\Selenium Grid\selenium-server-standalone-3.141.59.jar" -role node -hub http://192.168.1.100:4444/grid/register/ -port 9999
