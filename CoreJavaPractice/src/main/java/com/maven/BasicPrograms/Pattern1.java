package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern1{

     public static void main(String []args){
    	 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n value");
        
        int n = input.nextInt();
       
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
            	//Print * along with spaces on both sides
                System.out.print(" * ");
            }
            //Printing new line
            System.out.println();
        }
     }
}
