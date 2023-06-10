package com.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MacCosmetic 
{
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.maccosmetics.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
			
		WebElement bs = driver.findElement(By.xpath("//div[.='BEST-SELLERS']"));
		Actions a=new Actions(driver);
		a.moveToElement(bs).perform();
		
		driver.findElement(By.xpath("(//a[@href='/bestsellers' and @class='gnav-tout__module-link'])")).click();
		
		driver.findElement(By.xpath("//button[@class='content-block-sitewide-banner__trigger js-content-block-sitewide-banner-trigger']")).click();
		
		WebElement prod1 = driver.findElement(By.xpath("//h2[.='Studio Fix Every-Wear All-Over Face Pen']/parent::div/../../../..//button[.='Add To Bag']"));
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(prod1));
		js.executeScript("arguments[0].click()", prod1);
		WebElement prod2 = driver.findElement(By.xpath("//h2[.='Matte Lipstick']/parent::div/../../../..//button[.='Add To Bag']"));
		js.executeScript("arguments[0].click()", prod2);
		WebElement prod3 = driver.findElement(By.xpath("//h2[.='M·A·C Locked Kiss Ink 24HR Lipcolour']/parent::div/../../../..//button[.='Add To Bag']"));
		js.executeScript("arguments[0].click()", prod3);
		driver.findElement(By.xpath("(//span[@id='site-bag-count'])[1]")).click();
		
		
		
		
		String p1 = driver.findElement(By.xpath("(//a[normalize-space()='M·A·C Locked Kiss Ink 24HR Lipcolour'])[1]")).getText();
		Assert.assertEquals(p1,"M·A·C LOCKED KISS INK 24HR LIPCOLOUR");
		System.out.println(p1);
		String p2 = driver.findElement(By.xpath("(//a[normalize-space()='Matte Lipstick'])[1]")).getText();
		Assert.assertEquals(p2, "MATTE LIPSTICK");
		System.out.println(p2);
		String p3 = driver.findElement(By.xpath("(//a[normalize-space()='Studio Fix Every-Wear All-Over Face Pen'])[1]")).getText();
		Assert.assertEquals(p3, "STUDIO FIX EVERY-WEAR ALL-OVER FACE PEN");
		System.out.println(p3);
		
		
		
		
		
		
	}
}
