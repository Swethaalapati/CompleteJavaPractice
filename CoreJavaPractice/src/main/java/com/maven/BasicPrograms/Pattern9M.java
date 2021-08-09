package com.maven.BasicPrograms;
import java.util.Scanner;
public class Pattern9M {
	public static void main(String args[])
	{
	   	 PrintPattern(4);
	   	 PrintPattern(5);
	   	 PrintPattern(6);
	}
	    
	public static void PrintPattern(int n)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=n;j>=n-i;j--)
			{
				System.out.print(i+1 +" ");
			}
			System.out.println();
		}
	}
}
