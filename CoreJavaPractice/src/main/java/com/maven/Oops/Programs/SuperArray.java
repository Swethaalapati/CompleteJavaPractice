package com.maven.Oops.Programs;
import java.util.ArrayList;
import java.util.Scanner;

public class SuperArray {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		int num = s.nextInt();
		boolean flag = false;
		System.out.println("enter values");
		ArrayList<Integer> list = new ArrayList();
		for(int i = 0; i < n; i++)
		{
			list.add(s.nextInt());
		}
		
		for(int i = 0; i < list.size(); i++)
		{
			for(int j = i + 1; j < list.size(); j++)
			{
				if(list.get(i) + list.get(j) == num)
				{
					flag = true;
					break;
				}
			}
			
		}
		if(flag == true)
		{
			System.out.println("Super Array");
		}
		else
		{
			System.out.println("Not a Super Array");
		}
		
	}
}
