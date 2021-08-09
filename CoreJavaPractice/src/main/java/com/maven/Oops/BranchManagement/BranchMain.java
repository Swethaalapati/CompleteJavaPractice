package com.maven.Oops.BranchManagement;

public class BranchMain {
	
	
	public static void main(String[] args) {
		
		BranchBuilder builder = new BranchBuilder();
		
		Branch b = new Branch(1, "cse");
		Branch b1 = new Branch(2 , "cse");
		
		builder.addBranch(b);
		builder.addBranch(b1);
		builder.printBranch();
		
		builder.addBranch(b1);
		builder.printBranch();
		
		Branch b2 = new Branch(3, "IT");
		builder.addBranch(b2);
		builder.printBranch();
		
		builder.updateBranch(b, b1);
		builder.printBranch();
		builder.removeBranch(b1);
		builder.printBranch();
	}
}
