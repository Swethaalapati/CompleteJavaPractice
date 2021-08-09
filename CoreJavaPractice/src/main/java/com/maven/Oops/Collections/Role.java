package com.maven.Oops.Collections;

public class Role {
	
	private int id;
	private String roleName;
	private Boolean isPerm;
	
	public Role(int id, String roleName, Boolean isPerm)
	{
		this.id = id;
		this.roleName = roleName;
		this.isPerm = isPerm;
		
	}
	public Boolean getisPerm()
	{
		return this.isPerm;
	}
	public void setisDinning(Boolean isPerm)
	{
		this.isPerm = isPerm;
	}
	public boolean equals(Role r)
	{
		if(!(this.id == r.id && this.roleName == r.roleName && this.isPerm == r.isPerm))
		{
			return false;
		}
		return true;
	}
	public String toString()
	{
		return this.id + " " + this.roleName + " " + this.isPerm;
	}
}
