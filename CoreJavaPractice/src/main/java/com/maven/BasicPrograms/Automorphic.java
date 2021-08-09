package com.maven.BasicPrograms;
import java.util.Scanner;
public class Automorphic {
	public static void main(String args[])
	{
		int n,rem,rev = 0,count = 0,rerev = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		int temp = n;
		while(temp > 0)
		{	
			count++;
			temp = temp/10;
		}
		temp = n * n;
		for(int i = 0;i < count; i++)
		{
			rem = temp % 10;
			rev = (rev * 10)+rem;
			temp = temp/10;
		}
		while(rev > 0)
		{
			rem = rev % 10;
			rerev = (rerev * 10) + rem;
			rev = rev / 10;
		}
		if(rerev == n)
		{
			System.out.println("Automorphic");
		}
		else
		{
			System.out.println("Not Automorphic");
		}
	}
}
