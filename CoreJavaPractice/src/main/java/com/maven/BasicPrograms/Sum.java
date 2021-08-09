package com.maven.BasicPrograms;
import java.util.Scanner;
public class Sum {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,a,res = 0;
		System.out.println("enter n value");
		n = s.nextInt();
		while(n > 0)
		{
			a = n % 10;
			res = res + a;
			n = n/10;
		}
		System.out.println(res);
	}
}
