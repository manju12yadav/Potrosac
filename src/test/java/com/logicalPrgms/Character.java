package com.logicalPrgms;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Character{
	
	@Test
    public void occurance() {
        String input = "amdkbdskjadknkd";
        HashMap<Character, Integer> occurrenceMap = countCharacterOccurrences(input);
        
        // Print the occurrence of each character
        for (Map.Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " time(s)");
        }
    }
    
    public static HashMap<Character, Integer> countCharacterOccurrences(String str) {
        HashMap<Character, Integer> occurrenceMap = new HashMap<Character, Integer>();
        
        for (char c : str.toCharArray()) {
            
            
//            occurrenceMap.put(c, occurrenceMap.getOrDefault(c, 0) + 1);
        }
        
        return occurrenceMap;
    }
    
    
    @Test
    public void swap() 
    {
        String s1="Hi";
        String s2="World";
        int len=s1.length();
        s1=s1+s2;
        s2=s1.substring(0,len);
        System.out.println("S2-"+s2);
        s1=s1.substring(len,s1.length());
        System.out.println("S1-"+s1);
        
    }
    
}