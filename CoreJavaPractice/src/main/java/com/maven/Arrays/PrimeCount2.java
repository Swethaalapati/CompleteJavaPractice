package com.maven.Arrays;
import java.util.Scanner;
public class PrimeCount2{

     public static void main(String args[])
     {
        Scanner s = new Scanner(System.in);
        System.out.println("enter i value");
        int i = s.nextInt();
        System.out.println("enter j value");
        int j = s.nextInt();
        int count = 0;
		boolean found = false;
		System.out.println("enter values" );
		int a[][] = new int[i][j];
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[0].length; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		for(i = 0; i < a.length; i++)
		{
			for(j = 0; j < a[0].length; j++)
			{
				boolean flag=false;
				for(int k = 2; k <= a[i][j]/2; k++)
				{
					if(a[i][j] % k == 0)
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
		}
		System.out.println(count);
	}
}
