package com.maven.Oops.HouseManagement;
import java.util.ArrayList;

public class HouseBuilder {

	
	ArrayList<House> house = new ArrayList();
	ArrayList<Room> room = new ArrayList();
	
	/**
	 * to add house details if the details are not same
	 * 
	 * @param h - details of house
	 * @return true or false as per the parameter
	 */
	public boolean addHouseDetails(House h)
	{
		boolean flag = true;
		for(House hse : house)
		{
			if(hse.equals(h))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			house.add(h);
		}
		return flag;
	}

	/**
	 * to get list of all house details
	 * 
	 * @return all house details
	 */
	public ArrayList<House> getAllHouseDetails()
	{
		return house;
	}
	
	/**
	 * to remove the house details of a specific house as per parameter
	 * 
	 * @param h - house details
	 * @return true or false as per parameter
	 */
	public boolean removeHouseDetails(House h)
	{
		boolean flag = true;
		for(House hse : house)
		{
			if(hse.equals(h))
			{
				flag = false;
				break;
			}
		}
		if(!flag)
		{
			house.remove(h);
		}
		return flag;
	}
	
	/**
	 * to update house details by removing the current details
	 * 
	 * @param current - existing details
	 * @param update - new details
	 * @return true or false as per the parameter
	 */
	public boolean updateHouseDetails(House current, House update)
	{
		boolean flag = true;
		for(House hse : house)
		{
			if(hse.equals(current))
			{
				flag = false;
				break;
			}
		}
		if(!flag)
		{
			house.remove(current);
			house.add(update);
		}
		return flag;
	}
	
	/**
	 * to get house details by house Id
	 * 
	 * @param id - house id
	 * @return hse if the id matches otherwise h i.e., null
	 */
	public House getHouseById(int id)
	{
		House h = null;
		for(House hse : house)
		{
			if(hse.getId() == id)
			{
				return hse;
			}
		}
		return h;
	}
	
	/**
	 * to get list of houses by names
	 * 
	 * @param houseName
	 * @return hse if names are same i.e., to add details
	 */
	public ArrayList<House> getHouseNames(String houseName)
	{
		ArrayList<House> houseNames = new ArrayList();
		for(House hse : house)
		{
			if(hse.getHouseName().equals(houseName))
			{
				houseNames.add(hse);
			}
		}
		return houseNames;
	}
	
	/**
	 * to get rooms by room id
	 * 
	 * @param rid - room id
	 * @return null if there is no room with the id else return the room details
	 */
	public Room getRoomsByRoomId(int rid)
	{
		/* Room r = null; */
		for(Room rm : room)
		{
			if(rm.getRid() == rid)
			{
				return rm;
			}
		}
		return null;
	}
}
