package com.maven.BasicPrograms;
import java.util.Scanner;
public class Calculator {
	public static void main(String args[])
	{
		int option,a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value");
		a = s.nextInt();
		System.out.println("enter b value");
		b = s.nextInt();
		do
		{
			System.out.println("enter option");
			option = s.nextInt();
			if(option == 1)
			{
				System.out.println(a+b);
			}
			if(option == 2)
			{
				System.out.println(a-b);
			}
			if(option == 3)
			{
				System.out.println(a*b);
			}
			if(option == 4)
			{
				System.out.println(a/b);
			}
			if(option == 5)
			{
				System.out.println(a%b);
			}
			
		}while(option > 5);
	}
}
