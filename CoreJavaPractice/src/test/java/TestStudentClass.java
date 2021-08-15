import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.StudentManagement.Student;

public class TestStudentClass {
	
	@Test
	public void testStudentObject() {
		
		Student student = new Student();
		
		assertTrue(student instanceof Student);
		
		Student student1 = new Student(1, "Swetha", "CSE");
		
		assertEquals(1, student1.getId());
		assertEquals("Swetha", student1.getName());
		assertEquals("CSE", student1.getBranchName());
		
		student1.setId(2);
		assertEquals(2, student1.getId());
		
		student1.setName("Chintu");
		assertEquals("Chintu", student1.getName());
		
		student1.setBranchName("ECE");
		assertEquals("ECE", student1.getBranchName());
		
		assertEquals(29791, student.hashCode());
		
		Student student2 = new Student(2, "Chintu", "ECE");
		
		assertEquals(student1, student2);
				
		assertFalse(student.equals(student2));
		
		Object obj = new Object();
		assertTrue(student.equals(student));
		
		assertFalse(student.equals(null));
		
		Student student3 = new Student(3, "Swathi", "IT");
		assertEquals("Student [id=3, name=Swathi, branchName=IT]", student3.toString());
		
	}

}
