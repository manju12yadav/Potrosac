package com.mavenPractice;


import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class StringOperations 
{

//	i 
//	i n 
//	i n d 
//	i n d i 
//	i n d i a 
	
	@Test
	public void countChar()
	{
		String s="aabbac";
		String s1 = s.substring(0, 2);
		
		System.out.print(s1+"-"+s1.length());
		String s2 = s.substring(2, 4);
		System.out.print(s2+"-"+s2.length());
		String s3 = s.substring(4,5);
		System.out.print(s3+"-"+s3.length());
		String s4 = s.substring(5,6);
		System.out.print(s4+"-"+s4.length());
	}
	
	
	@Test
	public void pattern()
	{
		String s="india"; 
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(s.charAt(j)+" ");
			}
			
			System.out.println();
		}
	}
	
	@Test
	public void removeDuplicate()
	{
		String s ="india";
        LinkedHashSet<Character> set=new LinkedHashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        for(char c: set)
        {
            int count=0;
            for(int i=0;i<s.length();i++)
            {
                if(c==s.charAt(i))
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.print(c);
            }
        }
	}
	
}
