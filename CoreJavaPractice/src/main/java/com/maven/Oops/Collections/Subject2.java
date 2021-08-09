package com.maven.Oops.Collections;

public class Subject2 {
	private int id;
	private String subName;
	
	public Subject2(int id, String subName)
	{
		this.id = id;
		this.subName = subName;
	}
	public Subject2() {
		
	}
	public int getid()
	{
		return this.id;
	}
	public void setid(int id)
	{
		this.id = id;
	}
	public String getsubName()
	{
		return this.subName;
	}
	public void setsubName(String subName)
	{
		this.subName = subName;
	}
	
	public boolean equals(Subject2 s)
	{
		if(!(this.id == s.id && this.subName == s.subName))
		{
			return false;
		}
		return true;
	}
	public String toString()
	{
		return this.id + " " + this.subName;
	}
}
