package com.maven.Oops.Collections;
public class Employee2
{
	private int id;
	private String name;
	private String role;
	public Employee2(int id,String name,String role)
	{
		this.id=id;
		this.name=name;
		this.role=role;
	}
	
	public Employee2() {
		
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
	public String getrole()
	{
		return this.role;
	}
	public void setrole(String role)
	{
		this.role=role;
	}
	
	public boolean equals(Employee2 e)
	{
		if(this.id==e.id && this.name==e.name && this.role==e.role)
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
		return this.id +" " + this.name + " " + this.role;
	}
}
