package com.ty.challenges;

import java.util.Iterator;
import java.util.LinkedHashSet;

//count the number of characters
public class Program5 {

	public static void m1() {
		String str = "aweexxxyyyyyy";
		LinkedHashSet<Character> a1 = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			a1.add(str.charAt(i));
		}
		Iterator<Character> itr = a1.iterator();
		while(itr.hasNext())
		{
			char ch = itr.next();int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if(ch==str.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" occured "+count+" times");
		}
	
	}
	
	public static void main(String[] args) {
		m1();
	}
}
