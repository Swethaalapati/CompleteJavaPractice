package com.maven.BasicPrograms;
import java.util.Scanner;
public class MultiplyTableM{

     public static void main(String args[])
     {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        n = s.nextInt();
        int MulT = MultiplyTable(n);     
     }

	public static int MultiplyTable(int n) {
		 int i,res;
		for(i=0;i<=10;i++)
		 {
			System.out.println(n+ " * " +i+  " = " +(n*i));
		 }
		return 0;
	}
}
