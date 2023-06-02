package com.mock;

public class MockProgrm {

	public static void main(String[] args) {
		
//		String str1 = "Hello";
//		String str2 = "World";
////		str1=str1+str2;
//		str1=str1.replaceAll(str1, str2);
//		System.out.println(str1);
//		str2=str2.replaceAll(str2, str1);
//		System.out.println(str2);
		
		  String s1="hi";
          int len=s1.length();
          String s2="welcome";
          s1=s1+s2;
          int len2=s1.length();
//          System.out.println(s1);
          s2=s1.substring(0,len);
          System.out.println("s2--"+s2);
          s1=s1.substring(len, len2);
          System.out.println("s1--"+s1);
		
		
//		int a = 5;
//		int b = 7;
//		int carry;
//		while (b != 0) {
//		    carry = a & b;
//		    a = a ^ b;
//		    b = carry << 1;
//		}
//		int sum = a;
//		
//		System.out.println(sum);
		
	}

}
