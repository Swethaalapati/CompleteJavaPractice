package com.maven.BasicPrograms;
import java.util.Scanner;
public class Swap {
	public static void main(String args[])
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value");
		a = s.nextInt();
		System.out.println("enter b value");
		b = s.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		
	}
}
