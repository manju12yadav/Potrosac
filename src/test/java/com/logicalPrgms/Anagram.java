package com.logicalPrgms;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Anagram 
{

	@Test
	public void Anagram()
	{
		String s1="angle";
		String s2="angel";
		
		s1=s1.replaceAll(" ", "");
		s2=s2.replaceAll(" ", "");

		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] st1 = s1.toCharArray();
		char[] st2 = s2.toCharArray();
		
		Arrays.sort(st1);
		Arrays.sort(st2);
		
		Assert.assertEquals(st1, st2);
		
		System.out.println(st1);
		System.out.println(st2);
		
	}
}
