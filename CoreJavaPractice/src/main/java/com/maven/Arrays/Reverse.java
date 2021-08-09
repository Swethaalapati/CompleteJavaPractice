package com.maven.Arrays;
import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i;
		System.out.println("enter n value");
		int n = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		n = a.length;
		System.out.println("enter values");
		for(i = 0;i < a.length;i++)
		{
			a[i] = s.nextInt();
		}
		for(i = 0;i < a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(i = 0;i < a.length;i++)
		{
			b[i] = a[a.length-1-i];
		}
		for(i = 0;i < a.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
