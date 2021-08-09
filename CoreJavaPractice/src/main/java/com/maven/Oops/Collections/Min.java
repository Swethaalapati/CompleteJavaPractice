package com.maven.Oops.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Min {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int min = 0,i;
		System.out.println("Enter n value" );
		int n = s.nextInt();
		System.out.println("Enter values" );
		ArrayList<Integer> list = new ArrayList();
		
		for(i = 0; i < n; i++)
		{
			list.add(s.nextInt());
		}
			
				min = list.get(0);
				for(i = 0; i < n; i++)
				{
					Integer num = list.get(i);
					if(num < min)
					{
						min = num;
					}
				}
			
			System.out.println(min);
	}
}