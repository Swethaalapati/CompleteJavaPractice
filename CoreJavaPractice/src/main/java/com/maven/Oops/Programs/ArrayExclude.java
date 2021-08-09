package com.maven.Oops.Programs;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExclude {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		System.out.println("Enter values");
		ArrayList<Integer> list = new ArrayList();
		
		while(true)
		{
			int num = s.nextInt();
			if(num == 22)
			{
				break;
			}
			list.add(num);
		}
		for(int i = 0; i < n; i++)
		{
			System.out.println(list.get(i));
		}
	}
}
