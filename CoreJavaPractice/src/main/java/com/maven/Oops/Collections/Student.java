package com.maven.Oops.Collections;

public class Student
{
	private int id;
	private String name;
	private String branch;
	public Student(int id,String name,String branch)
	{
		this.id=id;
		this.name=name;
		this.branch=branch;
	}
	public boolean equals(Student s)
	{
		if(this.id==s.id && this.name==s.name && this.branch==s.branch)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setbranch(String branch)
	{
		this.branch=branch;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public String getbranch()
	{
		return branch;
	}
	public String toString()
	{
		return this.id +" " + this.name + " " + this.branch;
	}
}
