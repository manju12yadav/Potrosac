package com.patterns;

public class PatternTy
{


	public static void main(String[] args) 
	{
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
		
		
		System.out.println("--------");
		
		int n=5;
		for(int i=1;i<=n;i++) //rows
		{
			for (int j = 1; j <=n; j++) //columns
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Pattern-1");
		
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * *
		
		System.out.println("--------");
		
		for(int i=1;i<=n;i++)
		{
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Pattern-2");
		
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		
		
		
		System.out.println("--------");

			for (int i =1; i<=n; i++) {
				for (int j = i; j <=n ; j++) {
					System.out.print("* ");
				}
				System.out.println();
		}
			System.out.println("Pattern-3");
		
		
		
		
		
//	      * 
//	  	* * 
//    * * * 
//	* * * * 
//* * * * *
			
		
		System.out.println("--------");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Pattern-4");
		
		
		
//		* * * * *
//		  * * * *
//		    * * *
//		      * *
//		        *
		  
		
		System.out.println("--------");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println("Pattern-5");
		
		
		
//	     * 
//	    * * 
//	   * * * 
//	  * * * * 
//	 * * * * * 
		
		System.out.println("--------");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Pattern-6");
		
		
		
		
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 
		
		System.out.println("--------");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println("Pattern-7");

	
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5
		
		
		System.out.println("--------");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Pattern-8");
		
	
		
		
//		1 1 1 1 1 
//		2 2 2 2 2 
//		3 3 3 3 3 
//		4 4 4 4 4 
//		5 5 5 5 5 
		
		
		System.out.println("--------");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("Pattern-9");
		
		
		
		
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
		
		
		System.out.println("--------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Pattern-10");
		
		
//		5 
//		5 4 
//		5 4 3 
//		5 4 3 2 
//		5 4 3 2 1 
		
		
		
		System.out.println("--------");
		for(int i=1;i<=n;i++)
		{
			int k=5;
			for(int j=1;j<=i;j++)
			{
			System.out.print(k--+" ");
			}
			System.out.println();
		}
		System.out.println("Pattern-11");
		
		
//		    1 
//		   2 2 
//		  3 3 3 
//		 4 4 4 4 
//		5 5 5 5 5 
		
		System.out.println("--------");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("Pattern-12");
		

//		1 
//		2 2 
//		1 1 1 
//		2 2 2 2 
//		1 1 1 1 1 
		
System.out.println("--------");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{if(i%2==1)
			{
			System.out.print("1 ");
			}else {
				System.out.print("2 ");
			}
			}
			System.out.println();
		}
	
		System.out.println("Pattern-13");
		
//		A B C D E 
//		F G H I J 
//		K L M N O 
//		P Q R S T 
//		U V W X Y 
		
		System.out.println("--------");
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
		System.out.println("Pattern-14");
		
		
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
		
		System.out.println("--------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern-15");
		
//		A A A A A 
//		B B B B B 
//		C C C C C 
//		D D D D D 
//		E E E E E
		
		System.out.println("--------");

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
		System.out.println("Pattern-16");
		
		
	}
	

}
