package com.maven.BasicPrograms;
import java.util.Scanner;

public class Pattern10 {
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}
