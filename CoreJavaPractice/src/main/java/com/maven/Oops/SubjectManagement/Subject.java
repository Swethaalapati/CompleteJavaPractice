package com.maven.Oops.SubjectManagement;

public class Subject {

	
	private int id;
	private String sub;
	public Subject() {
		
		// TODO Auto-generated constructor stub
	}
	public Subject(int id, String sub) {
		
		this.id = id;
		this.sub = sub;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((sub == null) ? 0 : sub.hashCode());
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
		if (sub == null) {
			if (other.sub != null)
				return false;
		} else if (!sub.equals(other.sub))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", sub=" + sub + "]";
	}
	
	
}
