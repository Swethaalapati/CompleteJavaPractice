package com.maven.BasicPrograms;
import java.util.Scanner;
public class MultiplyM{

	static int multiply(int a, int b)
	{
		int c;
		return c = a * b;
	}
     public static void main(String args[]){
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a value");
        a = s.nextInt();
        System.out.println("enter b value");
        b = s.nextInt();
        c = multiply(a,b);
        System.out.println("Multiplication of two numbers is " +c);
     }
}
