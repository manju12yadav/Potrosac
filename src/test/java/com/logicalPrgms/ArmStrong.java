package com.logicalPrgms;

import org.testng.annotations.Test;

public class ArmStrong {

	@Test
	public void arm()
	{
//		Scanner sd=new Scanner(System.in); 
//		System.out.println("Enter the Integer value");
//		int n=sd.nextInt();
		int n=20;
		int arm=armStrongNum(n);
		System.out.println("Sum of the digits is "+arm);
	}
	static int armStrongNum(int x)
	{
		int sum=0;
		do
		{
			int r=x%10;
			sum=sum+r*r*r;
			x=x/10;
		}
		while(x!=0);
		return sum;
	}

	
}
