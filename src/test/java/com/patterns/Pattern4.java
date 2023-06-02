package com.patterns;

class Pattern4
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			System.out.print(ch+++" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(ch+++" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
	}
}      