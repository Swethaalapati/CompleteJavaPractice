package com.maven.Oops.Programs;
import java.util.ArrayList;
import java.util.Scanner;

public class ListPair {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		System.out.println("enter values");
		ArrayList<Integer> list = new ArrayList();
		int count = 0;
		for(int i = 0; i < n; i++)
		{
			list.add(s.nextInt());
		}
		for(int i = 0; i < list.size(); i++)
		{
			for(int j = i + 1; j < list.size(); j++)
			{
				if(list.get(i) == list.get(j))
				{
					count++;
					list.remove(j);
					break;
				}
			}
		}
		System.out.println(count +" pairs ");
	}
}
