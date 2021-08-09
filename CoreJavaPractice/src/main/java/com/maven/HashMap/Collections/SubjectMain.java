package com.maven.HashMap.Collections;

public class SubjectMain {

	public static void main(String[] args) 
	{
		SubjectHelper helper = new SubjectHelper();
		
		Subject s = new Subject(1, "English");
		Subject s1 = new Subject(2, "C++");
		Subject s2 = new Subject(3, "Java");
		Subject s3 = new Subject(4, "C");
		
		
		helper.addSubject(s);
		helper.addSubject(s1);
		helper.addSubject(s2);
		helper.addSubject(s3);
		
		System.out.println(helper.getAllSubjects());
		
		helper.removeSubject(s);
		
		System.out.println(helper.getAllSubjects());
		
		helper.updateSubject(s2, s3);
		
		System.out.println(helper.getAllSubjects());
	}
}