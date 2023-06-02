package com.ty.challenges;
//ip a[] = {1,3,5,2,8,9,10} print combination of numbers which gives sum 11.
public class Program9 {

	public static void m1() {
		int a[] = {1,3,5,2,8,9,10};
		for(int i= 0 ; i<a.length ; i++)
		{
			for(int j=0 ; j<a.length ; j++)
			{
				if((a[i]+a[j])==11)
				{
					System.out.println(a[i]+"-"+a[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		m1();
	}
}
