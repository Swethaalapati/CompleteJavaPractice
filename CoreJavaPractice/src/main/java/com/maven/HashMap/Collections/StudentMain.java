package com.maven.HashMap.Collections;

public class StudentMain {

	
	public static void main(String[] args) 
	{
		StudentHelper helper = new StudentHelper();
		
		Student s = new Student(1, "swetha", "CSE");
		Student s1 = new Student(2, "chintu", "CSE");
		Student s2 = new Student(3, "swathi", "IT");
		Student s3 = new Student(4, "ajay", "Civil");
		
		
		helper.addStudent(s);
		helper.addStudent(s1);
		helper.addStudent(s2);
		helper.addStudent(s3);
		
		System.out.println(helper.getAllStudents());
		
		helper.removeStudent(s);
		
		System.out.println(helper.getAllStudents());
		
		helper.updateStudent(s2, s3);
		
		System.out.println(helper.getAllStudents());
	}
}
