package com.maven.HashMap.Collections;

public class Subject {

	
	private int id;
	private String subjectName;
	
	
	public Subject() {
	
		// TODO Auto-generated constructor stub
	}


	public Subject(int id, String subjectName) {
		
		this.id = id;
		this.subjectName = subjectName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSubjectName() {
		return subjectName;
	}


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (id != other.id)
			return false;
		if (subjectName == null) {
			if (other.subjectName != null)
				return false;
		} else if (!subjectName.equals(other.subjectName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Subject [id=" + id + ", subjectName=" + subjectName + "]";
	}
	
	
	
}
