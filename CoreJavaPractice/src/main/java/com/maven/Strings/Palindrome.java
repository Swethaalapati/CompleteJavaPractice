package com.maven.Strings;
import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str,rev = "";
		int i;
		System.out.println("enter string");
		str = s.nextLine();
		int length = str.length();
		for(i = length - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
