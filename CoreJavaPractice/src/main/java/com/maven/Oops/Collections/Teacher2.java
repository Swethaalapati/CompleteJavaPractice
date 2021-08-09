package com.maven.Oops.Collections;
public class Teacher2
{
	private int id;
	private String name;
	private String subject;
	
	public Teacher2()
	{
		
	}
	public Teacher2(int id,String name,String subject)
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
	public String getsubject()
	{
		return subject;
	}
	public void setsubject(String subject)
	{
		this.subject=subject;
	}
	
	
	public boolean equals(Teacher2 t)
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