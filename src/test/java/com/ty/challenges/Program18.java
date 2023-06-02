package com.ty.challenges;

public class Program18 {

	public static void m1() {
		String str = "I a1m goi123ng to fi3215nd pro234duct for the num1212bers insi1212ide th12121s st3245ring";
		String[] s = str.split(" ");long product = 1;
		for(int i=0 ;i<s.length;i++)
		{
			String s1 = s[i];long sum =0;
			for(int j=0 ; j<s1.length();j++)
			{
				char ch = s1.charAt(j);
				if(ch>='0'&& ch<='9')
				{
					Character c = ch;
					String s2 = c.toString();
					long a = Long.parseLong(s2);
					sum=sum * 10+a;			 
				}
			}
			
			if(sum != 0) {
				System.out.print(sum+"*");
				product = product * sum;
			}
		}
		System.out.println(product);
	}
	
	public static void main(String[] args) {
		m1();
	}
}
