package com.maven.Oops.Programs;
import java.util.ArrayList;
import java.util.Scanner;

public class LastIndex {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int index = 0,i = 0;
		boolean found = false;
		System.out.println("Enter n value" );
		int n = s.nextInt();
		ArrayList<Integer> list = new ArrayList();
		
		for(i = 0; i < n; i++)
		{
			list.add(s.nextInt());
		}
		System.out.println("Enter key" );
		int key = s.nextInt();
		for(i = 0; i < n; i++)
		{
			Integer num = list.get(i);
			if(num == key)
			{
				index = i;
				found = true;
			}
		}
		
		if(found)
		{
			System.out.println(index);
		}
		else
		{
			System.out.println("not found");
		}
		
	}
}
