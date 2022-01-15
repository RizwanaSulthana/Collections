package com.maps;

import java.util.LinkedHashMap;

public class MapMain {
	
	public static void main(String[]args)
	{
		LinkedHashMap<String,String> cities =new LinkedHashMap<String,String>();
		
		cities.put("AP", "ANDHRAPRADESH");
		cities.put("TS","TELANGANA");
		cities.put("KA", "KARNATAKA");
		
	       String city=cities.get("TS");
			if(cities==null)
			{
				System.out.println("not found");
			}
			else
				System.out.println(city);
			}
	
	        //cities.remove("KA");
	        
	       //  System.out.println(lh.containsKey("AP"));
	         //System.out.println(cities.containsKey("AP"));
		
	}

