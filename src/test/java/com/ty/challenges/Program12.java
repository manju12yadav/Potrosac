package com.ty.challenges;
//ip = "i love programming" op = i evol gnimmargorp
public class Program12 {

	public static void m1() {
		String str = "i love programming" , sum="";
		String[] s = str.split(" ");
		for(int i=0 ; i<s.length ; i++)
		{
			String w = s[i];
			for(int j = w.length()-1 ; j>=0 ; j--)
			{
				sum = sum+w.charAt(j); 
			}
			sum = sum+" ";
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		m1();
	}
}
