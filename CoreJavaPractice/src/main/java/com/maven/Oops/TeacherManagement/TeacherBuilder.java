package com.maven.Oops.TeacherManagement;
import java.util.ArrayList;

public class TeacherBuilder {

		ArrayList<Teacher> teacher = new ArrayList<Teacher>();
		
		/**
		 * to add Teacher details
		 * 
		 * @param t
		 */
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
		
		/**
		 * to get List of Teacher details
		 * 
		 */
		public void printTeacher()
		{
			System.out.println("the data is");
			for(Teacher tch : teacher)
			{
				System.out.println(tch);
			}
		}
		
		/**
		 * to update teacher details by removing current details
		 * 
		 * @param current -- existing details
		 * @param update -- new details
		 */
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
		
		/**
		 * to remove teacher details
		 * 
		 * @param b
		 */
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
