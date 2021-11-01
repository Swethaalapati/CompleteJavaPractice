package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern2{

     public static void main(String []args){
    	 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = input.nextInt();
       
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
            	//Print * along with spaces on both sides
                System.out.print(" * ");
            }
            //printing new line
            System.out.println();
        }
     }
}
