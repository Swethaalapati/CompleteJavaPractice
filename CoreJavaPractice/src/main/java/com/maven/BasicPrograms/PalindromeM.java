package com.maven.BasicPrograms;
import java.util.Scanner;
public class PalindromeM {
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		boolean isPal = Palindrome(n);
		print(isPal);
	}

	static void print(boolean isPal) {
		if(isPal)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}		
	}

	public static boolean Palindrome(int n) {
		int temp = n,rem,rev = 0;
		while(temp > 0)
		{
			rem = temp % 10;
			rev = (rev * 10) + rem;
			temp = temp / 10;
		}
		System.out.println(rev);
		if(rev == n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
