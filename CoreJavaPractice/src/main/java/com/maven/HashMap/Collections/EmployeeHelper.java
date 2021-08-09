package com.maven.HashMap.Collections;
import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeHelper 
{

	HashMap<Integer, Employee> employee = new HashMap<Integer, Employee>();
	
	
	public void addEmployee(Employee emp)
	{
		if(!employee.containsKey(emp.getId()))
		{
			employee.put(emp.getId(), emp);
		}
	}
	
	
	public boolean removeEmployee(Employee emp)
	{
		if(employee.containsKey(emp.getId()))
		{
			employee.remove(emp.getId());
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public void updateEmployee(Employee current, Employee update)
	{
		if(employee.containsKey(current.getId()))
		{
			employee.remove(current.getId());
		}
		employee.put(update.getId(),update);
	}
	
	
	public ArrayList<Employee> getAllEmployees()
	{
		return new ArrayList<Employee>(employee.values());
	}
}
