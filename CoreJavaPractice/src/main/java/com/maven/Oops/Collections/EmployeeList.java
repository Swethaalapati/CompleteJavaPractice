package com.maven.Oops.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<Employee2> listOfEmployees = new ArrayList();
		
		Employee2 e  = new Employee2();
		Employee2 e1 = new Employee2(1,"swetha","engineer");
		Employee2 e2 = new Employee2(2,"chintu","developer");
		
		listOfEmployees.add(e);
		listOfEmployees.add(e1);
		listOfEmployees.add(e2);
		
		Employee2 e3 = new Employee2(3,"swathi", "tester");
		listOfEmployees.add(e3);
		
		for(Employee2 employee : listOfEmployees)
		{
			System.out.println(employee);
		}
		
		
		e2.setrole("software engineer");
		listOfEmployees.set(0, e3);
		
		for(Employee2 employee : listOfEmployees)
		{
			System.out.println(employee);
		}
	}
	
}
