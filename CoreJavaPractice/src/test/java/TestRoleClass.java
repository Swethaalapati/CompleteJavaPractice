import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.RoleManagement.Role;


public class TestRoleClass {

	@Test
	public void testRoleObject() {
		
		Role role = new Role();
		
		assertTrue(role instanceof Role);
		
		Role role1 = new Role(1, "Engineer");
		
		assertEquals(1, role1.getId());
		assertEquals("Engineer", role1.getRole());
		
		role1.setId(2);
		assertEquals(2, role1.getId());
		
		role1.setRole("Developer");
		assertEquals("Developer", role1.getRole());
		
		assertEquals(961, role.hashCode());
		
		Role role2 = new Role(2, "Developer");
		
		assertEquals(role1, role2);
				
		assertFalse(role.equals(role2));
		
		Object obj = new Object();
		assertTrue(role.equals(role));
		
		assertFalse(role.equals(null));
		
		Role role3 = new Role(3, "Tester");
		assertEquals("Role [id=3, role=Tester]", role3.toString());
		
	}
}
