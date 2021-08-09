package com.maven.BasicPrograms;
import java.util.Scanner;
public class Pattern8 {
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value");
		n = s.nextInt();
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
