package com.maven.BasicPrograms;
import java.util.Scanner;
public class Addition{

     public static void main(String args[]){
        int a,b,c;
        Scanner h = new Scanner(System.in);
        System.out.println("enter a value");
        a = h.nextInt();
        System.out.println("enter b value");
        b = h.nextInt();
        c = a + b;
        System.out.println("addition of two numbers is " +c);
     }
}
