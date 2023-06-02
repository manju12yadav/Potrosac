package com.ty.challenges;

import java.util.HashMap;
import java.util.Scanner;

//a[] ={7,2,12,15} hashmap = {0=7,1=2,2=12,3=15} , op = 0+1 = (7+2) = 9;
public class Program13 {

	public static void m1() {
		int a[] = {7,2,12,15};
		HashMap<Integer, Integer> a1 =new HashMap<Integer, Integer>();
		for(int i=0 ; i<a.length ; i++)
		{
			a1.put(i, a[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two keys to get sum");
		int key1 = sc.nextInt();
		int key2 = sc.nextInt();
		int sum = a1.get(key1)+a1.get(key2);
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		m1();
	}
}
