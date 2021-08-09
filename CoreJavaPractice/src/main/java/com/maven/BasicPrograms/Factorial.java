package com.maven.BasicPrograms;
import java.util.Scanner;
public class Factorial {
	public static void main(String args[])
	{
		int n;
		long i,result = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		for(i=n;i>0;i--)
		{
			result = result*i;
		}
		System.out.print(result);
	}
}
