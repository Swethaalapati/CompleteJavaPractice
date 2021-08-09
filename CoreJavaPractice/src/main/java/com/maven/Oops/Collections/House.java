package com.maven.Oops.Collections;
public class House
{
	private int id;
	private String name;
	private int numofrooms;
	
	public House()
	{
		
	}
	public boolean equals(House h)
	{
		if(this.id==h.id && this.name==h.name && this.numofrooms==h.numofrooms)
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
	public void setnumofrooms(int numofrooms)
	{
		this.numofrooms=numofrooms;
	}
	public int getid()
	{
		return this.id;
	}
	public String getname()
	{
		return this.name;
	}
	public int getnumofrooms()
	{
		return this.numofrooms;
	}
	public String toString()
	{
		return this.id +" " + this.name + " " + this.numofrooms;
	}
	
}