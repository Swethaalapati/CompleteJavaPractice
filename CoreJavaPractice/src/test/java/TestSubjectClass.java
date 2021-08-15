import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.SubjectManagement.Subject;

public class TestSubjectClass {

	@Test
	public void testSubjectObject() {
		
		Subject subject = new Subject();
		
		assertTrue(subject instanceof Subject);
		
		Subject subject1 = new Subject(1, "CPP");
		
		assertEquals(1, subject1.getId());
		assertEquals("CPP", subject1.getSub());
		
		subject1.setId(2);
		assertEquals(2, subject1.getId());
		
		subject1.setSub("Java");
		assertEquals("Java", subject1.getSub());
		
		assertEquals(961, subject.hashCode());
		
		Subject subject2 = new Subject(2, "Java");
		
		assertEquals(subject1, subject2);
				
		assertFalse(subject.equals(subject2));
		
		Object obj = new Object();
		assertTrue(subject.equals(subject));
		
		assertFalse(subject.equals(null));
		
		Subject subject3 = new Subject(3, "WT");
		assertEquals("Subject [id=3, sub=WT]", subject3.toString());
		
	}
	
}
