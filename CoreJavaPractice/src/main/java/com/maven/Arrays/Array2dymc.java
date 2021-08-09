package com.maven.Arrays;
import java.util.Scanner;

public class Array2dymc {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i,j;
		System.out.println("enter i value");
		i = s.nextInt();
		System.out.println("enter j value");
		j = s.nextInt();
		int a[][] = new int[i][j];
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[i].length; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[i].length; j++)
			{
				System.out.println(a[i][j]);
			}
		}
	}
}
