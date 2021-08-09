package com.maven.BasicPrograms;
import java.util.Scanner;
public class Neon {
	public static void main(String args[])
	{
		int n,rem,a,res = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		a = n * n;
		while(a > 0)
		{
			rem = a % 10;
			res = res + rem;
			a = a / 10;
		}
		System.out.println(res);
		
		if(n == res)
		{
			System.out.println("Neon");
		}
		else
		{
			System.out.println("Not Neon");
		}
	}
}
