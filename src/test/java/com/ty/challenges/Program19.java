package com.ty.challenges;

public class Program19 {

	public static void m1() {
		String s = "i am sunil kumar", sum = "";
		String str[] = s.split(" ");
		for(int i=0 ; i<str.length;i++)
		{
			if(i%2!=0)
			{
				String temp = str[i];//am
				str[i] = str[i-1];//str[1]=i // kumar
				str[i-1]= temp;//str[0]=am //sunil
				sum = sum +" "+ str[i-1]+" "+str[i];
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		m1();
	}
}
