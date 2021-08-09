package com.maven.BasicPrograms;
import java.util.Scanner;
public class Happy {
	public static void main(String args[])
	{
		int n,rem,res = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		
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
		System.out.println(n);
		
		if(n == 1)
		{
			System.out.println("Happy");
		}
		else
		{
			System.out.println("Not Happy");
		}
	}
}