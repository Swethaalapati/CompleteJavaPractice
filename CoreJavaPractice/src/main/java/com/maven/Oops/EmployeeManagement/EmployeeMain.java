package com.maven.Oops.EmployeeManagement;

public class EmployeeMain {
	
	
	public static void main(String[] args) {
		
		EmployeeBuilder builder = new EmployeeBuilder();
		
		Employee e = new Employee(1, "swetha", "Engineer");
		Employee e1 = new Employee(2 , "chintu", "Software Engineer");
		
		builder.addEmployee(e);
		builder.addEmployee(e1);
		builder.printEmployee();
		
		builder.addEmployee(e1);
		builder.printEmployee();
		
		Employee e2 = new Employee(3, "swathi", "Engineer");
		builder.addEmployee(e2);
		builder.printEmployee();
		
		builder.updateEmployee(e1, e2);
		builder.printEmployee();
		builder.removeEmployee(e2);
		builder.printEmployee();
	}
}
