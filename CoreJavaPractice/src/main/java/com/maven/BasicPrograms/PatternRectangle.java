package com.maven.BasicPrograms;
import java.util.Scanner;
public class PatternRectangle{

     public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n,i,j,h=3,w=5;
        System.out.println("enter n value");
        n = s.nextInt();
       
        for(i=0;i<h;i++)
        {
            for(j=0;j<w;j++)
            {
                if(i==0 || j==0 || i==(h-1) || j==(w-1))
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
     }
}
