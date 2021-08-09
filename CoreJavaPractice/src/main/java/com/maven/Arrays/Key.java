package com.maven.Arrays;
import java.util.Scanner;

public class Key {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i;
		boolean found = false;
		System.out.println("enter n value");
		int n = s.nextInt();
		System.out.println("enter Values");
		int a[] = new int[n];
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("enter key");
		int key = s.nextInt();
		for(i = 0; i < a.length; i++)
		{
			if(a[i] == key)
			{
				found = true;
			}
		}
		if(found == true)
		{
			System.out.println("key found");
		}
		else
		{
			System.out.println("key not found");
		}
	}
}
