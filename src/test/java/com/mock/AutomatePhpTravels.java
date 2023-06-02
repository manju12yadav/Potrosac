package com.mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomatePhpTravels 
{

	public static void main(String[] args) throws InterruptedException 
	{

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.phptravels.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement config = driver.findElement(By.xpath("//div[@data-rnwi-handle='nearest' and .='Configuration']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		int y=config.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")");
		config.click();
		driver.navigate().back();
		WebElement blog = driver.findElement(By.xpath("(//div[@dir='auto' and .='License Error'])[1]"));
		int y1=blog.getLocation().getY();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,"+y1+")");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", blog);
	}

}
