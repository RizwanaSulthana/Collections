package com.lists;

import java.util.LinkedList;

public class Lists {

	public static void main(String[]args)
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		l.set(2, "R");
		
		for(String a:l)
		System.out.println(a);
		System.out.println(l.contains("c"));
		System.out.println(l.remove("e"));
		System.out.println(l.isEmpty());
		
		
		//System.out.println(l.max());
		
	}
	
	
	
}
