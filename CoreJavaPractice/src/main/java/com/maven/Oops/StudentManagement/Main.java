package com.maven.Oops.StudentManagement;

public class Main {
	
	
	public static void main(String[] args) {
		
		StudentBuilder builder = new StudentBuilder();
		
		Student s = new Student(1, "swetha", "cse");
		Student s1 = new Student(2 , "chintu", "cse");
		
		builder.addStudent(s);
		builder.addStudent(s1);
		builder.printStudent();
		
		builder.addStudent(s1);
		builder.printStudent();
		
		Student s2 = new Student(3, "swathi", "IT");
		builder.addStudent(s2);
		builder.printStudent();
		
		builder.updateStudent(s, s1);
		builder.printStudent();
		builder.removeStudent(s);
		builder.printStudent();
	}
}
