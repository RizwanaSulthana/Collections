package com.maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Maps {
	
	static void charactersCount(String str)
	{
		TreeMap<Character,Integer> hm=new TreeMap<Character,Integer>();
		
		char[] arr=str.toCharArray();
		for(char c:arr){
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
		else
			hm.put(c, 1);
	
	}
	
      System.out.println(hm);
      
	}
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
			String str=sc.nextLine();
			sc.close();
			System.out.println("the occurance of char is ");
			charactersCount(str);
			
		
		
	}
}


