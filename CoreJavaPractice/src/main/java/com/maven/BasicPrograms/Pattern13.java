package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern13 {
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		for(int i = 0; i < n; i++)
		{
			for(int j = 1; j < n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
}
