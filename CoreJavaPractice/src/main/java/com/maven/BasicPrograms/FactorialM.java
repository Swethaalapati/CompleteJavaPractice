package com.maven.BasicPrograms;
import java.util.Scanner;
public class FactorialM {
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		int FactM = Fact(n);
		
	}

	public static int Fact(int n) {
		long i,result = 1;
		for(i=n;i>0;i--)
		{
			result = result*i;
		}
		System.out.print(result);
		return 0;
	}
}
