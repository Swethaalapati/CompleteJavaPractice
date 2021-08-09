package com.maven.Arrays;
import java.util.Scanner;

public class ArrayAdd {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		System.out.println("enter values");
		int a[] = new int[n];
		int i,j,sum = 0,flag = 1;
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("enter number");
		int num = s.nextInt();
		for(i = 0; i < a.length; i++)
		{
			for(j = i + 1; j < a.length; j++)
			{
				sum = a[i] + a[j];
				if(sum == num)
				{
					flag = 0;
					break;
				}
			}
			if(flag == 0)
			{
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("Super Array");
		}
		else
		{
			System.out.println("Not a Super Array");
		}
		
	}
}
