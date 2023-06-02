package com.ty.challenges;
//ip = my name is ok op= ko si eman ym;
public class Program11 {

	public static void m1() {
		String str = "my name is ok", sum ="";
		for(int i=str.length()-1 ; i>=0;i--)
		{
			sum = sum +str.charAt(i);
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		m1();
	}
}
