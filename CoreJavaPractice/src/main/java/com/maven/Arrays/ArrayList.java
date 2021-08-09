package com.maven.Arrays;
import java.util.Scanner;

public class ArrayList {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num;
		int high = Integer.MIN_VALUE;
		do
		{
			num = s.nextInt();
			if(num > high && num != -1)
			{
				high = num;
			}
		}while(num != -1);
		System.out.println(high);
	}
}
