package com.maven.Oops.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class SubjectList {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Subject2> listOfSubjects = new ArrayList();
		
		Subject2 s  = new Subject2();
		Subject2 s1 = new Subject2(1,"english");
		Subject2 s2 = new Subject2(2,"hindi");
		
		listOfSubjects.add(s);
		listOfSubjects.add(s1);
		listOfSubjects.add(s2);
		
		Subject2 s3 = new Subject2(3,"physics");
		listOfSubjects.add(s3);
		
		for(Subject2 subject : listOfSubjects)
		{
			System.out.println(subject);
		}
		
		s2.setsubName("maths");
		listOfSubjects.set(0, s2);
		
		for(Subject2 subject : listOfSubjects)
		{
			System.out.println(subject);
		}
	}
}
