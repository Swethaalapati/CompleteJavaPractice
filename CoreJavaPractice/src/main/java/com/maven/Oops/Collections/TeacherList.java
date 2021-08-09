package com.maven.Oops.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherList {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Teacher2> listOfTeachers = new ArrayList();
		
		Teacher2 t  = new Teacher2();
		Teacher2 t1 = new Teacher2(1,"swetha","english");
		Teacher2 t2 = new Teacher2(2,"chintu","hindi");
		
		listOfTeachers.add(t);
		listOfTeachers.add(t1);
		listOfTeachers.add(t2);
		
		Teacher2 t3 = new Teacher2(3,"swathi", "physics");
		listOfTeachers.add(t3);
		
		for(Teacher2 teacher : listOfTeachers)
		{
			System.out.println(teacher);
		}
		
		
		t2.setsubject("maths");
		listOfTeachers.set(2, t3);
		
		for(Teacher2 teacher : listOfTeachers)
		{
			System.out.println(teacher);
		}
	}
}
