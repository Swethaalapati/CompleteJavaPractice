package com.maven.Oops.RoleManagement;
import java.util.ArrayList;

public class RoleBuilder {

	ArrayList<Role> role = new ArrayList<Role>();
	
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
	
	public void printRole()
	{
		System.out.println("the data is");
		for(Role role : role)
		{
			System.out.println(role);
		}
	}
	
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
