package com.maven.BasicPrograms;
import java.util.Scanner;
public class PositiveNegative{

     public static void main(String args[]){
        boolean flag=false;
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        n = s.nextInt();
        if(n>=0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("negative");
        }
     }
}
