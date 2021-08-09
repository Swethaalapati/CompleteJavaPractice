package com.maven.Oops.TeacherManagement;
import java.util.ArrayList;

public class TeacherBuilder {

		ArrayList<Teacher> teacher = new ArrayList<Teacher>();
		
		public void addTeacher(Teacher t)
		{
			boolean flag = false;
			for(Teacher tch : teacher )
			{
				if(tch.equals(t))
				{
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				teacher.add(t);
			}
		}
		
		public void printTeacher()
		{
			System.out.println("the data is");
			for(Teacher tch : teacher)
			{
				System.out.println(tch);
			}
		}
		
		public void updateTeacher(Teacher current, Teacher update)
		{
			boolean flag = false;
			for(Teacher tch : teacher)
			{
				if(tch.equals(current))
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				teacher.remove(current);
				teacher.add(update);
			}
		}
		
		public void removeTeacher(Teacher b)
		{
			boolean flag = false;
			for(Teacher tch : teacher)
			{
				if(tch.equals(b))
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				teacher.remove(b);
			}
		}
}
