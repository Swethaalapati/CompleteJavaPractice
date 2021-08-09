package com.maven.BasicPrograms;
import java.util.Scanner;
public class PatternP4 {
	public static void main(String args[])
	{
		int i,j,n,num=-1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		for(i=1;i<=n;i++)
		{
			num = num+2;
			for(j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<i+(i-1);j++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
