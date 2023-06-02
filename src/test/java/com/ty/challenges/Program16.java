package com.ty.challenges;
import java.util.Scanner;
/*
 * a[] = {5,1,2,3,4}; key1 = {1,2,3,4,5} key2 ={2,3,4,5,1}; key3 ={3,4,5,1,2}; 
 */

public class Program16 {

	public static void m1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select the key between 1 to 3");
		int key = sc.nextInt();
		int a[] = {5,1,2,3,4};
		int b[] = new int[a.length];
		int c[] = new int[key];
		int j=0;
		switch(key)
		{
		case 1 : for(int i=0 ; i<c.length ; i++)
				{
					c[i] = a[i];//c[0] = 5
				}
				for(int k = key ; k<b.length ; k++)
				{
					b[j] = a[k];j++;//b[0]=1 b[1]=2 b[2]=3 b[3]=4
				}
				for(int m = 0; m<c.length; m++)
				{
					b[j] = c[m];//b[4] = c[0] => 5 
					j++;
				}
				for (int i = 0; i < b.length; i++) {
					System.out.print(b[i]+" "); //{1,2,3,4,5}
				}
				break;
				
		case 2 : for(int i=0 ; i<c.length ; i++)
				{
					c[i] = a[i];//c[0]=5 c[1]=1
				}
				for(int k = key ; k<b.length ; k++)
				{
					b[j] = a[k];j++;//b[0]=2 b[1]=3 b[2]=4
				}
				for(int m = 0; m<c.length; m++)
				{
					b[j] = c[m];//b[3]=5 b[4]=1
					j++;
				}
				for (int i = 0; i < b.length; i++) {
					System.out.print(b[i]+" ");//{2,3,4,5,1}
				}
				break;
				
		case 3 : for(int i=0 ; i<c.length ; i++)
				{
					c[i] = a[i];//c[0]=5 c[1]=1 c[2]=2
				}
				for(int k = key ; k<b.length ; k++)
				{
					b[j] = a[k];j++;//b[0]=3 b[1]=4 
				}
				for(int m = 0; m<c.length; m++)
				{
					b[j] = c[m];//b[2]=5 b[3]=1 b[4]=2
					j++;
				}
				for (int i = 0; i < b.length; i++) {
					System.out.print(b[i]+" ");//{3,4,5,1,2}
				}
				break;
				
		default: System.out.println("invalid selection");
				
				}
	}
	
	public static void main(String[] args) {
		m1();
	}
}
