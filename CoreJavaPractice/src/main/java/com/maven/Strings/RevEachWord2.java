package com.maven.Strings;

import java.util.Scanner;

public class RevEachWord2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String str = s.nextLine();

		String words[] = str.split(" ");
	
		String result = "";
		
		for(String word : words) {
			
			for(int i = word.length()-1; i >= 0; i--) {
				result += word.charAt(i);
			}
			result += " ";
		}
		System.out.println(result);
		
		for(int i = words.length-1; i >= 0; i--) {
			
			System.out.print(words[i] + " ");
		}	
	}
}
