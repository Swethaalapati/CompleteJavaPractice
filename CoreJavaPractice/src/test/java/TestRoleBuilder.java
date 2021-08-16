import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.RoleManagement.*;


public class TestRoleBuilder {

	@Test
	public void testRoleBuilderObject()	{
		
		RoleBuilder builder = new RoleBuilder();
		
		assertTrue(builder instanceof RoleBuilder);
		
		RoleBuilder builder1 = new RoleBuilder();
		Role r = new Role(1, "Engineer");
		builder1.addRole(r);
		assertEquals(r, r);
		
		builder1.printRole();
		assertEquals(r, r);
		
		Role r1 = new Role(2, "Tester");
		builder1.updateRole(r, r1);
		assertEquals(r1, r1);
		
		builder1.removeRole(r1);
		assertEquals(r1, r1);
		
	}
	
}
