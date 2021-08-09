package com.maven.Arrays;
import java.util.Scanner;

public class Key2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		boolean found = false;
		System.out.println("enter i Value");
		int i = s.nextInt();
		System.out.println("enter j Value");
		int j = s.nextInt();
		int a[][] = new int[i][j];
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[i].length; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("enter key");
		int key = s.nextInt();
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[i].length; j++)
			{
				if(a[i][j] == key)
				{
					found = true;
				}
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
