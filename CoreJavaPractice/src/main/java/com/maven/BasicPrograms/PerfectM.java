package com.maven.BasicPrograms;
import java.util.Scanner;
public class PerfectM{

     public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        n = s.nextInt();
        boolean isPerfect = Perfect(n);
        print(isPerfect);
     }

	static void print(boolean isPerfect) {
		if(isPerfect)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Not Perfect");
		}
		
	}

	private static boolean Perfect(int n) {
		int i,count = 0; 
		for(i=1;i<n;i++)
	        {
	            if(n%i==0)
	            {
	                count=count+i;
	            }
	        }
	        if(n==count)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	}
}