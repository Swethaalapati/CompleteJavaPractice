package com.maven.BasicPrograms;
import java.util.Scanner;
public class PrimeM{

     public static void main(String args[]){
        
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        n = s.nextInt();
        boolean isPrime = Prime(n);
        print(isPrime);
     }

	static void print(boolean isPrime) {
		 if(isPrime)
	        {
	            System.out.println("Not Prime");
	        }
	        else
	        {
	            System.out.println("Prime");
	        }
		
	}

	private static boolean Prime(int n) {
		int i;
		boolean flag=false;
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
            return true;
        }
        else
        {
        	return false;
        }
		
	}
}
