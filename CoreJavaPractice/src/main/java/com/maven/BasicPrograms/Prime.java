package com.maven.BasicPrograms;
import java.util.Scanner;
public class Prime{

     public static void main(String args[]){
        boolean flag=false;
        int i,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        n = s.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
     }
}
