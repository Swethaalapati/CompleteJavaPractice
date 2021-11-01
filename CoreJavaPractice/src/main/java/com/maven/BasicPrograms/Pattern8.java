package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern8 {
	
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = s.nextInt();
		for(int i = 0; i < n; i++)
		{
			for(int j = n; j > 0; j--)
			{
				System.out.print(n-i +" ");
			}
			System.out.println( );
		}
	}
}
