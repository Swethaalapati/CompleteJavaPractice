package com.maven.BasicPrograms;
import java.util.Scanner;
public class PositiveNegativeM{

     public static void main(String args[]){
        boolean flag=false;
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value");
        n = s.nextInt();
        int num = PositiveNegative(n);
        
     }

	public static int PositiveNegative(int n) {
		if(n>=0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("negative");
        }
		return 0;
	}
}
