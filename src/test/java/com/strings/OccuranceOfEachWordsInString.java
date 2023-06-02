package com.strings;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class OccuranceOfEachWordsInString 
{

	@Test
	public void usingSet()
	{
		String s="Hi bro Hi bro I am Fine";
		String[] st = s.split(" ");
		LinkedHashSet< String> set = new LinkedHashSet<String>();
		for (int i = 0; i < st.length; i++) {
			set.add(st[i]);
		}
		for (String str : set)
		{
			int count=0;
			for(int i=st.length-1;i>=0;i--)
			{
				if(str.equals(st[i]))
				{
					count++;
				}
			}
			System.out.println(str+" = is repeating "+count+" times");
		}
	}
	
	@Test
	public void usingMap()
	{
		int count=0;
		String s="Hi bro Hi bro I am Fine";
		String[] st = s.split(" ");
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for (String word : st) 
		{
			if(hm.containsKey(word))
			{
				count=hm.get(word);
				hm.put(word,count+1);
			}
			else
			{
				hm.put(word, 1);
			}
			
		for (Map.Entry<String , Integer> entry: hm.entrySet()) 
		{
			String w=entry.getKey();
			int c=entry.getValue();
			System.out.println(w+" "+c);
		}
		}
		
		
	}

}
