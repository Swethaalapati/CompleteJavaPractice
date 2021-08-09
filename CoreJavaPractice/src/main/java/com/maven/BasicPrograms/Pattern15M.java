package com.maven.BasicPrograms;

public class Pattern15M {
	public static void main(String args[])
	{
		PrintPattern(4);
		PrintPattern(5);
		PrintPattern(6);
	}
		public static void PrintPattern(int n) {
			int i,j;
			for(i=n;i>0;i--)
			{
				for(j=0;j<n-i;j++)
				{
					System.out.print(" ");
				}
				for(j=0;j<i;j++)
				{
					System.out.print(i-j);
				}
				System.out.println();
			}
	}
}
