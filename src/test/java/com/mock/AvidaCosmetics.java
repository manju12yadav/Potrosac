package com.mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AvidaCosmetics 
{
	@Test
	public void cosmeticDetails()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.aveda.com/");
		WebElement mensSection = driver.findElement(By.xpath("(//a[contains(text(),'MEN')])[3]"));
		Actions a=new Actions(driver);
		a.moveToElement(mensSection);
		driver.findElement(By.xpath("(//a[.='styling'])[2]")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		WebElement prodName = driver.findElement(By.xpath("(//a[@rel=\"prefetch\"])[2]"));
		WebElement prodPrice = driver.findElement(By.xpath("((//a[@rel=\"prefetch\"])[2]/ancestor::div//span[@class='text-lg-2'])[1]"));
		System.out.println(prodName.getText()+"-----"+prodPrice.getText());
		driver.close();
	}
}
