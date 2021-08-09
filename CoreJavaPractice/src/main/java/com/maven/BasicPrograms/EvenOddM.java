package com.maven.BasicPrograms;
import java.util.Scanner;
public class EvenOddM {
	 public static void main(String args[])
	 {
	        int n;
	        Scanner s = new Scanner(System.in);
	        System.out.println("enter n value");
	        n = s.nextInt();
	        int num = EvenOdd(n);
	       
	     }

	public static int EvenOdd(int n) {
		 if(n % 2==0)
	        {
	           System.out.println("even");
	        }
	        else
	        {
	            System.out.println("odd");
	        }
		return 0;
	}
}
