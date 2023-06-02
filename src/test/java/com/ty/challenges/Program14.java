package com.ty.challenges;
//ip str1 = "this is fun show", str2="fun tv show" op = "this is tv";
public class Program14 {

	public static void m1() {
		String str1 = "this is fun show";
		String[] s1 = str1.split(" ");
		String str2 = "fun tv show", sum="";
		String [] s2 = str2.split(" ");
		
		for(int i=0 ; i<s1.length ; i++)
		{
			String word = s1[i];
			boolean flag = false;
			for(int j=0 ; j<s2.length ; j++)
			{
				if((word.equals(s2[j])))
				{
					flag = true;
					break;	
				}
			}
			if(!flag)
			{
				sum = sum+s1[i]+" ";
			}
		}
		for(int i=0 ; i<s2.length ; i++)
		{
			String word = s2[i];
			boolean flag = false;
			for(int j=0 ; j<s1.length ; j++)
			{
				if((word.equals(s1[j])))
				{
					flag = true;
					break;	
				}
			}
			if(!flag)
			{
				sum = sum+s2[i]+" ";
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		m1();
	}
}
