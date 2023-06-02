package com.logicalPrgms;

import org.testng.annotations.Test;

public class PrintOnlyNumInString 
{
	
	@Test
	public void printNum()
	{
		String str="mn2a3j5d1dsd4"; //2 3 5 1 4
		
		for (int i = 0; i < str.length(); i++) 
		{
			
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				System.out.print(str.charAt(i)+" ");
			}
		}
	}
}
