package com.maps;

import com.data.Employee;

public class NameComparator implements Comparable<Employee>{
	
	Employee[] emps = { 
			new Employee(100, "Suresh", 10000, 'M'), 
			new Employee(200, "Rajani", 12000, 'F'),
			new Employee(300, "Kumar", 25000, 'M'), 
			new Employee(400, "kumari", 30000,'F' ) };
	
	
	



	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
		

	}


	


