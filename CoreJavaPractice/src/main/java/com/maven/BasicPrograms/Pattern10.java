package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern10 {
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
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
