package com.maven.Oops.Collections;

public class Hall {
	private int width;
	private int length;
	private Boolean isDinning;
	
	public Hall(int width, int length, Boolean isDinning)
	{
		this.width = width;
		this.length = length;
		this.isDinning = isDinning;
		
	}
	public Boolean getisDinning()
	{
		return this.isDinning;
	}
	public void setisDinning(Boolean isDinning)
	{
		this.isDinning = isDinning;
	}
	public boolean equals(Hall h)
	{
		if(!(this.width == h.width && this.length == h.length && this.isDinning == h.isDinning))
		{
			return false;
		}
		return true;
	}
	public String toString()
	{
		return this.width + " " + this.length + " " + this.isDinning;
	}
}
