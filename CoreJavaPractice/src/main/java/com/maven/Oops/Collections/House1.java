package com.maven.Oops.Collections;
public class House1
{
	private int id;
	private String name;
	private Hall hall;
	
	public House1()
	{
		
	}
	
	public House1(int id,String name,Hall hall)
	{
		this.id=id;
		this.name=name;
		this.hall=hall;
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
	public Hall gethall()
	{
		return this.hall;
	}
	public void sethall(Hall hall)
	{
		this.hall=hall;
	}

	public boolean equals(House1 h)
	{
		if(this.id==h.id && this.name==h.name && this.hall==h.hall)
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
		return this.id +" " + this.name + " " + this.hall;
	}
	
}