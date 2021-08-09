package com.maven.BasicPrograms;
import java.util.Scanner;
public class Spy {
	public static void main(String args[])
	{
		int n,rem,res = 0,res1 = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		int temp = n;
		while(n > 0)
		{
			rem = n % 10;
			res = res + rem;
			n = n / 10;
		}
		System.out.println(res);
		
		while(temp > 0)
		{
			rem = temp % 10;
			res1 = res1 * rem;
			temp = temp / 10;
		}
		System.out.println(res1);
		if(res == res1)
		{
			System.out.println("Spy");
		}
		else
		{
			System.out.println("Not Spy");
		}
	}
}
