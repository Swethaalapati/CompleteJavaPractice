package com.maven.Arrays;
import java.util.Scanner;

public class Count {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int index = 0,count = 0,i = 0;
		boolean found = false;
		System.out.println("Enter n value" );
		int n = s.nextInt();
		int a[] = new int[n];
		n = a.length;
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Enter key" );
		int key = s.nextInt();
		for(i = 0; i < a.length; i++)
		{
			if(a[i] == key)
			{				
				found = true;		
				count++;
			}
		}
		
		if(found)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("not found");
		}
		
	}
}
