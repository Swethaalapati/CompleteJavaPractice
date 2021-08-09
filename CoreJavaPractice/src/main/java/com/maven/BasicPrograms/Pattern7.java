package com.maven.BasicPrograms;
import java.util.Scanner;
public class Pattern7 {
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s = new Scanner(System.in);
		System.out.print("enter n value");
		n = s.nextInt();
		for(i=0;i<n;i++)
		{
			for (j=0;j<n;j++)
			{
				System.out.print(j+1 +" ");
			}
			System.out.println( );
		}
	}
}
