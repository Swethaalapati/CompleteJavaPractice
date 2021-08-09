package com.maven.Oops.Collections;
public class Employee1
{
	private int id;
	private String name;
	private int exp;
	private Boolean isFulltime;
	private Role role;
	public Employee1(int id,String name,int exp,Boolean isFulltime,Role role)
	{
		this.id=id;
		this.name=name;
		this.setExp(exp);
		this.isFulltime = isFulltime;
		this.role=role;
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
	public int getExp() 
	{
		return this.exp;
	}
	public void setExp(int exp) 
	{
		this.exp = exp;
	}
	public Boolean getisFulltime()
	{
		return this.isFulltime;
	}
	public void setisFulltime(Boolean isFulltime)
	{
		this.isFulltime = isFulltime;
	}
	public Role getrole()
	{
		return this.role;
	}
	public void setrole(Role role)
	{
		this.role=role;
	}
	
	public boolean equals(Employee1 e)
	{
		if(this.id==e.id && this.name==e.name && this.exp == e.exp && this.isFulltime == e.isFulltime && this.role==e.role)
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
		return this.id +" " + this.name + " " +this.exp + " " + this.isFulltime + " " + this.role;
	}
	
}
