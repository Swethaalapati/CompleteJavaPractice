package com.maven.Oops.HouseManagement;

public class Room {

	
	private int rid;
	private String roomName;
	
	
	public Room() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Room(int rid, String roomName) {
		
		this.rid = rid;
		this.roomName = roomName;
	}
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rid;
		result = prime * result + ((roomName == null) ? 0 : roomName.hashCode());
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
		Room other = (Room) obj;
		if (rid != other.rid)
			return false;
		if (roomName == null) {
			if (other.roomName != null)
				return false;
		} else if (!roomName.equals(other.roomName))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Room [rid=" + rid + ", roomName=" + roomName + "]";
	}
	
}
