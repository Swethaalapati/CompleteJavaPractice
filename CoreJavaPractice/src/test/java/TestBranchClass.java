import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.BranchManagement.Branch;


public class TestBranchClass {
	
	@Test
	public void testBranchObject() {
		
		Branch branch = new Branch();
		
		assertTrue(branch instanceof Branch);
		
		Branch branch1 = new Branch(1, "CSE", "Swetha", null);
		
		assertEquals(1, branch1.getId());
		assertEquals("CSE", branch1.getBranchName());
		assertEquals("Swetha", branch1.getBranchHead());
		assertEquals(null, branch1.getSubjects());
		
		branch1.setId(2);
		assertEquals(2, branch1.getId());
		
		branch1.setBranchName("ECE");
		assertEquals("ECE", branch1.getBranchName());
		
		branch1.setBranchHead("Swathi");
		assertEquals("Swathi", branch1.getBranchHead());
		
		branch1.setSubjects(null);
		assertEquals(null, branch1.getSubjects());
		
		assertEquals(923521, branch.hashCode());
		
		Branch branch2 = new Branch(2, "ECE", "Swathi", null);
		
		assertEquals(branch1, branch2);
		
		assertFalse(branch.equals(branch2));
		
		Object obj = new Object();
		assertTrue(branch.equals(branch));
		
		assertFalse(branch.equals(null));
		
		Branch branch3 = new Branch(3, "IT", "Chintu", null);
		assertEquals("Branch [id=3, branchName=IT, branchHead=Chintu, subjects=null]", branch3.toString());
	}

}
