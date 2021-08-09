package com.maven.BasicPrograms;

public class Pattern8M {
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
				for(j=n;j>0;j--)
				{
					System.out.print(n-i +" ");
				}
				System.out.println( );
			}
		}
}	