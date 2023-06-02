package com.ty.challenges;
//ip = i am selenium  o/p= m ui nelesmai
public class Program3 {
	
	public static void m2() {
		// TODO Auto-generated method stub
		String s="i am selenium hi";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				rev=rev+s.charAt(i);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				rev=rev.substring(0,i)+" "+rev.substring(i, rev.length());
			}
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		m2();
	}
}
