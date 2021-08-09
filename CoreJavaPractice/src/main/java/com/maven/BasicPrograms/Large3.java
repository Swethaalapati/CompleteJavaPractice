package com.maven.BasicPrograms;
import java.util.Scanner;
public class Large3 {
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value");
		a = s.nextInt();
		System.out.println("enter b value");
		b = s.nextInt();
		System.out.println("enter c value");
		c = s.nextInt();
		if(a > b && a > c)
		{
			System.out.println("a is Large");
		}
		else if(b > a && b > c)
		{
			System.out.println("b is Large");
		}
		else
		{
			System.out.println("c is Large");
		}
	}
}
