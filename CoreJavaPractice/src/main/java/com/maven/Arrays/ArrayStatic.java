package com.maven.Arrays;
import java.util.Scanner;

public class ArrayStatic {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		int i,a1,a2,a3,a4,a5,a6,a7,a8,a9;
		a1 = a2 = a3 = a4 = a5 = a6 = a7 = a8 = a9 = 0;
		System.out.println("enter values");
		int a[] = new int[n];
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
			if(a[i] == 10)
				a1++;
			else if(a[i] == 20)
				a2++;
			else if(a[i] == 30)
				a3++;
			else if(a[i] == 40)
				a4++;
			else if(a[i] == 50)
				a5++;
			else if(a[i] == 60)
				a6++;
			else if(a[i] == 70)
				a7++;
			else if(a[i] == 80)
				a8++;
			else if(a[i] == 90)
				a9++;
			else
				i--;
		}
		if(a1 > 0)
			System.out.println(10 +" occur "+ a1 +" times ");
		if(a2 > 0)
			System.out.println(20 +" occur "+ a2 +" times ");
		if(a3 > 0)
			System.out.println(30 +" occur "+ a3 +" times ");
		if(a4 > 0)
			System.out.println(40 +" occur "+ a4 +" times ");
		if(a5 > 0)
			System.out.println(50 +" occur "+ a5 +" times ");
		if(a6 > 0)
			System.out.println(60 +" occur "+ a6 +" times ");
		if(a7 > 0)
			System.out.println(70 +" occur "+ a7 +" times ");
		if(a8 > 0)
			System.out.println(80 +" occur "+ a8 +" times ");
		if(a9 > 0)
			System.out.println(90 +" occur "+ a9 +" times ");
	}
}
