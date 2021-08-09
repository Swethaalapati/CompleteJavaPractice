package com.maven.Arrays;
import java.util.Scanner;

public class ArrayIndex {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		System.out.println("enter values");
		int a[] = new int[n];
		int i,num,count = 0;
		boolean flag = true;
		int b[] = new int[n];
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("enter number");
		num = s.nextInt();
		for(i = 0; i < a.length; i++)
		{
			if(a[i] == num)
			{
				b[count] = i;
				count++;
				flag = true;
			}
		}
		if(flag == true)
		{
			System.out.println(count);
			for( i = 0; i < count; i++)
			{
				System.out.println(b[i]);
			}
		}
	}
}
