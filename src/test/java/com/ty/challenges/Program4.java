package com.ty.challenges;

import java.util.Iterator;
import java.util.LinkedHashSet;

//s="my name is rishav and it contains ri and shav" print the occurance of the word
public class Program4 {

	public static void m1() {
		String s="my name is rishav and it contains ri and shav";
		String str[] = s.split(" ");
		LinkedHashSet<String> a1 = new LinkedHashSet<String>();
		for(int i=0 ; i<str.length ; i++)
		{
			a1.add(str[i]);
		}
		
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext())
		{
			String word = itr.next();int count = 0;
			for(int i=0 ; i<str.length ; i++)
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			System.out.println(word + "  occuring "+count+" times");
		}
		
	}
	public static void main(String[] args) {
		m1();
	}
}
