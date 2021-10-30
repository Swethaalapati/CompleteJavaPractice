package com.maven.Oops.RoleManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestRoleClass {
	
	@Test
	public void testRoleObject() {
		
		Role role = new Role();
		
		assertTrue(role instanceof Role);
		
		Role role1 = new Role(1, "Developer");
		
		assertEquals(1, role1.getId());
		assertEquals("Developer", role1.getrole());
		
		role1.setId(2);
		role1.setrole("Tester");
		
		assertEquals(2, role1.getId());
			
		assertEquals("Tester", role1.getrole());
		
		assertFalse(role1.equals(role));
		
		assertEquals(961, role.hashCode());
		
		assertFalse(role.equals(null));
		
		assertTrue(role.equals(role));
		
		Role role2 = new Role(2, "Tester");
		
		assertTrue(role1.equals(role2));
		
		Object o = new Object();
		
		assertFalse(role.equals(o));
		
		assertTrue(role1.equals(role2));
		role2.setrole("Developer");
		assertFalse(role1.equals(role2));
		
		System.out.println(role2);
		
		assertEquals("Role [id=2, role=Developer]", role2.toString());
		
		
				
	}

}
