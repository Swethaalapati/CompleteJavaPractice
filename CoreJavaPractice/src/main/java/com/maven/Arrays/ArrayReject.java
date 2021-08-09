package com.maven.Arrays;
import java.util.Scanner;

public class ArrayReject {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		System.out.println("enter values");
		int a[] = new int[n];
		int i;
		n = a.length;
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
			if(a[i] == 22)
			{
				i = i - 1;
			}
		}
		for(i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
