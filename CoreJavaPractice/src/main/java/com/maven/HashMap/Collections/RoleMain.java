package com.maven.HashMap.Collections;

public class RoleMain {

	public static void main(String[] args) 
	{
		RoleHelper helper = new RoleHelper();
		
		Role r = new Role(1, "Engineer");
		Role r1 = new Role(2, "Developer");
		Role r2 = new Role(3, "Tester");
		Role r3 = new Role(4, "Support");
		
		
		helper.addRole(r);
		helper.addRole(r1);
		helper.addRole(r2);
		helper.addRole(r3);
		
		System.out.println(helper.getAllRoles());
		
		helper.removeRole(r);
		
		System.out.println(helper.getAllRoles());
		
		helper.updateRole(r2, r3);
		
		System.out.println(helper.getAllRoles());
	}
}