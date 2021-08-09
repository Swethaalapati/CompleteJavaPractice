package com.maven.Oops.EmployeeManagement;

public class Employee1 {

	
	private int id;
	private int joiningyear;
	private String firstname;
	private String lastname;
	private String fullname;
	private String role;
	private int experience;
	private String permnt;
	private int salary;
	
	
	public Employee1() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee1(int id, String firstname, String lastname, String role, int experience, String permnt, int salary) {
		
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
		this.experience = experience;
		this.permnt = permnt;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJoiningyear() {
		return joiningyear;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getPermnt() {
		return permnt;
	}
	public void setPermnt(String permnt) {
		this.permnt = permnt;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + experience;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
		result = prime * result + id;
		result = prime * result + joiningyear;
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((permnt == null) ? 0 : permnt.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + salary;
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
		Employee1 other = (Employee1) obj;
		if (experience != other.experience)
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (fullname == null) {
			if (other.fullname != null)
				return false;
		} else if (!fullname.equals(other.fullname))
			return false;
		if (id != other.id)
			return false;
		if (joiningyear != other.joiningyear)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (permnt == null) {
			if (other.permnt != null)
				return false;
		} else if (!permnt.equals(other.permnt))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + firstname + "," + lastname + ", role=" + role
				+ ", experience=" + experience + ", permnt=" + permnt + ", salary=" + salary + "]";
	}
	
	
	
}
