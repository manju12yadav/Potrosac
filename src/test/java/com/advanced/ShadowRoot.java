package com.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRoot 
{
	@Test
	public void searchDownloads()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("chrome://downloads/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement search = (WebElement)js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('#searchTerm').querySelector('input')");
		search.sendKeys("jenkins");
		
	}
}
