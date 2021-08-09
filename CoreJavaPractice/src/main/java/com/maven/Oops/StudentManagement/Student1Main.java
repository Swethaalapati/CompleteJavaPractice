package com.maven.Oops.StudentManagement;

public class Student1Main {
	
	public static void main(String args[])
	{
		StudentBuilder1 builder = new StudentBuilder1();
		
		Student1 s = new Student1(1, "swetha", "alapati", "cse");
		
		Student1 s1 = new Student1(2, "chintu", "parimi", "cse");
		
		Student1 s2 = new Student1(3, "swathi", "alapati", "IT");
		
		Student1 s3 = new Student1(4, "ajay", "yadavalli", "Mech");
		
		System.out.println(builder.addStudent1(s));
		System.out.println(builder.addStudent1(s1));
		System.out.println(builder.addStudent1(s2));
		System.out.println(builder.addStudent1(s3));
		System.out.println(builder.getAllStudents());
		
		System.out.println(builder.removeStudent1(s1));
		
		
		System.out.println(builder.updateStudent1(s2, s1));
	
		
		System.out.println(builder.getStudentById(1));
		
		
		System.out.println(builder.getStudent1ByBranch("cse"));
		
	}

	
	
}
