package com.mock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rankings 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> teams = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		int count = teams.size();
		ArrayList< String> al=new ArrayList<String>();
		for (int i = 0; i <count ; i++)
		{	
			al.add(teams.get(i).getText());
			
		}
		String aTeam = "Canada";
		if(al.contains(aTeam))
		{
			System.out.println(aTeam+"  is present");
		}
		else
		{
			System.out.println(aTeam+" is not Present");
		}
	}

}
