package com.maven.Oops.Collections;
public class Employee
{
	private int id;
	private String name;
	private String role;
	public Employee(int id,String name,String role)
	{
		this.id=id;
		this.name=name;
		this.role=role;
	}
	public boolean equals(Employee e)
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
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setrole(String role)
	{
		this.role=role;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public String getrole()
	{
		return role;
	}
	public String toString()
	{
		return this.id +" " + this.name + " " + this.role;
	}
}
