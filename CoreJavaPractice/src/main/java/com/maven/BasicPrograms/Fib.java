package com.maven.BasicPrograms;

public class Fib {

	public static void main(String[] args) {
	
		int first=0,next=1,result;
		System.out.println(first);
		System.out.println(next);
		for(int i=2;i<10;i++)
		{
			result = first+next;

			first = next ;

			next = result ;
			
			System.out.println(result);

		}

	}

}
