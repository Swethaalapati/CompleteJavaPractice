package com.maven.Oops.Collections;

public class Student2 {
	
	private int id;
	private String name;
	private String branchName;

	public Student2(int id, String name, String branchName) 
	{
		this.id = id;
		this.name = name;
		this.branchName = branchName;
	}
	
	public Student2() {
		// TODO Auto-generated constructor stub
	}

	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id = id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public String getbranchName()
	{
		return branchName;
	}
	public void setbranchName(String branchName)
	{
		this.branchName = branchName;
	}
	
	public boolean equals(Student2 s)
	{
		if(this.id==s.id && this.name==s.name && this.branchName==s.branchName)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return this.id +" " + this.name + " " + this.branchName;
	}
}
