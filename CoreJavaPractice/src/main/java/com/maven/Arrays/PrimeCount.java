package com.maven.Arrays;
import java.util.Scanner;
public class PrimeCount{

     public static void main(String args[]){
        
        int i,j;
        Scanner s = new Scanner(System.in);
        int count = 0;
		boolean found = false;
		System.out.println("Enter n value" );
		int n = s.nextInt();
		int a[] = new int[n];
		n = a.length;
		for(i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
		
		for(i = 0; i < a.length; i++)
		{
			boolean flag=false;
				for(j = 2; j <= a[i]/2; j++)
				{
					if(a[i] % j == 0)
					{
						flag=true;
						break;
					}	
				}
				if(flag == false)
				{
					count++;
				}
		}
		System.out.println(count);
	}
}
