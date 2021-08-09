package com.maven.HashMap.Collections;
import java.util.ArrayList;
import java.util.HashMap;

public class SubjectHelper 
{		
	HashMap<Integer, Subject> subject = new HashMap<Integer, Subject>();
			
	public void addSubject(Subject sub)
	{
		if(!subject.containsKey(sub.getId()))
		{
			subject.put(sub.getId(), sub);
		}
	}		
	public boolean removeSubject(Subject sub)
	{
		if(subject.containsKey(sub.getId()))
		{
			subject.remove(sub.getId());
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public void updateSubject(Subject current, Subject update)
	{
		if(subject.containsKey(current.getId()))
		{
			subject.remove(current.getId());
		}
		subject.put(update.getId(),update);
	}
		
		
	public ArrayList<Subject> getAllSubjects()
	{
		return new ArrayList<Subject>(subject.values());
	}
}
