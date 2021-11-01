package com.maven.BasicPrograms;
import java.util.Scanner;

public class PatternRectangle {

     public static void main(String []args) {
    	 
        Scanner s = new Scanner(System.in);
        int h=3,w=5;
        System.out.println("enter n value");
        int n = s.nextInt();
       
        for(int i = 0; i < h; i++)
        {
            for(int j = 0; j < w; j++)
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
