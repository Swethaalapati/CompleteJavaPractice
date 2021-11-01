package com.maven.Strings;

import java.util.Scanner;

public class RevEachWord {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String str = s.nextLine();

		String temp = "";
		String result = "";

		for (int i = 0; i < str.length(); i++) {

			if(str.charAt(i) != ' ') {
				temp += str.charAt(i);
			}
			
			if(str.charAt(i) == ' ' || i == str.length()-1) {
				
			
				result += reverse(temp) + " ";
				temp = "";
			}
		}

		System.out.println(result);
	}

	private static String reverse(String temp) {
		
		String rev = "";
		for(int i = temp.length() - 1; i >= 0; i--) {
			rev += temp.charAt(i);
		}
		return rev;
	}

}
