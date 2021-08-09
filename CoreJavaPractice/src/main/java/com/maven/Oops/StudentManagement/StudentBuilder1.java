package com.maven.Oops.StudentManagement;
import java.util.ArrayList;

public class StudentBuilder1 {

	
	ArrayList<Student1> student = new ArrayList();
	
	/**
	 * to add student details
	 * 
	 * @param s
	 * @return true or false as per the parameter
	 */
	public boolean addStudent1(Student1 s)
	{
		boolean flag = true;
		for(Student1 std : student)
		{
			if(std.getId() == s.getId())
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			student.add(s);
		}
		return flag;
	}
	
	/**
	 * to get list of students
	 * 
	 * @return list of students
	 */
	public ArrayList<Student1> getAllStudents()
	{
		return student;
	}
	
	/**
	 * to remove student details
	 * 
	 * @param s
	 * @return true or false as per the parameter
	 */
	public boolean removeStudent1(Student1 s)
	{
		boolean flag = false;
		for(Student1 std : student)
		{
			if(std.equals(s))
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			student.remove(s);
		}
		return flag;
	}
	
	/**
	 * to update student details by removing current details
	 * 
	 * @param current - existing student
	 * @param update - new student
	 * @return true or false as per parameter
	 */
	public boolean updateStudent1(Student1 current, Student1 update)
	{
		boolean flag = false;
		for(Student1 std : student)
		{
			if(std.equals(current))
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			student.remove(current);
			student.add(update);
		}
		return flag;
	}
	
	/**
	 * to get student details by Id
	 * 
	 * @param id
	 * @return student details as per the parameter
	 */
	public Student1 getStudentById(int id)
	{
		Student1 s = null;
		for(Student1 std : student)
		{
			if(std.getId() == id)
			{
				return std;
			}
		}
		return s;
	}
	
	/**
	 * to get list of students by branch
	 * 
	 * @param branch
	 * @return list of students as per the parameter
	 */
	public ArrayList<Student1> getStudent1ByBranch(String branch)
	{
		ArrayList<Student1> branchStudent = new ArrayList();
		for(Student1 std : student)
		{
			if(std.getBranch().equals(branch))
			{
				branchStudent.add(std);
			}
		}
		return branchStudent;
	}
}
