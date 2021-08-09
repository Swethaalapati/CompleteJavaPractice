package com.maven.Arrays;
import java.util.Scanner;
public class Array1dymc {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter n value" );
		int n = s.nextInt();
		int a[] = new int[n];
		n = a.length;
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
		for(i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}
}