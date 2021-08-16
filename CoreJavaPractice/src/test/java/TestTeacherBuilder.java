import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.TeacherManagement.Teacher;
import com.maven.Oops.TeacherManagement.TeacherBuilder;



public class TestTeacherBuilder {

	@Test
	public void testTeacherBuilderObject()	{
		
		TeacherBuilder builder = new TeacherBuilder();
		
		assertTrue(builder instanceof TeacherBuilder);
		
		TeacherBuilder builder1 = new TeacherBuilder();
		Teacher t = new Teacher(1, "Swetha", "Java");
		builder1.addTeacher(t);
		assertEquals(t, t);
		
		builder1.printTeacher();
		assertEquals(t, t);
		
		Teacher t1 = new Teacher(2, "Swathi", "WT");
		builder1.updateTeacher(t, t1);
		assertEquals(t1, t1);
		
		builder1.removeTeacher(t1);
		assertEquals(t1, t1);
		
	}
	
}
