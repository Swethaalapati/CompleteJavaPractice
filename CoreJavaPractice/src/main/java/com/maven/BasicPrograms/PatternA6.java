package com.maven.BasicPrograms;
import java.util.Scanner;

public class PatternA6 {
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		int ascii;
		for(int i = 0; i < n; i++)
		{
			for(int j = 1; j < n-i; j++)
			{
				System.out.print(" ");
			}
			ascii = 64+n-i;
			for(int j = n; j >= n-i; j--)
			{
				System.out.print((char)ascii);
				ascii++;
			}
			
			System.out.println();
		}
	}
}
