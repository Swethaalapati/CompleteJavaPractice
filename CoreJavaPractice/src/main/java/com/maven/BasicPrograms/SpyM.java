package com.maven.BasicPrograms;
import java.util.Scanner;
public class SpyM {
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		boolean isSpy = Spy(n);
		print(isSpy);
	}

	static void print(boolean isSpy) {
		if(isSpy)
		{
			System.out.println("Spy");
		}
		else
		{
			System.out.println("Not Spy");
		}
	}

	public static boolean Spy(int n) {
		int temp = n,rem,sum = 0,prod = 1;
		while(n > 0)
		{
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println(sum);
		
		while(temp > 0)
		{
			rem = temp % 10;
			prod = prod * rem;
			temp = temp / 10;
		}
		System.out.println(prod);
		if(sum == prod)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
