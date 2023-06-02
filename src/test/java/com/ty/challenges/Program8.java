package com.ty.challenges;
//find the sum of first 3 minimum elements
public class Program8 {

	public static void m1() {
		int a[] = {7,-6,11,9,0,4};
		
		for(int i=0 ; i<a.length;i++)
		{
			for(int j = i+1; j<a.length ; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]  = a[j]; 
					a[j] = temp;
				}
			}
		}
		
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		System.out.println(a[0]+a[1]+a[2]);
	}
	
	public static void main(String[] args) {
		m1();
	}
}
