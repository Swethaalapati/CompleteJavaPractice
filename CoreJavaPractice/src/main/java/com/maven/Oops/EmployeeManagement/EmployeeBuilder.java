package com.maven.Oops.EmployeeManagement;
import java.util.ArrayList;

public class EmployeeBuilder {

		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		/**
		 * to add employees
		 * 
		 * @param e - employee
		 */
		public void addEmployee(Employee e)
		{
			boolean flag = false;
			for(Employee emp : employee )
			{
				if(emp.equals(e))
				{
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				employee.add(e);
			}
		}
		
		/**
		 * to get list of all employees
		 * 
		 */
		public void printEmployee()
		{
			System.out.println("the data is");
			for(Employee emp : employee)
			{
				System.out.println(emp);
			}
		}
		
		/**
		 * to update an employee by removing current employee
		 * 
		 * @param current
		 * @param update
		 */
		public void updateEmployee(Employee current, Employee update)
		{
			boolean flag = false;
			for(Employee emp : employee)
			{
				if(emp.equals(current))
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				employee.remove(current);
				employee.add(update);
			}
		}
		
		/**
		 * to remove an employee
		 * 
		 * @param e
		 */
		public void removeEmployee(Employee e)
		{
			boolean flag = false;
			for(Employee emp : employee)
			{
				if(emp.equals(e))
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				employee.remove(e);
			}
		}
}
