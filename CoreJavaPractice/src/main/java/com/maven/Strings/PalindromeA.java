package com.maven.Strings;
import java.util.Scanner;

public class PalindromeA {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i,j,count = 0;
		String rev = "";
		System.out.println("enter strings");
		String[] str = new String[4];
		for(i = 0; i < str.length; i++)
		{
			str[i] = s.nextLine();
		}
		for(i = 0; i < str.length; i++)
		{
			rev = "";
			int length = str[i].length();
			for(j = length - 1; j >= 0; j--)
			{
				rev = rev + str[i].charAt(j);
			}
			if(str[i].equals(rev))
			{
				System.out.println("Palindrome");
				count++;
			}
			else
			{
				System.out.println("Not Palindrome");
			}
		}
		System.out.println(count);
	}
}
