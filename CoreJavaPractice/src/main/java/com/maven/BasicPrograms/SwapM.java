package com.maven.BasicPrograms;
import java.util.Scanner;
public class SwapM {
	public static void main(String args[])
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value");
		a = s.nextInt();
		System.out.println("enter b value");
		b = s.nextInt();
		int swap = Swap(a,b);
		
	}

	public static int Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		return 0;
	}
}
