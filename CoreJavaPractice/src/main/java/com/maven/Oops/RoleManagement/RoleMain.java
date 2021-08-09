package com.maven.Oops.RoleManagement;

public class RoleMain {
	
	public static void main(String args[])
	{
		RoleBuilder builder = new RoleBuilder();
		
		Role r = new Role(1, "Engineer");
		Role r1 = new Role(2, "Software Engineer");
		
		builder.addRole(r);
		builder.addRole(r1);
		builder.printRole();
		
		builder.addRole(r);
		builder.printRole();
		
		Role r2 = new Role(3, "Engineer");
		builder.addRole(r2);
		builder.printRole();
		
		builder.updateRole(r1, r2);
		builder.printRole();
		
		builder.removeRole(r2);
		builder.printRole();
	}

	
	
	
}
