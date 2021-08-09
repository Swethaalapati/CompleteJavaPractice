package com.maven.BasicPrograms;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
		int n,rem,rev = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		int temp = n;
		while(temp > 0)
		{
			rem = temp % 10;
			rev = (rev * 10) + rem;
			temp = temp / 10;
		}
		System.out.println(rev);
		if(rev == n)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
