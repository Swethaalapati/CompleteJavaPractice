import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.TeacherManagement.Teacher;


public class TestTeacherClass {

	@Test
	public void testTeacherObject() {
		
		Teacher teacher = new Teacher();
		
		assertTrue(teacher instanceof Teacher);
		
		Teacher teacher1 = new Teacher(1, "Swetha", "CPP");
		
		assertEquals(1, teacher1.getId());
		assertEquals("Swetha", teacher1.getName());
		assertEquals("CPP", teacher1.getSubject());
		
		teacher1.setId(2);
		assertEquals(2, teacher1.getId());
		
		teacher1.setName("Chintu");
		assertEquals("Chintu", teacher1.getName());
		
		teacher1.setSubject("Java");
		assertEquals("Java", teacher1.getSubject());
		
		assertEquals(29791, teacher.hashCode());
		
		Teacher teacher2 = new Teacher(2, "Chintu", "Java");
		
		assertEquals(teacher1, teacher2);
				
		assertFalse(teacher.equals(teacher2));
		
		Object obj = new Object();
		assertTrue(teacher.equals(teacher));
		
		assertFalse(teacher.equals(null));
		
		Teacher teacher3 = new Teacher(3, "Swathi", "WT");
		assertEquals("Teacher [id=3, name=Swathi, subject=WT]", teacher3.toString());
		
	}
	
}
