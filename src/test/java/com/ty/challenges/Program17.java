package com.ty.challenges;

import java.util.ArrayList;

//check anagram or not
public class Program17 {

	public static void m1() {
		String str1 = "kats";
		String str2 = "tacs";
		if(str1.length()!=str2.length())
			System.out.println("not a panagram");
		else {
			ArrayList<Character> a1= new ArrayList<Character>();
			for(int i=0 ;i<str1.length();i++)
			{
				char ch = str1.charAt(i);
				for(int j=0 ; j<str2.length();j++)
				{
					if(ch==str2.charAt(j))
					{
						a1.add(str1.charAt(j));
						break;
					}
				}
			}
			if(str1.length()==a1.size())
			
				System.out.println("panagram");
				else
				System.out.println("not a panagram");
				
			}
			
			
			
			
		
	}
	
	public static void main(String[] args) {
		m1();
	}
}
