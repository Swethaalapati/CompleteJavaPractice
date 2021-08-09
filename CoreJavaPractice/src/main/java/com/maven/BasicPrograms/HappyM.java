package com.maven.BasicPrograms;
import java.util.Scanner;
public class HappyM {
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		boolean c = Happy(n);
		if(c)
		{
			System.out.println("Happy");
		}
		else
		{
			System.out.println("Not Happy");
		}
	}

	public static boolean Happy(int n) {
		int rem,res = 0;
		while(n > 9)
		{
			while(n > 0)
			{
				rem = n % 10;
				res = res + (rem*rem);
				n = n / 10;
			}
			n = res;
			res = 0;
		}
		if(n == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}