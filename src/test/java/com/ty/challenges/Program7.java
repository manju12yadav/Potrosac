package com.ty.challenges;

import java.util.Iterator;
import java.util.LinkedHashSet;

//ip = "Malyalam"; op = m=2 , a=3, l=2, y=1
public class Program7 {

	public static void m1() {
		String s = "Malyalam";
		String str = s.toLowerCase();
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
			System.out.println(ch+":"+count);
		}
	}
	
	public static void main(String[] args) {
		m1();
	}
}
