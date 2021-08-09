package com.maven.Oops.RoleManagement;

public class Role1 {

	private int id;
	private String roleName;
	
	
	public Role1() {
		
		// TODO Auto-generated constructor stub
	}


	public Role1(int id, String roleName) {
		
		this.id = id;
		this.roleName = roleName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
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
		Role1 other = (Role1) obj;
		if (id != other.id)
			return false;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Role1 [id=" + id + ", roleName=" + roleName + "]";
	}
	
	
	
}
