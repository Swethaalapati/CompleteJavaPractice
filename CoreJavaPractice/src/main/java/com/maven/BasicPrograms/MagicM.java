package com.maven.BasicPrograms;
import java.util.Scanner;
public class MagicM {
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		boolean isMagic = Magic(n);
		print(isMagic);
	}
	static void print(boolean isMagic) {
		if(isMagic)
		{
			System.out.println("Magic");
		}
		else
		{
			System.out.println("Not Magic");
		}
	}
	public static boolean Magic(int n) {
		int rem, sum = 0;
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
		if(n == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}