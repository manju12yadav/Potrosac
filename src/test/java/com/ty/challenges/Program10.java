package com.ty.challenges;
//ip = "my name is abc" op= mynameisabc
public class Program10 {

	public static void m1() {
		String str= "my name is abc", sum ="";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ')
			{
				sum = sum+str.charAt(i);
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		m1();
	}
}
