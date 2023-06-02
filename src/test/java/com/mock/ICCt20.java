package com.mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCt20 
{
	@Test
	public void icct20()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		
		WebElement rankings = driver.findElement(By.xpath("(//button[contains(text(),'Ranking')])[1]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(rankings).perform();
		String expPoints = "267";
		
		driver.findElement(By.xpath("(//a[contains(text(),'Overview')])[1]")).click();
		String team = driver.findElement(By.xpath("(//div[.='India'])[1]")).getText();
		String points = driver.findElement(By.xpath("(//div[.='India']/following-sibling::div)[1]")).getText();
		
		Assert.assertEquals(points, expPoints);
		System.out.println(team+" "+points);
		driver.close();
	}
}
