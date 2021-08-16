import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.BranchManagement.Branch;
import com.maven.Oops.BranchManagement.BranchBuilder;

public class TestBranchBuilder {

	@Test
	public void testBranchBuilderObject()	{
		
		BranchBuilder builder = new BranchBuilder();
		
		assertTrue(builder instanceof BranchBuilder);
		
		BranchBuilder builder1 = new BranchBuilder();
		Branch b = new Branch(1, "CSE", "Swetha", null);
		Branch b1 = new Branch(2, "ECE", "Chintu", null);
		builder1.addBranch(b);
		assertEquals(b, b);
		
		builder1.getAllBranches();
		assertEquals(b, b);
		
		Branch b2 = new Branch(3, "IT", "Swathi", null);
		builder1.updateBranch(b, b2);
		assertEquals(b2, b2);
		
		builder1.removeBranch(b);
		assertEquals(b, b);
		
		builder1.getBranch(3);
		assertEquals(b2, b2);
		
		builder1.getBranchByBranchName("IT");
		assertEquals(b2, b2);
		
		builder1.getBranchByBranchHead("Chintu");
		assertEquals(b1, b1);
		
		builder1.getSubjectsById(3);
		assertEquals(b2, b2);
	}
	
}
