package com.maven.BasicPrograms;
import java.util.Scanner;
public class Pattern14 {
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j>i;j++)
			{
				System.out.print(" ");
			}
			for(j=n;j>=n-i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
