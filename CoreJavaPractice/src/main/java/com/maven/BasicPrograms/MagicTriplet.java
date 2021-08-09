package com.maven.BasicPrograms;

public class MagicTriplet {
	public static void main(String args[])
	{
		int a = 3, b = 4, c = 5;
		a = a * a;
		b = b * b;
		c = c * c;
		if(a + b == c || a + c == b || b + c == a)
		{
			System.out.println("Magic Triplet");
		}
		else
		{
			System.out.println("Not Magic Triplet");
		}
	}
}
