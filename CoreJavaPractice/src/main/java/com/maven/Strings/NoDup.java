package com.maven.Strings;
import java.util.Scanner;

public class NoDup 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Boolean flag = false;
		System.out.println("enter a values");
		String[] a = new String[4];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = s.nextLine();
			
		}
		System.out.println("enter b values");
		String[] b = new String[4];
		
		for(int j = 0; j < b.length; j++)
		{
			b[j] = s.nextLine();
		}
		for(int i = 0; i < a.length; i++)
		{
				flag = false;
				for(int j = i + 1; j < a.length; j++)
				{
					if(a[i].equals(a[j]))
					{
						flag = true;
						break;
					}
				}
				
				for(int j = 0; j < b.length; j++)
				{
					if(a[i].equals(b[j]))
					{
						flag = true;
						break;
					}
				}
				if(!flag)
				{
					System.out.println(a[i]);
				}
		}
		for(int i = 0; i < b.length; i++)
		{
			
				flag = false;
				for(int j = i + 1; j < b.length; j++)
				{
					if(b[i].equals(b[j]))
					{
						flag = true;
						break;
					}
				}
				if(!flag)
				{
					System.out.println(b[i]);
				}
		}		
	}
}
