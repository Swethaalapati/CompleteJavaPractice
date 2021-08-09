package com.maven.Strings;
import java.util.Scanner;

public class Similar {
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
			for(j = 0; j < b.length; j++)
			{
				if(a[i].equals(b[j]))
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
