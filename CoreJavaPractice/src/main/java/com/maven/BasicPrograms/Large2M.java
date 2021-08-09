package com.maven.BasicPrograms;
import java.util.Scanner;
public class Large2M {
	
	public static void main(String args[])
	{
		int c,d;
		Scanner s = new Scanner(System.in);
		c = Large(4,3);
		d = Large(6,2);
		System.out.println(c +" is large");
		System.out.println(d +" is large");
	}

	public static int Large(int a, int b) {
		int res;
		if(a > b)
		{
			res = a;
		}
		else
		{
			res = b;
		}
		return res;
	}
	
}
