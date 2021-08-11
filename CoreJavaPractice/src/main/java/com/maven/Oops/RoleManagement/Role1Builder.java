package com.maven.Oops.RoleManagement;
import java.util.ArrayList;

public class Role1Builder {

	
	ArrayList<Role1> role = new ArrayList();
	
	/**
	 * to add role details
	 * 
	 * @param r
	 * @return boolean values based on parameter
	 */
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
	
	/**
	 * to get List of Role details
	 * 
	 * @return List of role details
	 */
	public ArrayList<Role1> getAllRoles()
	{
		return role;
	}
	
	/**
	 * to remove role details
	 * 
	 */
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
	
	/**
	 * to update role details by removing current role details
	 * 
	 * @param current -- existing role details
	 * @param update -- new role details
	 * @return boolean values based on parameters
	 */
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
	
	/**
	 * to get role details by id
	 * 
	 * @param id
	 * @return role details
	 */
	public Role1 getRole1ById(int id)
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
	
	/**
	 * to get List of Role details by role name
	 * 
	 * @param roleName
	 * @return List of role details
	 */
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
