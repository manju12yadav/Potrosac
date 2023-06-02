package com.logicalPrgms;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fibbonacci 
{
	@Test
	public void fibo() {
		
		int n=20;
		int fNum=0,sNum=1;
		System.out.print("Fibonacci series: "+fNum+" "+sNum);
		for (int i = 0; i < n; i++) 
		{
			int nextNum=fNum+sNum;
			System.out.print(" "+nextNum);
			fNum=sNum;
			sNum=nextNum;
			
		}
	}
	
	
	@Test
	public void fibosries()
	{
//		Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = 20;

        System.out.println("Fibonacci series:");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
	}
    
    @Test
    public void chrome()
    {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.getTitle();
    }

}
