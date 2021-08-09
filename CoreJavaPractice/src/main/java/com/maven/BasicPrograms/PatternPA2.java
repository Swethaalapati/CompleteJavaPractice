package com.maven.BasicPrograms;
import java.util.Scanner;

public class PatternPA2 {
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		int ascii=65;
		for(i=1;i<=n;i++)
		{
			if(i!=1)
			{
				ascii=ascii+2;
			}
			
			for(j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(j=0;j<i+(i-1);j++)
			{
				System.out.print((char)ascii);
				
			}
			
			System.out.println();
		}
	}
}
