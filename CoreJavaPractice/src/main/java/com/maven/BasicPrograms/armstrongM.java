package com.maven.BasicPrograms;
import java.util.Scanner;
public class armstrongM {
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		boolean isArm = armstrong(n);
		print(isArm);
		
	}

	static void print(boolean isArm) {
		if(isArm)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
		
	}

	private static boolean armstrong(int n) {
		int temp = n,a,rem,res = 0;
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
			return true;
		}
		else
		{
			return false;
		}
		
	}
}