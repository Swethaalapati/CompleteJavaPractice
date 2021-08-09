package com.maven.BasicPrograms;
import java.util.Scanner;
public class Large3M {
	
	public static void main(String args[])
	{
		int d,e,f;
		Scanner s = new Scanner(System.in);
		d = Large(4,3,6);
		e = Large(6,9,2);
		f = Large(8,4,2);
		System.out.println(d +" is large");
		System.out.println(e +" is large");
		System.out.println(f +" is large");
	}

	public static int Large(int a, int b, int c) {
		int res;
		if(a > b && a > c)
		{
			res = a;
		}
		else if(b > c && b > a)
		{
			res = b;
		}
		else
		{
			res = c;
		}
		return res;
	}	
}
