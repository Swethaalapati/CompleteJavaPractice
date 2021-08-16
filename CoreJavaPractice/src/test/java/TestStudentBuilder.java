import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.StudentManagement.Student;
import com.maven.Oops.StudentManagement.StudentBuilder;



public class TestStudentBuilder {

	@Test
	public void testStudentBuilderObject()	{
		
		StudentBuilder builder = new StudentBuilder();
		
		assertTrue(builder instanceof StudentBuilder);
		
		StudentBuilder builder1 = new StudentBuilder();
		Student s = new Student(1, "Swetha", "CSE");
		builder1.addStudent(s);
		assertEquals(s, s);
		
		builder1.printStudent();
		assertEquals(s, s);
		
		Student s1 = new Student(2, "Swathi", "IT");
		builder1.updateStudent(s, s1);
		assertEquals(s1, s1);
		
		builder1.removeStudent(s1);
		assertEquals(s1, s1);
		
	}
	
}
