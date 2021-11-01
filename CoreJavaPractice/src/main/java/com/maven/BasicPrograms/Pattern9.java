package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern9 {
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		for(int i = 0; i < n; i++)
		{
			for(int j = n; j >= n-i; j--)
			{
				System.out.print(i+1 +" ");
			}
			System.out.println();
		}
	}
}
