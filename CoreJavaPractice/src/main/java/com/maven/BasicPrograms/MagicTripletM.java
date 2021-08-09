package com.maven.BasicPrograms;

public class MagicTripletM {
	public static void main(String args[])
	{
		int a = 3, b = 4, c = 5;
		boolean d = MagicTriplet(a,b,c);
		if(d)
		{
			System.out.println("Magic Triplet");
		}
		else
		{
			System.out.println("Not Magic Triplet");
		}
	}

	public static boolean MagicTriplet(int a, int b, int c) {
		a = a * a;
		b = b * b;
		c = c * c;
		if(a + b == c || a + c == b || b + c == a)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
