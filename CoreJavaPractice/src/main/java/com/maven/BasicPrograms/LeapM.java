package com.maven.BasicPrograms;
import java.util.Scanner;
public class LeapM {
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		int LeapM = Leap(n);
		
	}

	public static int Leap(int n) {
		if(n % 4 == 0 && n % 400 == 0 || n % 100 != 0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
		return 0;
	}
}
