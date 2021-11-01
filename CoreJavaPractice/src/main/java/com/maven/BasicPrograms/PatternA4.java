package com.maven.BasicPrograms;
import java.util.Scanner;

public class PatternA4 {
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		int ascii;
		for(int i = 0; i < n; i++)
		{
			ascii = 64+n-i;
			for(int j = 0; j < i; j++)
			{
				System.out.print(" ");
				
			}
			
			for(int j = 0; j < n-i; j++)
			{
				
				System.out.print((char)ascii);
				ascii--;
			}
			
			System.out.println();
		}
	}
}
