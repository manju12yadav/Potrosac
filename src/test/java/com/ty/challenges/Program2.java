package com.ty.challenges;
//a[]={7,-3,0,2,1,-9} first 3 max and product
public class Program2 {

	public static void m1() {
		int a[] = {12,11,11,-3,0,7,1,10};
		int fmax = Integer.MIN_VALUE , smax= Integer.MIN_VALUE , tmax = Integer.MIN_VALUE;
		for(int i=0 ;i<a.length ; i++)
		{
			if(a[i]>fmax)
			{
				smax = fmax;
				fmax = a[i];
			}else if(a[i]>smax && a[i] != fmax)
			{
				tmax = smax;
				smax= a[i];
			}else if(a[i]>tmax && a[i] !=smax)
			{
				tmax = a[i];
			}
		}
		System.out.println("first max  : "+fmax);
		System.out.println("second max : "+smax);
		System.out.println("third max  : "+tmax);
		System.out.println("product    : "+(fmax*tmax*smax));
	}
	
	public static void main(String[] args) {
		m1();
	}
}
