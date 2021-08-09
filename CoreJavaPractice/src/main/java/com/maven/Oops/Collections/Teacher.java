package com.maven.Oops.Collections;
public class Teacher
{
	private int id;
	private String name;
	private String subject;
	public Teacher()
	{
		
	}
	public Teacher(int id,String name,String subject)
	{
		this.id=id;
		this.name=name;
		this.subject=subject;
	}
	
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setsubject(String subject)
	{
		this.subject=subject;
	}
	public String getsubject()
	{
		return subject;
	}
	
	public boolean equals(Teacher t)
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