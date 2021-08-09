package com.maven.Oops.Collections;

public class Subject {
	private int id;
	private String subName;
	
	public Subject(int id, String subName)
	{
		this.id = id;
		this.subName = subName;
	}
	public boolean equals(Subject s)
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
