package com.maven.Oops.Collections;

public class Teacher1 {
	
	private int id;
	private String name;
	private Subject subject;
	
	public Teacher1(int id,String name,Subject subject)
	{
		this.id=id;
		this.name=name;
		this.subject=subject;
	}
	
	
	public int getid()
	{
		return this.id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return this.name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public Subject getsubject()
	{
		return this.subject;
	}
	public void setsubject(Subject subject)
	{
		this.subject=subject;
	}
	
	
	public boolean equals(Teacher1 t)
	{
		if(this.id==t.id && this.name==t.name && this.subject==t.subject)
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
		return this.id +" " + this.name + " " + this.subject;
	}
}
