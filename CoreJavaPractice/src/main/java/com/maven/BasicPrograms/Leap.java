package com.maven.BasicPrograms;
import java.util.Scanner;
public class Leap {
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		if(n % 4 == 0 && n % 400 == 0 || n % 100 != 0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}
}
