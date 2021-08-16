package com.maven.Oops.HouseManagement;
import java.util.ArrayList;

public class Main {

	
	public static void main(String args[])
	{
		HouseBuilder builder = new HouseBuilder();
		ArrayList<Room> roomDetails = new ArrayList();
		
		Room r = new Room(1, "living room");
		Room r1 = new Room(2, "kitchen");
		Room r2 = new Room(3, "bed room");
		Room r3 = new Room(4, "store room");
		
		roomDetails.add(r);
		roomDetails.add(r1);
		roomDetails.add(r2);
		roomDetails.add(r3);
		
		
		House h = new House(1, "swetha", 3, roomDetails);
		House h1 = new House(2, "chintu", 4, roomDetails);
		House h2 = new House(3, "swathi", 5, roomDetails);
		House h3 = new House(4, "ajay", 3, roomDetails);
		
		System.out.println(builder.addHouseDetails(h));
		System.out.println(builder.addHouseDetails(h1));
		System.out.println(builder.addHouseDetails(h2));
		System.out.println(builder.addHouseDetails(h3));
		
		System.out.println(builder.getAllHouseDetails());
		
		System.out.println(builder.removeHouseDetails(h1));
		System.out.println(builder.getAllHouseDetails());
		
		System.out.println(builder.updateHouseDetails(h, h2));
		System.out.println(builder.getAllHouseDetails());
		
		System.out.println(builder.getHouseById(3));
		
		System.out.println(builder.getHouseByNames("ajay"));
		
		
		
	}
}
