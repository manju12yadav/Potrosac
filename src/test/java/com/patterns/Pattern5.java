package com.patterns;

class Pattern5
{
	
//	a 
//	b b 
//	c c c 
//	d d d d 
//	e e e e e 

	
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print((char)(i+96)+" ");
			}
			System.out.println();
		}
	}
}         