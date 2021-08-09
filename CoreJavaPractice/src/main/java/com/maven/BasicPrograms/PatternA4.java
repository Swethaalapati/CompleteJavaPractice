package com.maven.BasicPrograms;
import java.util.Scanner;
public class PatternA4 {
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		int ascii;
		for(i=0;i<n;i++)
		{
			ascii=64+n-i;
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
				
			}
			
			for(j=0;j<n-i;j++)
			{
				
				System.out.print((char)ascii);
				ascii--;
			}
			
			System.out.println();
		}
	}
}
