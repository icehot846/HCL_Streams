package com.hcl.streams;
import java.util.*;

public class MainTest {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1111,"Zach Berghoff","07/28/1999",22,5000.00));
		emp.add(new Employee(1112,"Jake Moody","05/19/2000",50,75000.00));
		emp.add(new Employee(1113,"David Ojabo","01/14/2001",36,13000.00));
		emp.add(new Employee(1114,"Aidan Hutchinson","12/25/1998",18,28000.00));
		emp.add(new Employee(1115,"Cade McNamara","07/04/1996",65,7000.00));
		emp.add(new Employee(1116,"Blake Corum","02/14/1992",31,7500.00));
		emp.add(new Employee(1117,"AJ Henning","09/01/2002",28,60000.00));
		emp.add(new Employee(1118,"Hassan Haskins","02/09/1999",26,45000.00));
		
		System.out.println("Filter: Age > 30");
		emp.stream().filter(Employee -> Employee.getAge() > 30)
		.forEach(Employee -> System.out.println(Employee.getName()));
		
		System.out.println("\nFilter: Age Between 50 and 60");
		emp.stream().filter(Employee -> Employee.getAge() >= 50 && Employee.getAge() <= 60)
		.forEach(Employee -> System.out.println(Employee.getName()));
		
		System.out.println("\nFilter: Salary greater than $10,000");
		emp.stream().filter(Employee -> Employee.getSalary() > 10000.00)
		.forEach(Employee -> System.out.println(Employee.getName()));
		
	}
}
