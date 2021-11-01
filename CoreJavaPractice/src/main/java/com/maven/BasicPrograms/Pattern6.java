package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern6 {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i < n; i++) 
		{
			for(int j = 0; j < n; j++) 
			{
				System.out.print(i+1 +" ");   //if i=1 then can print s.o.p(i);
			}
			System.out.println( );
		}
	}
}
