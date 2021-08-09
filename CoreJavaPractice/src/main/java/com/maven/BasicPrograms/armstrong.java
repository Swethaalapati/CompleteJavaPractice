package com.maven.BasicPrograms;
import java.util.Scanner;
public class armstrong {
	public static void main(String args[])
	{
		int n,rem,a,res = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		int temp = n;
		while(temp>0)
		{
			rem = temp%10;
			a = rem*rem*rem;
			res = res + a;
			temp = temp/10;
		}
		System.out.println(res);
		if(n == res)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}
