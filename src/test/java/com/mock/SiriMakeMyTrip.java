package com.mock;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SiriMakeMyTrip {

	public static void main(String[] args) throws Throwable {




		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		driver.findElement(By.xpath("(//div[@class='DayPicker-Body'])[2]/div[4]/div[4]//div/p[text()='24']")).click();
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		driver.findElement(By.xpath("(//span[text()='View Prices'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Book Now'])[1]")).click();
		Set<String> ws = driver.getWindowHandles();
		Iterator<String> it=ws.iterator();
		while(it.hasNext())
		{
			String win = it.next();
			String eTitle = "reviewDetails";
			String aTitle = driver.switchTo().window(win).getTitle();
			if(eTitle.contains(aTitle))
			{
				break;
			}
		}

		System.out.println("Hey Mental Siri Its working very fine");

		WebElement ele = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
				int y=ele.getLocation().getY();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+y+")");
		 WebElement checkbox = (WebElement)((JavascriptExecutor)driver).executeScript("return document.querySelector(\"#INSURANCE > div.insBottomSection > div:nth-child(1) > label > span > input[type=radio]\")");
		 checkbox.click();
		 String confirmMsg = driver.findElement(By.xpath("//span[.='Great! Your trip is secured.']")).getText();
		 System.out.println(confirmMsg);
//		 driver.quit();
	}

}
