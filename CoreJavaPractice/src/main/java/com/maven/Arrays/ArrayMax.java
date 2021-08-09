package com.maven.Arrays;
import java.util.Scanner;

public class ArrayMax {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num;
		int low = Integer.MAX_VALUE;
		do
		{
			num = s.nextInt();
			if(num < low && num != -1)
			{
				low = num;
			}
		}while(num != -1);
		System.out.println(low);
	}
}
