package com.maven.BasicPrograms;
import java.util.Scanner;
public class AdditionM{

	 static int add(int a, int b)
     {
		 int c;
    	 return c = a+b;
     }
     public static void main(String args[])
     {
       
        Scanner s = new Scanner(System.in);
        System.out.println("enter a value");
        int a = s.nextInt();
        System.out.println("enter b value");
        int b = s.nextInt();
        int c = add(a, b);
        System.out.println("addition of two numbers is " +c);
     }
    
       
     
}

