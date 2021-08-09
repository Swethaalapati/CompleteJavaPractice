package com.maven.Arrays;
import java.util.Scanner;

public class FirstIndex {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int index = 0,i = 0;
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
				index = i;
				found = true;
				break;
			}
		}
		
		if(found)
		{
			System.out.println(index);
		}
		else
		{
			System.out.println("not found");
		}
		
	}
}
