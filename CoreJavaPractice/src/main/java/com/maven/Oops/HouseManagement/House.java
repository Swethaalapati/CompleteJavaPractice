package com.maven.Oops.HouseManagement;
import java.util.ArrayList;

public class House {

	
	private int id;
	private String houseName;
	private int numOfRooms;
	private ArrayList<Room> rooms;
	
	
	
	public House() {
		
		// TODO Auto-generated constructor stub
	}



	public House(int id, String houseName, int numOfRooms, ArrayList<Room> rooms) {
		
		this.id = id;
		this.houseName = houseName;
		this.numOfRooms = numOfRooms;
		this.rooms = rooms;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getHouseName() {
		return houseName;
	}



	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}



	public int getNumOfRooms() {
		return numOfRooms;
	}



	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}



	public ArrayList<Room> getRooms() {
		return rooms;
	}



	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((houseName == null) ? 0 : houseName.hashCode());
		result = prime * result + id;
		result = prime * result + numOfRooms;
		result = prime * result + ((rooms == null) ? 0 : rooms.hashCode());
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
		House other = (House) obj;
		if (houseName == null) {
			if (other.houseName != null)
				return false;
		} else if (!houseName.equals(other.houseName))
			return false;
		if (id != other.id)
			return false;
		if (numOfRooms != other.numOfRooms)
			return false;
		if (rooms == null) {
			if (other.rooms != null)
				return false;
		} else if (!rooms.equals(other.rooms))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "House [id=" + id + ", houseName=" + houseName + ", numOfRooms=" + numOfRooms + ", rooms=" + rooms + "]";
	}
	
	
	
}
