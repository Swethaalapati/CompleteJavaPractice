package com.maven.Oops.RoleManagement;
import java.util.ArrayList;

public class Role1Builder {

	
	ArrayList<Role1> role = new ArrayList();
	
	public boolean addRole(Role1 r)
	{
		boolean flag = false;
		for(Role1 rl : role)
		{
			if(rl.getId() == r.getId())
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			role.add(r);
		}
		return flag;
	}
	
	
	public ArrayList<Role1> getAllRoles()
	{
		return role;
	}
	
	
	public boolean removeRole(Role1 r)
	{
		boolean flag = false;
		for(Role1 rl : role)
		{
			if(rl.equals(r))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			role.remove(r);
		}
		return flag;
	}
	
	
	public boolean updateRole(Role1 current, Role1 update)
	{
		boolean flag = false;
		for(Role1 rl : role)
		{
			if(rl.equals(current))
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
		return flag;
	}
	
	
	public Role1 getRole1(int id)
	{
		Role1 r = null;
		for(Role1 rl : role)
		{
			if(rl.getId() == id)
			{
				return rl;
			}
		}
		return r;
	}
	
	
	public ArrayList<Role1> getRole1ByRoleName(String roleName)
	{
		ArrayList<Role1> roleNameRole1 = new ArrayList();
		for(Role1 rl : role)
		{
			if(rl.getRoleName().equals(roleName))
			{
				roleNameRole1.add(rl);
			}
		}
		return roleNameRole1;
	}
	
}
