package com.maven.Oops.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Max {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int max = 0,i;
		System.out.println("Enter n value" );
		int n = s.nextInt();
		System.out.println("Enter values" );
		ArrayList<Integer> list = new ArrayList();
		
		for(i = 0; i < n; i++)
		{
			list.add(s.nextInt());
		}
			for(i = 0; i < n; i++)
			{
				Integer num = list.get(i);
				if(num > max)
				{
					max = num;
				}
			}
			System.out.println(max);
	}
}
