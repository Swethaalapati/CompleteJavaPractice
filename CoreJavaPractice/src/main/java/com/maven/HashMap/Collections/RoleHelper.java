package com.maven.HashMap.Collections;
import java.util.ArrayList;
import java.util.HashMap;

public class RoleHelper {

	
	HashMap<Integer, Role> role = new HashMap<Integer, Role>();
	
	
	public void addRole(Role rl)
	{
		if(!role.containsKey(rl.getId()))
		{
			role.put(rl.getId(), rl);
		}
	}
	
	
	public boolean removeRole(Role rl)
	{
		if(role.containsKey(rl.getId()))
		{
			role.remove(rl.getId());
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public void updateRole(Role current, Role update)
	{
		if(role.containsKey(current.getId()))
		{
			role.remove(current.getId());
		}
		role.put(update.getId(),update);
	}
	
	
	public ArrayList<Role> getAllRoles()
	{
		return new ArrayList<Role>(role.values());
	}
}
