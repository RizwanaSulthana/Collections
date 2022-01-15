package com.maps;

import java.util.*;
import java.util.Collections;


import com.data.Employee;

public class EmpMain {
	
	public static void main(String[]args)

	{
		Employee[] emps = { 
				new Employee(100, "Suresh", 10000, 'M'), 
				new Employee(200, "Rajani", 32000, 'F'),
				new Employee(300, "Kumar", 30000, 'M'), 
				new Employee(400, "Kumari", 24000, 'F') 
				};
		
		List<Employee> list = Arrays.asList(emps);
		
		Comparator<Employee> salComp= new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return (int) (e1.getSalary()-e2.getSalary());
			}
			
		};
		
		Comparator<Employee> nameComp= new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
			
		};  
		
		
		Collections.sort(list,salComp);
		for(Employee e:list)
			System.out.print(e);
		

}
}

