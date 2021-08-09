package com.maven.Oops.Collections;

public class Branch {
	private int id;
	private String branchName;
	
	public Branch(int id, String branchName)
	{
		this.id = id;
		this.branchName = branchName;
	}
	public boolean equals(Branch b)
	{
		if(!(this.id == b.id && this.branchName == b.branchName))
		{
			return false;
		}
		return true;
	}
	public String toString()
	{
		return this.id + " " + this.branchName;
	}
}
