import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.EmployeeManagement.Employee;

public class TestEmployeeClass {

	@Test
	public void testEmployeeObject() {
		
		Employee employee = new Employee();
		
		assertTrue(employee instanceof Employee);
		
		Employee employee1 = new Employee(1, "swetha", "Engineer");
		
		assertEquals(1, employee1.getId());
		assertEquals("swetha", employee1.getName());
		assertEquals("Engineer", employee1.getRole());
		
		employee1.setId(2);
		assertEquals(2, employee1.getId());
		
		employee1.setName("chintu");
		assertEquals("chintu", employee1.getName());
		
		employee1.setRole("Developer");
		assertEquals("Developer", employee1.getRole());
		
		assertEquals(29791, employee.hashCode());
		
		Employee employee2 = new Employee(2, "chintu", "Developer");
		assertEquals(employee1, employee2);
		
		assertFalse(employee.equals(employee2));
		
		Object obj = new Object();
		assertTrue(employee.equals(employee));
		
		assertFalse(employee.equals(null));
		
		Employee employee3 = new Employee(3, "swathi", "Tester");
		assertEquals("Employee [id=3, name=swathi, role=Tester]", employee3.toString());
		
	}
	
}
