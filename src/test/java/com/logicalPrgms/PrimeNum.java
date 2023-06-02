package com.logicalPrgms;

import org.testng.annotations.Test;

public class PrimeNum 
{

	@Test
	public void countPrime()
	{
		int[] num= {3,4,8,9,5,7,15,17,19,23};
		int count=0;
		for (int i = 0; i < num.length; i++)
		{
			int n=num[i];
			for (int j = 2; j <=n/2; j++)
			{
				if (n%j==0) 
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}

	@Test
	public void printPrimeNumfromArray()
	{
		int []a= {1,3,2,4,6,5,9,7};
		for(int i=0;i<a.length;i++)
		{
			boolean isPrime = true;
			int n = a[i];
			for(int j=2;j<=n/2;j++)
			{
				if(n%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime && a[i]!=1)
			{
				System.out.println(a[i]);
			}
		}
	}

	@Test
	public void printPrimeNumberBtwGivenRange() 
	{

		int n=100;  //		2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
		for (int i =2; i<=n; i++)
		{
			boolean isPrime=true;
			int m=i;
			for(int j=2;j<=m/2;j++)
			{
				if(m%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime && i!=1)
			{
				System.out.print(i+" ");
			}
			
		}
	}

	@Test
	public void verifyPrimeOrNot()
	{
		int n=9;
		for (int i = 2; i <= n/2; i++) {

			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				break;
			}
			else
			{
				System.out.println(n+" is a prime number");
			}
		}
	}
}

