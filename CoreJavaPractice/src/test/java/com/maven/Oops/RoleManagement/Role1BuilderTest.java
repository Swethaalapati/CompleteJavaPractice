package com.maven.Oops.RoleManagement;


import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Role1BuilderTest {
	
	@Test
	public void testAddRole() {
		
	}
	
	@Test
	public void testRemoveRole() {
		
		
	}
	
	@Test
	public void testGetAllRoles() {
		
		ArrayList<Role1> list = new ArrayList();
		Role1 role = new Role1();
		Role1 role1 = new Role1();
		Role1 role2 = new Role1(1, "Developer");
		list.add(role);
		list.add(role2);
		
		Role1Builder build = new Role1Builder();
		build.addRole(role1);
		build.addRole(role);
		build.addRole(role2);
		
		assertIterableEquals(list, build.getAllRoles());
		
		
	}
	
	@Test
	public void testUpdateRole() {
		
		
		
	}
	
	@Test
	public void testGetRoleByName() {
		
	}
	
	@Test
	public void testGetRoleById() {
		
	}
}
