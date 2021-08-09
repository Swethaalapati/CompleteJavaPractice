package com.maven.Oops.StudentManagement;
import java.util.ArrayList;

public class StudentBuilder {
	
	
	ArrayList<Student> student = new ArrayList<Student>();
	
	/**
	 * to add student details
	 * 
	 * @param s
	 */
	public void addStudent(Student s)
	{
		boolean flag = false;
		for (int i = 0; i < student.size(); i++)
		{
			if(student.get(i).equals(s))
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			student.add(s);
		}
	}
	
	/**
	 * to get list of all students
	 */
	public void printStudent()
	
	{
		System.out.println("the students are");
		for(Student std : student)
		{
			System.out.println(std);
		}
	}
	
	/**
	 * to update student details by removing current details
	 * 
	 * @param current
	 * @param update
	 */
	public void updateStudent(Student current, Student update)
	{
		boolean flag = true;
		for(Student std : student)
		{
			if(std.equals(current))
			{
				flag = false;
				break;
			}
		}
		if(!flag)
		{
			student.remove(current);
			student.add(update);
		}
	}
	
	/**
	 * to remove a student
	 * 
	 * @param s
	 */
	public void removeStudent(Student s)
	{
		for(Student std : student)
		{
			if(std.equals(s))
			{
				student.remove(std);
			}
		}
	}
}
