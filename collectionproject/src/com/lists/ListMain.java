package com.lists;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		System.out.println(list.size());//empty
		
		
		String [] s= {"hi","hello"};
		for(String a:s)
		{
			list.add(a);
		}

		System.out.println(list.contains("hi"));
				
		 list.add("hyderabad");
		 list.add("kurnool");
		 list.add("banglore");
		 list.add("pune");
		 list.add("kolkata");
		 list.add("mumbai");
		 list.add("chennai");
		 list.add("kolkata");
		 list.add("hyderabad");
		 System.out.println(list.size());
		 list.add(4,"anantapur");//inserting
		 
		 list.remove(5);//removing
		 for(String city: list)
		 System.out.println(city);
	
	
	    System.out.println(list.get(3));
	    
	    list.set(2, "bengaluru");
	    
	   System.out.println("=======================");
	    for(String city: list)
			 System.out.println(city);
	}
	    
	

}
