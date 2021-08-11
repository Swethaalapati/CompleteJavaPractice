package com.maven.Oops.RoleManagement;
import java.util.ArrayList;

public class RoleBuilder {

	ArrayList<Role> role = new ArrayList<Role>();
	
	/**
	 * to add role details
	 * 
	 * @param r
	 */
	public void addRole(Role r)
	{
		boolean flag = false;
		for(Role role : role)
		{
			if(role.equals(r))
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			role.add(r);
		}
	}
	
	/**
	 * to get List of Role details
	 * 
	 */
	public void printRole()
	{
		System.out.println("the data is");
		for(Role role : role)
		{
			System.out.println(role);
		}
	}
	
	/**
	 * to update role details by removing current details
	 * 
	 * @param current -- existing details
	 * @param update -- new details
	 */
	public void updateRole(Role current, Role update)
	{
		boolean flag = false;
		for (Role role : role) 
		{
			if(role.equals(current))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			role.remove(current);
			role.add(update);
		}
	}
	
	/**
	 * to remove role details
	 * 
	 * @param r
	 */
	public void removeRole(Role r)
	{
		boolean flag = false;
		for (Role role : role) 
		{
			if(role.equals(r))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			role.remove(r);
		}
	}
}
