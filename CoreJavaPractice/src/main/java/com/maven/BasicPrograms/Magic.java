package com.maven.BasicPrograms;
import java.util.Scanner;
public class Magic {
	public static void main(String args[])
	{
		int n,rem = 0,sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		while(n > 9)
		{
			while(n > 0)
			{
				rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			n = sum;
			sum = 0;
		}
			System.out.println(n);
			if(n == 1)
			{
				System.out.println("Magic");
			}
			else
			{
				System.out.println("Not Magic");
			}
		
	}
}
