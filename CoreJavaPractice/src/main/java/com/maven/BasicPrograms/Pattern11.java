package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern11 {
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
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
