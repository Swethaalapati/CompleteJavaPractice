package com.maven.BasicPrograms;
import java.util.Scanner;
public class Reverse{

     public static void main(String args[]){
    	 
    	 
        int rev=0,rem;
        
        int n = 3655;
        int temp = n;
        
        while(n>0)
        {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
            
            System.out.println("rem = " + rem + " rev = " + rev + " n = " + n);
        }
        
        if(rev == temp) {
        	
        }
        System.out.println("reverse is " +rev);
     }
}
