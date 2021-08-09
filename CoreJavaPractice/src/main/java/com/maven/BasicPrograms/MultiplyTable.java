package com.maven.BasicPrograms;
import java.util.Scanner;
public class MultiplyTable{

     public static void main(String args[])
     {
        int i,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        n = s.nextInt();
        for(i=0;i<=10;i++)
        {
            System.out.println(n+ " * " +i+  " = " +(n*i));
        }
           
     }
}
