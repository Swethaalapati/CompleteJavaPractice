package com.maven.Strings;
import java.util.Scanner;

public class Vowels {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int count = 0;
		System.out.println("enter a string");
		String str = s.nextLine();
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
