package com.patterns;

import java.util.Iterator;

import org.testng.annotations.Test;

public class PatternTy01 
{
	
//	* 
//	  * 
//	    * 
//	      * 
//	        *
	@Test
	public void p1()
	{
		int n=5;
		for (int i = 0; i < n; i++) 
		{
			
			for (int j = 0; j <=i; j++) {
				
				
				if (i==j) 
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println("");
		}
	}
	
//    *   
//    *   
//    *   
//    *   
//    *   
	
	@Test
	public void p2()
	{
		int n=5;
		for (int i = 0; i < n; i++) 
		{
			
			for (int j = 0; j < n; j++) 
			{
			
				if(j==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	
//	   *  
//	    * 
//	   *  
//	    * 
//	   *  
	
	@Test
	public void p3()
	{
		int n=5;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) {
				if(i%2==0&&j==3)
				{
					System.out.print("* ");
				}
				else if(i%2==1&&j==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	

	
	
	
}
