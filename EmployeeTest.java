package com.day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;



public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Ramesh");
		e1.setSalary(25000);
		e1.setGender("male");
		e1.setId(101);
		
		Employee e2 = new Employee();
		e2.setName("Sameer");
		e2.setSalary(28000);
		e2.setGender("male");
		e2.setId(105);
		
		Employee e3 = new Employee();
		e3.setName("Rajesh");
		e3.setSalary(12000);
		e3.setGender("male");
		e3.setId(110);
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		//System.out.println(list);
		
		
		Optional<Employee> emp = list.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).findFirst();
		
		System.out.println(emp.get().getName());
		        
		
		

	}

}
