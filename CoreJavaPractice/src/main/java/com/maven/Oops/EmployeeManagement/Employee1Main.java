package com.maven.Oops.EmployeeManagement;

public class Employee1Main {

	
	public static void main(String args[])
	{
		EmployeeBuilder1 builder = new EmployeeBuilder1();
		
		Employee1 e = new Employee1(12019, "swetha", "alapati", "engineer", 2, "yes", 45000);
		Employee1 e1 = new Employee1(22018, "chintu", "parimi", "developer", 3, "no", 50000);
		Employee1 e2 = new Employee1(32019, "swathi", "alapati", "engineer", 2, "yes", 55000);
		Employee1 e3 = new Employee1(12017, "ajay", "yadavalli", "tester", 4, "yes", 50000);
		
		System.out.println(builder.addEmployee1(e));
		System.out.println(builder.addEmployee1(e1));
		System.out.println(builder.addEmployee1(e2));
		System.out.println(builder.addEmployee1(e3));
		
		System.out.println(builder.getAllEmployees());
		
		System.out.println(builder.removeEmployee1(e1));
		System.out.println(builder.updateEmployee1(e3, e1));
		
		System.out.println(builder.getEmployee1(12019));
		
		System.out.println(builder.getEmployeeByJoiningYear(2019));
		
		System.out.println(builder.getEmployeeByRole("engineer"));
		
		System.out.println(builder.getEmployeeByExperience(2));
		
		System.out.println(builder.getEmployeeByPermnt("yes"));
		
		System.out.println(builder.getEmployeeBySalary(50000));
		
		builder.increaseSalary(12017, 5000);
		System.out.println(e3);
		
		builder.giveHikeByPercentage(10);

		System.out.println(builder.getAllEmployees());
	}
}
