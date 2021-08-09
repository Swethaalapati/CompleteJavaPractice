package com.maven.BasicPrograms;
import java.util.Scanner;
public class StrongM {
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		boolean str = Strong(n);	
		print(str);
	}

	private static void print(boolean str) {
		if(str)
		{
			System.out.println("Strong");
		}
		else
		{
			System.out.println("Not Strong");
		}
	}

	public static boolean Strong(int n) {
		int temp = n,rem,res = 0,i,fact;
		while(temp>0)
		{
			fact = 1;
			rem = temp%10;
			for(i=1;i<=rem;i++)
			{
				fact = fact * i;
			}
			res = res + fact;
			temp = temp/10;
		}
		System.out.println(res);
		if(n == res)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
