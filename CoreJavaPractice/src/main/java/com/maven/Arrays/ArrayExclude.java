package com.maven.Arrays;
import java.util.Scanner;

public class ArrayExclude {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		System.out.println("Enter values");
		int a[] = new int[n];
		int i;
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
			if(a[i] == 22)
			{
				n = i;
				break;
			}
		}
		for(i = 0; i < n; i++)
		{
			System.out.println(a[i]);
		}
	}
}
