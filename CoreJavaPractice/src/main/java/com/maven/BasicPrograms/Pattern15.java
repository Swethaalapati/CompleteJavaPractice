package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern15 {
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		for(int i = n; i > 0; i--)
		{
			for(int j = 0; j < n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++)
			{
				System.out.print(i-j);
			}
			System.out.println();
		}
	}
}
