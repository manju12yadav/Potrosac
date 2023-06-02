package com.java;

public class PrintPrimeNumberBtwGivenRange 
{

	public static void main(String[] args) 
	{
		int n=100;
//		2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 

		for (int i = 2; i <=n; i++)
		{
			boolean rs = isPrime(i);
			if(rs) {
				System.out.print(i+" ");
			}
		}
	}

	public static boolean isPrime(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
}
