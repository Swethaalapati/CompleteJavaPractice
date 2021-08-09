package com.maven.Strings;
import java.util.Scanner;

public class Alphabets {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i;
		boolean flag = false;
		System.out.println("enter a String");
		String str = s.nextLine();
		System.out.println("enter alphabets");
		String[] alpha = new String[26];
		for(i = 0; i < alpha.length; i++)
		{
			alpha[i] = s.nextLine();
		}
		if(str.length() >= 26)
		{
			for(i = 0; i < alpha.length; i++)
			{
				if(str.contains(alpha[i]))
				{
					flag = true;
				}
	
				else
				{
					flag = false;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}
}
