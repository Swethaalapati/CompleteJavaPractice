package com.maven.Oops.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class BranchList {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<Branch2> listOfBranchs = new ArrayList();
		
		Branch2 b  = new Branch2();
		Branch2 b1 = new Branch2(1,"cse");
		Branch2 b2 = new Branch2(2,"it");
		
		listOfBranchs.add(b);
		listOfBranchs.add(b1);
		listOfBranchs.add(b2);
		
		Branch2 b3 = new Branch2(3,"it");
		listOfBranchs.add(b3);
		
		for(Branch2 branch : listOfBranchs)
		{
			System.out.println(branch);
		}
		
		
		b2.setbranchName("cse");
		listOfBranchs.set(1, b3);
		
		for(Branch2 branch : listOfBranchs)
		{
			System.out.println(branch);
		}
	}
}
