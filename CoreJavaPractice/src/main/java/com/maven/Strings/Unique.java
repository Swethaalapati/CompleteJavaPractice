package com.maven.Strings;
import java.util.Scanner;

public class Unique {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i,j;
		
		System.out.println("enter a values");
		String[] a = new String[4];
		
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextLine();
			
		}
		System.out.println("enter b values");
		String[] b = new String[4];
		
		for(j = 0; j < b.length; j++)
		{
			b[j] = s.nextLine();
		}
		
		for(i = 0; i < a.length; i++)
		{
			Boolean flag = false;
			for(j = 0; j < b.length; j++)
			{
				if(a[i].equals(b[j]))
				{
					flag = true;
					break;
				}
			}
			if(flag.equals(false))
			{
				System.out.println(a[i]);
			}
		}
		for(j = 0; j < b.length; j++)
		
		{
			Boolean flag = false;
			for(i = 0; i < a.length; i++)
			{
				if(b[j].equals(a[i]))
				{
					flag = true;
					break;
				}
			}
			if(flag.equals(false))
			{
				System.out.println(b[j]);
			}
		}
	}
}
