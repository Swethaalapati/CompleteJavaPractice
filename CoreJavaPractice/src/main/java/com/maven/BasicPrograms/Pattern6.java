package com.maven.BasicPrograms;
import java.util.Scanner;
public class Pattern6 {
	public static void main(String args[]) {
		int n,i,j;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(i+1 +" ");   //if i=1 then can print s.o.p(i);
			}
			System.out.println( );
		}
	}
}
