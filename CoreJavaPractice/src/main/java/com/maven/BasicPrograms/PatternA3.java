package com.maven.BasicPrograms;
import java.util.Scanner;
public class PatternA3 {
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		for(i=0;i<n;i++)
		{
			int ascii=65;
			for(j=n;j>=n-i;j--)
			{
				System.out.print((char)ascii);
				ascii++;
			}
			System.out.println();
		}
	}
}