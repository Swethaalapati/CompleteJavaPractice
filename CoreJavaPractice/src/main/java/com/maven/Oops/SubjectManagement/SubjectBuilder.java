package com.maven.Oops.SubjectManagement;
import java.util.ArrayList;

public class SubjectBuilder {

	ArrayList<Subject> subject = new ArrayList<Subject>();
	
	/**
	 * to add subject details
	 * 
	 * @param s
	 */
	public void addSubject(Subject s)
	{
		boolean flag = false;
		for(Subject sub : subject)
		{
			if(sub.equals(s))
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			subject.add(s);
		}
	}
	
	/**
	 * to get List of subject details
	 * 
	 */
	public void printSubject()
	{
		System.out.println("the data is");
		for(Subject sub : subject)
		{
			System.out.println(sub);
		}
	}
	
	/**
	 * to update subject details by removing current details
	 * 
	 * @param current -- existing details
	 * @param update -- new details
	 */
	public void updateSubject(Subject current, Subject update)
	{
		boolean flag = false;
		for (Subject sub : subject) 
		{
			if(sub.equals(current))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			subject.remove(current);
			subject.add(update);
		}
	}
	
	/**
	 * to remove Subject details
	 * 
	 * @param s
	 */
	public void removeSubject(Subject s)
	{
		boolean flag = false;
		for (Subject sub : subject) 
		{
			if(sub.equals(s))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			subject.remove(s);
		}
	}
}
