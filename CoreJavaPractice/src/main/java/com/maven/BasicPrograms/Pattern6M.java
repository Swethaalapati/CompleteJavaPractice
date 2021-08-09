package com.maven.BasicPrograms;

public class Pattern6M {
	public static void main(String args[]) {
		PrintPattern(4);
	   	PrintPattern(5);
	    PrintPattern(6);
	}
	private static void PrintPattern(int n) {
		int i,j;
		for(i=0;i<n;i++) 
		{
			for(j=0;j<n;j++) 
			{
				System.out.print(i+1 +" ");   //if i=1 then can print s.o.p(i);
			}
			System.out.println( );
		}
	}
}
