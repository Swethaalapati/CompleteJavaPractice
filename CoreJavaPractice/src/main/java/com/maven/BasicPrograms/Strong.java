package com.maven.BasicPrograms;
import java.util.Scanner;
public class Strong {
	public static void main(String args[])
	{
		int n,rem,res = 0,i,fact;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		int temp = n;
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
			System.out.println("Strong");
		}
		else
		{
			System.out.println("Not Strong");
		}
	}
}
