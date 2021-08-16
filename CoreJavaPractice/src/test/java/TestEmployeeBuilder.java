import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.EmployeeManagement.Employee;
import com.maven.Oops.EmployeeManagement.EmployeeBuilder;



public class TestEmployeeBuilder {

	@Test
	public void testEmployeeBuilderObject()	{
		
		EmployeeBuilder builder = new EmployeeBuilder();
		
		assertTrue(builder instanceof EmployeeBuilder);
		
		EmployeeBuilder builder1 = new EmployeeBuilder();
		Employee e = new Employee(1, "Swetha", "Engineer");
		builder1.addEmployee(e);
		assertEquals(e, e);
		
		builder1.printEmployee();
		assertEquals(e, e);
		
		Employee e1 = new Employee(2, "Swathi", "Tester");
		builder1.updateEmployee(e, e1);
		assertEquals(e1, e1);
		
		builder1.removeEmployee(e1);
		assertEquals(e1, e1);
		
	}
	
}
