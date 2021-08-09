package com.maven.Oops.Collections;

public class Student1 {
	
	private int id;
	private String name;
	private Branch branch;
	
	public Student1(int id,String name,Branch branch)
	{
		this.id=id;
		this.name=name;
		this.branch=branch;
	}
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public Branch getbranch()
	{
		return branch;
	}
	public void setbranch(Branch branch)
	{
		this.branch=branch;
	}
	
	public boolean equals(Student1 s1)
	{
		if(this.id==s1.id && this.name==s1.name && this.branch==s1.branch)
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
		return this.id +" " + this.name + " " + this.branch;
	}

}
