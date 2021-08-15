package com.maven.Oops.BranchManagement;
import java.util.ArrayList;

public class Branch {

	
	private int id;
	private String branchName;
	private String branchHead;
	private ArrayList<String> subjects;
	
	
	public Branch() {
		
	}


	public Branch(int id, String branchName, String branchHead, ArrayList<String> subjects) {
		
		this.id = id;
		this.branchName = branchName;
		this.branchHead = branchHead;
		this.subjects = subjects;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public String getBranchHead() {
		return branchHead;
	}


	public void setBranchHead(String branchHead) {
		this.branchHead = branchHead;
	}


	public ArrayList<String> getSubjects() {
		return subjects;
	}


	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branchHead == null) ? 0 : branchHead.hashCode());
		result = prime * result + ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + id;
		result = prime * result + ((subjects == null) ? 0 : subjects.hashCode());
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
		Branch other = (Branch) obj;
		if (branchHead == null) {
			if (other.branchHead != null)
				return false;
		} else if (!branchHead.equals(other.branchHead))
			return false;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (id != other.id)
			return false;
		if (subjects == null) {
			if (other.subjects != null)
				return false;
		} else if (!subjects.equals(other.subjects))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Branch [id=" + id + ", branchName=" + branchName + ", branchHead=" + branchHead + ", subjects="
				+ subjects + "]";
	}


	
}
