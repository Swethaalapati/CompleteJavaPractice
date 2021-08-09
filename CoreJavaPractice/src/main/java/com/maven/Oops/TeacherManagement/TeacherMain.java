package com.maven.Oops.TeacherManagement;

public class TeacherMain {
	
	
	public static void main(String[] args) {
		
		TeacherBuilder builder = new TeacherBuilder();
		
		Teacher t = new Teacher(1, "swetha", "english");
		Teacher t1 = new Teacher(2 , "chintu", "maths");
		
		builder.addTeacher(t);
		builder.addTeacher(t1);
		builder.printTeacher();
		
		builder.addTeacher(t1);
		builder.printTeacher();
		
		Teacher t2 = new Teacher(3, "swathi", "physics");
		builder.addTeacher(t2);
		builder.printTeacher();
		
		builder.updateTeacher(t1, t2);
		builder.printTeacher();
		builder.removeTeacher(t2);
		builder.printTeacher();
	}
}
