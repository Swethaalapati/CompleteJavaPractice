package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern14 {
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j > i; j++)
			{
				System.out.print(" ");
			}
			for(int j = n; j >= n-i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
