package com.hcl.streams;

public class Employee {
	int empId;
	String name;
	String dateOfBirth;
	int age;
	double salary;
	
	public Employee(int empId, String name, String dateOfBirth, int age, double salary) {
		this.empId = empId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.salary = salary;
		
	}
	int getEmpId() {
		return empId;
	}
	String getName() {
		return name;
	}
	String getDateOfBirth() {
		return dateOfBirth;
	}
	int getAge() {
		return age;
	}
	double getSalary() {
		return salary;
	}

}
