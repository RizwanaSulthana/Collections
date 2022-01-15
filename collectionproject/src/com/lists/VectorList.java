package com.lists;

import java.util.LinkedList;

public class VectorList {
	public static void main(String[]args)
	{
		LinkedList<String> a=new LinkedList<String>();
		
		a.add("hi");
		a.add("hello");
		a.add("hlo");
		a.add("hi");
		a.add("bye");
		
		for(String s:a)
			System.out.println(s);
		
	}

}
