package com.advanced;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus 
{
	@Test
	public void busTickets() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.com/");
		driver.findElement(By.id("src")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[contains(text(),'Bangalore')]")).click();
		driver.findElement(By.id("dest")).sendKeys("Chitoor");
		driver.findElement(By.xpath("//div[contains(text(),'Chittoor (Andhra Pradesh)')]")).click();
		
		driver.findElement(By.id("date-box")).click();
		driver.findElement(By.xpath("(//span[.='12'])[1]")).click();
		driver.findElement(By.id("return-box")).click();
		driver.findElement(By.xpath("(//span[.='12'])[2]")).click();
		driver.findElement(By.xpath("//div[.='SEARCH']")).click();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		List<WebElement> busTravels = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		List<WebElement> boardTime = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']/ancestor::div//div[@class='dp-time f-19 d-color f-bold']"));
		List<WebElement> dropTime = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']/ancestor::div//div[@class='bp-time f-19 d-color disp-Inline']"));
		 List<WebElement> busFare = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']/ancestor::div//div[contains(text(),'INR')]"));
		 int count = busTravels.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) 
		{ 
			System.out.println("BusTravels :- "+busTravels.get(i).getText()+"--- Boarding Time :- "+boardTime.get(i).getText()+" --- Dropping Time :- "+dropTime.get(i).getText()+"  --- Bus Fare :- "+busFare.get(i).getText());
		}
		
	}
}
