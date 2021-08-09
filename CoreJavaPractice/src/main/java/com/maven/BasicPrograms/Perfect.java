package com.maven.BasicPrograms;
import java.util.Scanner;
public class Perfect{

     public static void main(String args[]){
        int i,n,count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        n = s.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                count=count+i;
            }
        }
        if(n==count)
        {
            System.out.println("perfect");
        }
        else
        {
            System.out.println("not perfect");
        }
     }
}