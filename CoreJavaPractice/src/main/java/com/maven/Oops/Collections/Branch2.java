package com.maven.Oops.Collections;

public class Branch2 {
	private int id;
	private String branchName;
	
	public Branch2(int id, String branchName)
	{
		this.id = id;
		this.branchName = branchName;
	}
	
	public Branch2()
	{
		
	}
	public int getid()
	{
		return this.id;
	}
	public void setid(int id)
	{
		this.id = id;
	}
	public String getbranchName()
	{
		return this.branchName;
	}
	public void setbranchName(String branchName)
	{
		this.branchName = branchName;
	}
	
	public boolean equals(Branch2 b)
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
