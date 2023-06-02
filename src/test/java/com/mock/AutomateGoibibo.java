package com.mock;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateGoibibo 
{

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[.='Round-trip']")).click();
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 dRQhOp']")).click();
		driver.findElement(By.xpath("(//p[.='Enter city or airport'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//p[.='Bengaluru International Airport']")).click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Doha");
		driver.findElement(By.xpath("//p[.='Doha International Airport']")).click();

		//Sun Apr 23 2023
		Date dt=new Date();
		String[] sdt = dt.toString().split(" ");
		String day = sdt[0];
		String month = sdt[1];
		String date = sdt[2];
		String year = sdt[5];
		String tdy = day+" "+month+" "+date+" "+year;
		System.out.println(tdy);
		driver.findElement(By.xpath("//div[@aria-label='"+tdy+"']")).click();
		driver.findElement(By.xpath("//span[.='Done']")).click();
		driver.findElement(By.xpath("(//span[@class='sc-eFegNN csJIKZ']//*[name()='svg'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Done']")).click();
		driver.findElement(By.xpath("(//p[@class='sc-faUpoM clesLa fswWidgetTitle'])[4]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Thu May 18 2023']")).click();
		driver.findElement(By.xpath("//span[.='Done']")).click();
		driver.findElement(By.xpath("(//span[@class='sc-eFegNN csJIKZ']//*[name()='svg'])[4]")).click();
		driver.findElement(By.xpath("//a[.='Done']")).click();
		driver.findElement(By.xpath("//span[.='SEARCH FLIGHTS']")).click();
		//		driver.findElement(By.xpath("//div[@id='closeOfferOverlay']")).click();
	

		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//span[.='Multi-Airline' and @class='font13 padL5 black']"));
				break;
			}
			catch (Exception e) {
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
			}
		}
		String flight = driver.findElement(By.xpath("//span[.='Multi-Airline' and @class='font13 padL5 black']")).getText();
		String price = driver.findElement(By.xpath("//span[.='Multi-Airline' and @class='font13 padL5 black']/ancestor::div[@class='srp-card-uistyles__CardWrap-sc-3flq99-7 cikHLO width100 dF']/descendant::div[@class='srp-card-uistyles__Price-sc-3flq99-17 iIBdKa alignItemsCenter dF fb lh1 padT5']")).getText();
		System.out.println(flight+" --> "+price);
		
//		driver.findElement(By.xpath("//span[.='Multi-Airline' and @class='font13 padL5 black']/ancestor::div[@class='srp-card-uistyles__CardWrap-sc-3flq99-7 cikHLO width100 dF']/descendant::div//button[.='VIEW FARES']")).click();
		
	}

}
