package com.maven.BasicPrograms;
import java.util.Scanner;
public class Pattern1{

     public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n,i,j;
        System.out.println("enter n value");
        n = s.nextInt();
       
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
     }
}
