package com.maven.Arrays;
import java.util.Scanner;

public class Reverse2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter i value");
		int i = s.nextInt();
		System.out.println("enter j value");
		int j = s.nextInt();
		System.out.println("enter values");
		int a[][] = new int[i][j];
		int b[][] = new int[i][j];
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[0].length; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[0].length; j++)
			{
				b[i][j] = a[a.length-1-i][a[0].length-1-j];
			}
		}
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[0].length; j++)
			{
				System.out.println(b[i][j]);
			}
		}
		
	}
}
