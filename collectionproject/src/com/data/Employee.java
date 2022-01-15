package com.data;

import java.time.format.DateTimeFormatter;

public class Employee
	{
		
	private int empId;
	private String name;
	private int salary;
	private char gender;

		public Employee(int empId, String name, int salary, char gender) {
			super();
			this.empId = empId;
			this.name = name;
			this.salary = salary;
			this.gender = gender;
		}

		public int getEmpId() {
			return empId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			if (salary < this.salary)
				System.out.println("Salary cannot be lowered");
			else
				this.salary = salary;
		}
		public String getGender() {
			switch (this.gender) {
			case 'M':
				return "Male";
			case 'F':
				return "Female";
			default:
				return "Unknown";
			}
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		

		@Override
		public String toString() {
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");

			return "EmpId: " + empId + "\nName: " + name + "\nSalary: " + salary  + "\nGender: "
					+ getGender();
		}
	}
		

		



	


