package com.maven.Oops.BranchManagement;
import java.util.ArrayList;

public class Branch1Main {

	public static void main(String args[])
	{
		Branch1Builder builder = new Branch1Builder();
		ArrayList<String> cseSubjects = new ArrayList();
		
		
		cseSubjects.add("java");
		cseSubjects.add("c++");
		cseSubjects.add("c");
		cseSubjects.add("WT");
		
		ArrayList<String> eceSubjects = new ArrayList();
		
		
		eceSubjects.add("DE");
		eceSubjects.add("BEE");
		eceSubjects.add("c");
		eceSubjects.add("EC");
		
		ArrayList<String> itSubjects = new ArrayList();
		
		
		itSubjects.add("java");
		itSubjects.add("c++");
		itSubjects.add("c");
		itSubjects.add("LP");
		
		ArrayList<String> civilSubjects = new ArrayList();
		
		
		civilSubjects.add("CE");
		civilSubjects.add("SA");
		civilSubjects.add("BPD");
		civilSubjects.add("GCE");
		
		Branch1 b = new Branch1(1, "cse", "swetha", cseSubjects);
		Branch1 b1 = new Branch1(2, "IT", "chintu", itSubjects);
		Branch1 b2 = new Branch1(3, "ece", "swathi", eceSubjects);
		Branch1 b3 = new Branch1(4, "civil", "ajay", civilSubjects);
		
		System.out.println(builder.addBranch(b));
		System.out.println(builder.addBranch(b1));
		System.out.println(builder.addBranch(b2));
		System.out.println(builder.addBranch(b3));
		
		System.out.println(builder.getAllBranches());
		
		System.out.println(builder.removeBranch(b1));
		System.out.println(builder.getAllBranches());
		
		System.out.println(builder.updateBranch(b, b2));
		System.out.println(builder.getAllBranches());
		
		System.out.println(builder.getBranch1(3));
		
		System.out.println(builder.getBranch1ByBranchName("ece"));
		
		System.out.println(builder.getBranch1ByBranchHead("ajay"));
		
		System.out.println(builder.getSubjectsById(4));
		
	}
}
