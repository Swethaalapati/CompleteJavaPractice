package com.maven.Oops.RoleManagement;

public class Role1Main {

	public static void main(String args[])
	{
		Role1Builder builder = new Role1Builder();
		
		Role1 r = new Role1(1, "Engineer");
		Role1 r1 = new Role1(2, "software Engineer");
		Role1 r2 = new Role1(3, "tester");
		Role1 r3 = new Role1(4, "developer");
		
		System.out.println(builder.addRole(r));
		System.out.println(builder.addRole(r1));
		System.out.println(builder.addRole(r2));
		System.out.println(builder.addRole(r3));
		
		System.out.println(builder.getAllRoles());
		
		System.out.println(builder.removeRole(r1));
		
		System.out.println(builder.updateRole(r, r2));
		
		System.out.println(builder.getRole1ById(3));
		
		System.out.println(builder.getRole1ByRoleName("tester"));
		
	}
}
