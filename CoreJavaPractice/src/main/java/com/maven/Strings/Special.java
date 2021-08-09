package com.maven.Strings;
import java.util.Scanner;

public class Special {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i;
		Boolean flag = false;
		String str = s.nextLine();
		for(i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				if(str.charAt(i+1) == 'a' || str.charAt(i+1) == 'e' || str.charAt(i+1) == 'i' || str.charAt(i+1) == 'o' || str.charAt(i+1) == 'u')
				{
					flag = true;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("special");
		}
		else
		{
			System.out.println("not special");
		}
	}

}
