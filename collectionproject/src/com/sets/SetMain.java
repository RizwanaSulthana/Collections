package com.sets;

import java.util.*;

public class SetMain {
	
	public static void main(String[]args)
	{
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		
		hs.add("Delhi");
		hs.add("hyd");
		hs.add("pune");
		hs.add("knl");
		hs.add("bnglr");
		hs.add("Delhi");
		hs.add("knl");
		
		
		for(String s:hs)
			System.out.println(s);
		System.out.println(hs.contains("knl"));
		
		System.out.println(hs.remove("knl"));
		
		System.out.println("=================");
		
		HashSet<String> h=new HashSet<String>();
		h.add("A");
		h.add("E");
		h.add("I");
		h.add("O");
		h.add("A");
		
		for(String n:h)
		System.out.println(n);
		
		System.out.println("==================");
		
		TreeSet<String> t=new TreeSet<String>();
		t.add("a");
		t.add("e");
		t.add("o");
		t.add("i");
		t.add("e");
		
		for(String T:t)
		System.out.println(T);
		
		
		
		
		
		
		
		
		
		    
		

		
	}

}
