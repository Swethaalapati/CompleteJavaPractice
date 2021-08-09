package com.maven.Arrays;
import java.util.Scanner;

public class Max {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int max = 0,i;
		System.out.println("Enter n value" );
		int n = s.nextInt();
		System.out.println("Enter values" );
		int a[] = new int[n];
		n = a.length;
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
			for(i = 0; i < a.length; i++)
			{
				
				if(a[i] > max)
				{
					max = a[i];
				}
			}
			System.out.println(max);
	}
}
