package com.maven.HashMap.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentHelper {

	
	HashMap<Integer, Student> student = new HashMap<Integer, Student>();
	
	
	public void addStudent(Student std)
	{
		if(!student.containsKey(std.getId()))
		{
			student.put(std.getId(), std);
		}
	}
	
	
	public boolean removeStudent(Student std)
	{
		if(student.containsKey(std.getId()))
		{
			student.remove(std.getId());
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public void updateStudent(Student current, Student update)
	{
		if(student.containsKey(current.getId()))
		{
			student.remove(current.getId());
		}
		student.put(update.getId(),update);
	}
	
	
	public ArrayList<Student> getAllStudents()
	{
		return new ArrayList<Student>(student.values());
	}
	
	
	
}
