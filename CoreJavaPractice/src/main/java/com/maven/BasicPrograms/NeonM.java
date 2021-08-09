package com.maven.BasicPrograms;
import java.util.Scanner;
import java.util.Scanner;
public class NeonM {
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		n = s.nextInt();
		boolean isNeon = Neon(n);
		print(isNeon);
		
	}
	 static void print(boolean isNeon) {
		 if(isNeon)
			{
				System.out.println("Neon");
			}
			else
			{
				System.out.println("Not Neon");
			}	
	}
	 
	public static boolean Neon(int n) {
		int rem,sqr,res = 0;
		sqr = n * n;
		while(sqr > 0)
		{
			rem = sqr % 10;
			res = res + rem;
			sqr = sqr / 10;
		}
		if(res == n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}