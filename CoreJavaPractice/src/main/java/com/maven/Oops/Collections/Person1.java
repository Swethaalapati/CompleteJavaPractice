package com.maven.Oops.Collections;

public class Person1 {
	
	private int id;
	private int age;
	private String name;
	private double weight;
	private double height;
	private boolean isAlive;
	private Gender gender;
	
	public Person1()
	{
		
	}
	
	public Person1(int id, int age, String name, double weight, double height, boolean isAlive, Gender gender)
	{
		this.id = id;
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.isAlive = isAlive;
		this.gender = gender;
	}
	
	public int getid()
	{
		return this.id;
	}
	public void setid(int id)
	{
		this.id = id;
	}
	public int getage()
	{
		return this.age;
	}
	public void setage(int age)
	{
		this.age = age;
	}
	public String getname()
	{
		return this.name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public double getweight()
	{
		return this.weight;
	}
	public void setweight(double weight)
	{
		this.weight =weight;
	}
	public double getheight()
	{
		return this.height;
	}
	public void setheight(double height)
	{
		this.height =height;
	}
	public boolean getisAlive()
	{
		return this.isAlive;
	}
	public void setisAlive(boolean isAlive)
	{
		this.isAlive = isAlive;
	}
	public Gender getgender()
	{
		return this.gender;
	}
	public void setgender(Gender gender)
	{
		this.gender = gender;
	}
	
	public boolean equals(Person1 p)
	{
		if(this.id == p.id && this.age == p.age && this.name == p.name && this.weight == p.weight && this.height == p.height && this.isAlive == p.isAlive && this.gender == p.gender)
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return this.id + " " + this.age + " " + this.name + " " + this.weight + " " + this.height + " " + this.isAlive + " " + this.gender;
	}
}
