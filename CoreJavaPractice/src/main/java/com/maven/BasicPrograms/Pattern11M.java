package com.maven.BasicPrograms;

public class Pattern11M {
	public static void main(String args[])
	{
		PrintPattern(4);
		PrintPattern(5);
		PrintPattern(6);
	}
		public static void PrintPattern(int n) {
			int i,j;
			for(i=1;i<n+1;i++)
			{
				for(j=0;j<=n-i;j++)
				{
					System.out.print(i +"");
				}
				System.out.println();
			}
	}
}
