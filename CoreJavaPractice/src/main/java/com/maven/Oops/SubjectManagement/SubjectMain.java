package com.maven.Oops.SubjectManagement;

public class SubjectMain {
	
	public static void main(String args[])
	{
		SubjectBuilder builder = new SubjectBuilder();
		
		Subject s = new Subject(1, "english");
		Subject s1 = new Subject(2, "maths");
		
		builder.addSubject(s);
		builder.addSubject(s1);
		builder.printSubject();
		
		builder.addSubject(s);
		builder.printSubject();
		
		Subject s2 = new Subject(3, "pysics");
		builder.addSubject(s2);
		builder.printSubject();
		
		builder.updateSubject(s1, s2);
		builder.printSubject();
		
		builder.removeSubject(s2);
		builder.printSubject();
	}

	
	
	
}
