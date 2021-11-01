package com.maven.BasicPrograms;
import java.util.Scanner;

public class PatternA2 {
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		int ascii = 65;
		for(int i = 0; i < n; i++)
		{
			
			for(int j = 0; j < n; j++)
			{
				System.out.print((char)ascii);
			}
			ascii++;
			System.out.println();
		}
	}
}
