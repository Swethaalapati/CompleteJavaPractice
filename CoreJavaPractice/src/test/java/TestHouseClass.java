import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.HouseManagement.House;
import com.maven.Oops.TeacherManagement.Teacher;

public class TestHouseClass {

	@Test
	public void testHouseObject( ) {
		
		House house = new House();
		
		assertTrue(house instanceof House);
		
		House house1 = new House(1, "Swetha", 3, null);
		
		assertEquals(1, house1.getId());
		assertEquals("Swetha", house1.getHouseName());
		assertEquals(3, house1.getNumOfRooms());
		assertEquals(null, house1.getRooms());
		
		house1.setId(2);
		assertEquals(2, house1.getId());
		
		house1.setHouseName("Chintu");
		assertEquals("Chintu", house1.getHouseName());
		
		house1.setNumOfRooms(4);
		assertEquals(4, house1.getNumOfRooms());
		
		house1.setRooms(null);
		assertEquals(null, house1.getRooms());
		
		assertEquals(923521, house.hashCode());
		
		House house2 = new House(2, "Chintu", 4, null);
		
		assertEquals(house1, house2);
		
		assertFalse(house.equals(house2));
		
		Object obj = new Object();
		assertTrue(house.equals(house));
		
		assertFalse(house.equals(null));
		
		House house3 = new House(3, "Swathi", 4, null);
		assertEquals("House [id=3, houseName=Swathi, numOfRooms=4, rooms=null]", house3.toString());
		
	}
	
}
