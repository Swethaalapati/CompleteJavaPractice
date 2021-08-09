package com.maven.BasicPrograms;
import java.util.Scanner;
public class Large2 {
	
	public static void main(String args[])
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value");
		a = s.nextInt();
		System.out.println("enter b value");
		b = s.nextInt();
		if(a > b)
		{
			System.out.println("a is Large");
		}
		else
		{
			System.out.println("b is Large");
		}
	}
}
