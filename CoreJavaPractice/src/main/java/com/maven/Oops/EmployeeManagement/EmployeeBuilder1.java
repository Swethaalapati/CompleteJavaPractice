package com.maven.Oops.EmployeeManagement;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeBuilder1 {
	
	Scanner s = new Scanner(System.in);
	ArrayList<Employee1> employee = new ArrayList();
	/**
	 * adding an employee if id's are equal
	 * 
	 * @param e - taking a parameter for Employee1 as e
	 * @return true or false
	 */
	public boolean addEmployee1(Employee1 e)
	{
		boolean flag = true;
		for(Employee1 emp : employee)
		{
			if(emp.getId() == e.getId())
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			employee.add(e);
		}
		return flag;
	}
	
	/**
	 * to get list of all employees
	 * 
	 * @return list of employees
	 */
	public ArrayList<Employee1> getAllEmployees()
	{
		return employee;
	}
	
	/**
	 * for removing an employee if same employee exists
	 * 
	 * @param e
	 * @return true or false
	 */
	public boolean removeEmployee1(Employee1 e)
	{
		boolean flag = false;
		for(Employee1 emp : employee)
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
		return flag;
	}
	
	/**
	 * to update an employee by removing the current employee
	 * 
	 * @param current
	 * @param update
	 * @return true or false based on updation
	 */
	public boolean updateEmployee1(Employee1 current, Employee1 update)
	{
		boolean flag = false;
		for(Employee1 emp : employee)
		{
			if(emp.equals(current))
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			employee.remove(current);
			employee.add(update);
		}
		return flag;
	}
	
	
	/**
	 * getting employee details by id, if id's are equal then will get the employee details
	 * 
	 * @param id - employee id
	 * @return e if id's are same
	 */
	public Employee1 getEmployee1(int id)
	{
		Employee1 e = null;
		for(Employee1 emp : employee)
		{
			if(emp.getId() == id)
			{
				e = emp;
				break;
			}
		}
		return e;
	}
	
	/**
	 * list of employees whose joining year is as per the parameter using the last four digits of employee id
	 * 
	 * @param year
	 * @return the list of employees as per year
	 */
	public ArrayList<Employee1> getEmployeeByJoiningYear(int year)
	{
		ArrayList<Employee1> joiningyear = new ArrayList();
		for(Employee1 emp : employee)
		{
			int n = emp.getId();
			int rem, rev = 0;
			for(int i = 0; i < 4; i++)
	        {
	            rem = n % 10;
	            rev = (rev * 10) + rem;
	            n = n / 10;
	        }
			int JY = rev;
			int rem1, rerev = 0;
			for(int i = 0; i < 4; i++)
			{
				
				rem1 = JY % 10;
				rerev = (rerev * 10) + rem1;
				JY = JY / 10;
			}
			int JY1 = rerev;
			if(JY1 == year)
			{
				joiningyear.add(emp);
			}
		}
		return joiningyear;
	}
	
	/**
	 * list of employees as per the role
	 * 
	 * @param role
	 * @return the list of employees as per the role
	 */
	public ArrayList<Employee1> getEmployeeByRole(String role)
	{
		ArrayList<Employee1> roleEmployee = new ArrayList();
		for(Employee1 emp : employee)
		{
			if(emp.getRole().equals(role))
			{
				roleEmployee.add(emp);
			}
		}
		return roleEmployee;
	}
	
	/**
	 * list of employees whose experience is as per the parameter
	 * 
	 * @param experience
	 * @return the list of employees who are experienced
	 */
	public ArrayList<Employee1> getEmployeeByExperience(int experience)
	{
		ArrayList<Employee1> experienceEmployee = new ArrayList();
		for(Employee1 emp : employee)
		{
			if(emp.getExperience() == experience)
			{
				experienceEmployee.add(emp);
			}
		}
		return experienceEmployee;
	}

	/**
	 * List of employees who are permanent 
	 * 
	 * @param permnt - permanent employee 
	 * @return List<Employee> - List of employees
	 */
	public ArrayList<Employee1> getEmployeeByPermnt(String permnt)		
	{
		ArrayList<Employee1> permntEmployee = new ArrayList();
		for(Employee1 emp : employee)
		{
			if(emp.getPermnt().equals(permnt))
			{
				permntEmployee.add(emp);
			}
		}
		return permntEmployee;
	}
	
	/**
	 * List of employees who's salary is equals to @Param-salary
	 * 
	 * @param salary - salary 
	 * @return List<Employee> - List of employees
	 */
	public ArrayList<Employee1> getEmployeeBySalary(int salary)	
	{
		ArrayList<Employee1> salaryEmployee = new ArrayList();
		for(Employee1 emp : employee)
		{
			if(emp.getSalary() >= salary)
			{
				salaryEmployee.add(emp);
			}
		}
		return salaryEmployee;
	}
	
	/**
	 * to increase the salary of an employee using the employee id
	 * 
	 * @param emId
	 * @param increment
	 * @return
	 */
	
	public void getIncreaseSalary(int emId, int increment)		
	{
	 
		for(Employee1 emp : employee)
		{
			if(emp.getId() == emId)
			{
				int salary = emp.getSalary();
				emp.setSalary(salary + increment); 
			}
		}
		
	}
	/**
	 * to calculate hike by percentage
	 * 
	 * @param x - percentage for an employee
	 */
	public void giveHikeByPercentage(int x) 	
	{
		
		for(Employee1 emp : employee) {
			
			int salary = emp.getSalary();
			
			double totalSal = (double) salary * ((double)x / 100.00);
		
			
			emp.setSalary((salary + (int) totalSal));
		}
	}
}

