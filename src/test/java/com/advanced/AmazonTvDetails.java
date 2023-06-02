package com.advanced;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTvDetails 
{
	@Test
	public void tvDetails()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tv");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement tvLoc = driver.findElement(By.xpath("//span[contains(text(),'Redmi 108')]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		int y = tvLoc.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")",tvLoc);
		tvLoc.click();
		Set<String> window = driver.getWindowHandles();
			for(String wi:window)
			{
				String currentTitle = driver.switchTo().window(wi).getTitle();
				if(currentTitle.contains("Redmi-inches-Smart-L43M6-RA-Android"))
				{
					break;
				}
			}
		
		WebElement tvName = driver.findElement(By.xpath("//span[@id='productTitle']"));
		WebElement tvPrice = driver.findElement(By.xpath("(//span[@id='productTitle']/ancestor::div//span[@class='a-price-whole'])[5]"));
		System.out.println(tvName.getText()+"----->"+tvPrice.getText());
		driver.close();
		
	}

}
