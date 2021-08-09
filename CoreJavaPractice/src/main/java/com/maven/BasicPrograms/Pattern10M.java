package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern10M {
	public static void main(String args[])
	{
		PrintPattern(4);
		PrintPattern(5);
		PrintPattern(6);
	}
		private static void PrintPattern(int n) 
		{
			int i,j;
			for(i=0;i<n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(j +" ");
				}
				System.out.println();
			}
		}
}
