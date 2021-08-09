package com.maven.HashMap.Collections;

public class EmployeeMain {
	
	public static void main(String[] args) 
	{
		EmployeeHelper helper = new EmployeeHelper();
		
		Employee e = new Employee(1, "swetha", "Engineer");
		Employee e1 = new Employee(2, "chintu", "Developer");
		Employee e2 = new Employee(3, "swathi", "Tester");
		Employee e3 = new Employee(4, "ajay", "Support");
		
		
		helper.addEmployee(e);
		helper.addEmployee(e1);
		helper.addEmployee(e2);
		helper.addEmployee(e3);
		
		System.out.println(helper.getAllEmployees());
		
		helper.removeEmployee(e);
		
		System.out.println(helper.getAllEmployees());
		
		helper.updateEmployee(e3, e2);
		
		System.out.println(helper.getAllEmployees());
	}
}
