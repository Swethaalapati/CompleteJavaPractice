package com.maven.Oops.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student2> listOfStudents = new ArrayList();
		
		Student2 s  = new Student2();
		Student2 s1 = new Student2(1,"swetha","cse");
		Student2 s2 = new Student2(2,"chintu","it");
		
		listOfStudents.add(s);
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		
		Student2 s3 = new Student2(3,"swathi", "it");
		listOfStudents.add(s3);
		
		for(Student2 student : listOfStudents)
		{
			System.out.println(student);
		}
		
		
		s2.setbranchName("cse");
		listOfStudents.set(0, s3);
		
		for(Student2 student : listOfStudents)
		{
			System.out.println(student);
		}
	}
	
}
