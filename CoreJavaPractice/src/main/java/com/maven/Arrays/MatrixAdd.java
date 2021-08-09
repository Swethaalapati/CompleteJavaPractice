package com.maven.Arrays;
import java.util.Scanner;

public class MatrixAdd {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter i value");
		int i = s.nextInt();
		System.out.println("enter j value");
		int j = s.nextInt();
		System.out.println("enter a values");
		int a[][] = new int[i][j];
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[0].length; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("enter b values");
		int b[][] = new int[i][j];
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[0].length; j++)
			{
				b[i][j] = s.nextInt();
			}
		}
		int c[][] = new int[i][j];
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[0].length; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[0].length; j++)
			{
				System.out.println(c[i][j]);
			}
		}
		
	}
}
