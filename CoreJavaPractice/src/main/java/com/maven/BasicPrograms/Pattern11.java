package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern11 {
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		for(int i = 1; i < n+1; i++)
		{
			for(int j = 0; j <= n-i; j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
}
