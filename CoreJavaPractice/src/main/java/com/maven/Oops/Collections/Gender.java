package com.maven.Oops.Collections;

public class Gender {
	
	private String type;
	
	
	public Gender(String type)
	{
		this.type = type;
	}
	public String gettype()
	{
		return this.type;
	}
	public void settype(String type)
	{
		this.type = type;
	}
	public boolean equals(Gender g)
	{
		if(!(this.type == g.type))
		{
			return false;
		}
		return true;
	}
	public String toString()
	{
		return this.type;
	}
}
