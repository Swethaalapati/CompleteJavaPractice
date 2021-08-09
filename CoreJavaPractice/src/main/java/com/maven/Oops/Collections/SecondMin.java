package com.maven.Oops.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class SecondMin {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value" );
		int n = s.nextInt();
		System.out.println("Enter values" );
		ArrayList<Integer> list = new ArrayList();
		
		for(int i = 0; i < n; i++)
		{
			list.add(s.nextInt());
		}
		Integer num = list.get(0);
		for(int i = 0; i < list.size(); i++)
		{			
			if(num > list.get(i))
			{
				num = list.get(i);
			}
		}
		
		Integer num1 = list.get(0);
		for(int i = 0; i < list.size(); i++)
		{
			if(num1 > list.get(i) && list.get(i) != num)
			{
				num1 = list.get(i);
			}
		}
			System.out.println(num1);
	}
}
