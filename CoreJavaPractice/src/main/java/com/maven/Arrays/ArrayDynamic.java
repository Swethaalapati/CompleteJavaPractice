package com.maven.Arrays;
import java.util.Scanner;

public class ArrayDynamic {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		System.out.println("enter values");
		int a[] = new int[n];
		int i,j,count = 0;
		int num[] = new int[n];
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
			
		}
		for(i = 0; i < a.length; i++)
		{
			count = 1;
			if(a[i] != -1)
			{
				for(j = i+1; j < a.length; j++)
				{
					if(a[i] == a[j])
					{
						++count;
						a[j] = -1;
					}
				}
				num[i] = count;
			}
		}
		for( i = 0; i < a.length; i++)
		{
			if(a[i] != -1)
			{
				System.out.println(a[i] +" occur "+ num[i] +" times ");
			}
		}
	}
}
