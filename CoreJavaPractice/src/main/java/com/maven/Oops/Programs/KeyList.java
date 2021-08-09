package com.maven.Oops.Programs;
import java.util.Scanner;
import java.util.ArrayList;

public class KeyList {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		
		ArrayList<Integer> list = new ArrayList();
		
		for(int i = 0; i < n; i++)
		{
			list.add(s.nextInt());
		}
		System.out.println("enter key");
		int key = s.nextInt();
		for( int i = 0; i < n; i++)
		{
			Integer num = list.get(i);
			if(num == key)
			{
				System.out.println("found");
				break;
			}
		}
	}
}