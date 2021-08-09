package com.maven.BasicPrograms;
import java.util.Scanner;
public class PrimeRange {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i,j,n;
		boolean flag = false;
		System.out.println("enter n value");
		n = s.nextInt();
		for(i=2;i<=n;i++)
		{ 
			flag = false;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(flag!=true)
			{
				System.out.println(i);
			}
		}
	}
}
