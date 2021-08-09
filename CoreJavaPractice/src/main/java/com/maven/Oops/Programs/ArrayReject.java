package com.maven.Oops.Programs;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReject {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		System.out.println("enter values");
		ArrayList<Integer> list = new ArrayList();
		
		for(int i = 0; i < n; i++)
		{
			int num = s.nextInt();
			if(num == 22)
			{
				i = i - 1;
			}
			else
			{
				list.add(num);
			}
		}
		for(int i = 0; i < n; i++)
		{
			System.out.println(list.get(i));
		}
	}
}
