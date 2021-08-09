package com.maven.Arrays;
import java.util.Scanner;

public class FirstIndex2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int index = 0, index1 = 0;
		boolean found = false;
		System.out.println("enter i value");
		int i = s.nextInt();
		System.out.println("enter j value");
		int j = s.nextInt();
		System.out.println("enter values");
		int a[][] = new int[i][j];
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[0].length; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("enter key");
		int key = s.nextInt();
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[0].length; j++)
			{
				if(a[i][j] == key)
				{
					index = i;
					index1 = j;
					found = true;
				}
			}
			break;
		}
		if(found)
		{
			System.out.println(index +"," +index1);
		}
		else
		{
			System.out.println("not found");
		}
	}
}
