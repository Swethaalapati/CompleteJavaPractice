package com.maven.Oops.Programs;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexCount {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		System.out.println("enter number");
		int num = s.nextInt();
		System.out.println("enter values");
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Integer> index = new ArrayList();
		int count = 0;
		for(int i = 0; i < n; i++)
		{
			list.add(s.nextInt());
		}
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i) == num)
			{
				count++;
				index.add(i);
			}
		}
			System.out.println(count);
			for(int i = 0; i < index.size(); i++)
			{
				System.out.println(index.get(i));
			}
	}
}
