package com.maven.BasicPrograms;
import java.util.Scanner;
public class ReverseM{

     public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        n = s.nextInt();
        int reverse = Reverse(n);
        
     }

	public static int Reverse(int n) {
		int rev=0,rem;
		while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println("reverse is " +rev);
		return 0;
	}
}
