import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.SubjectManagement.Subject;
import com.maven.Oops.SubjectManagement.SubjectBuilder;



public class TestSubjectBuilder {

	@Test
	public void testSubjectBuilderObject()	{
		
		SubjectBuilder builder = new SubjectBuilder();
		
		assertTrue(builder instanceof SubjectBuilder);
		
		SubjectBuilder builder1 = new SubjectBuilder();
		Subject s = new Subject(1, "Java");
		builder1.addSubject(s);
		assertEquals(s, s);
		
		builder1.printSubject();
		assertEquals(s, s);
		
		Subject s1 = new Subject(2, "WT");
		builder1.updateSubject(s, s1);
		assertEquals(s1, s1);
		
		builder1.removeSubject(s1);
		assertEquals(s1, s1);
		
	}
	
}
