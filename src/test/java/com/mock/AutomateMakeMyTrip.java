package com.mock;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AutomateMakeMyTrip 
{

	public static void main(String[] args) throws Throwable 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//p[.='Bengaluru, India']")).click();
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Goa");
		driver.findElement(By.xpath("//p[.='Goa - Dabolim Airport, India']")).click();

		//		System Date
		Date cdt=new Date();
		String[] d = cdt.toString().split(" ");
		String day = d[0];
		String month = d[1];
		String date = d[2];
		String year = d[5];
		String travelDate = day+" "+month+" "+date+" "+year;

		driver.findElement(By.xpath("//div[@aria-label='"+travelDate+"']")).click();


		//		Fri May 12 2023

		String rday = "Fri";
		String rmonth = "May";
		String rdate = "12";
		String ryear = "2023";
		String returnDate = rday+" "+rmonth+" "+rdate+" "+ryear;

		//		giving infinity loop to select the future date

		for (; ;)
		{
			try 
			{
				driver.findElement(By.xpath("//div[@aria-label='"+returnDate+"']")).click();
				break;
			}
			catch (Exception e) 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}

		}

		driver.findElement(By.xpath("//span[@class='appendRight10']")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-4']")).click();
		driver.findElement(By.xpath("//button[.='APPLY']")).click();

		driver.findElement(By.xpath("//a[.='Search']")).click();
		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		driver.findElement(By.xpath("//button[.='Book Now']")).click();
		driver.findElement(By.xpath("//button[@class='buttonPrimary buttonBig  lato-black button']")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		while(it.hasNext())
		{
			String win = it.next();
			String partialTitle="reviewDetails";
			String actualTitle = driver.switchTo().window(win).getTitle();
			if(partialTitle.contains(actualTitle))
			{
				break;
			}
		}
		String flight = driver.findElement(By.xpath("//b[contains(text(),'Bengaluru ')]")).getText();
		String totalPrice = driver.findElement(By.xpath("//b[contains(text(),'Bengaluru')]/ancestor::div/descendant::span[@class='fontSize16 blackFont' and contains(text(),'₹')]")).getText();
		System.out.println(flight+" -- "+totalPrice);

		WebElement ele = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		int y=ele.getLocation().getY();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+y+")");
		if(ele.isDisplayed()) {
			WebElement checkbox = (WebElement)((JavascriptExecutor)driver).executeScript("return document.querySelector('#INSURANCE > div.insBottomSection > div:nth-child(1) > label > span > input[type=radio]')");
			checkbox.click();
			String confirmMsg = driver.findElement(By.xpath("//span[.='Great! Your trip is secured.']")).getText();
			System.out.println(confirmMsg);
		}
		else
		{
			System.out.println("Yes button not found");
		}
		System.out.println("Flight details are in below screenshot");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/"+flight+".png");
		FileUtils.copyFile(src, dest);
		//		 driver.quit();

	}

}


