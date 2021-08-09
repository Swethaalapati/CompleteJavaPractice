package com.maven.BasicPrograms;
import java.util.Scanner;
public class SumM {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("enter n value");
		n = s.nextInt();
		int sum = Sum(n);
		
	}

	public static int Sum(int n) {
		int a,res = 0;
		while(n > 0)
		{
			a = n % 10;
			res = res + a;
			n = n/10;
		}
		System.out.println(res);
		return 0;
	}
}
