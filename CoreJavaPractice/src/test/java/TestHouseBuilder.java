import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.maven.Oops.HouseManagement.House;
import com.maven.Oops.HouseManagement.HouseBuilder;


public class TestHouseBuilder {

	@Test
	public void testHouseBuilderObject()	{
		
		HouseBuilder builder = new HouseBuilder();
		
		assertTrue(builder instanceof HouseBuilder);
		
		HouseBuilder builder1 = new HouseBuilder();
		House h = new House(1, "Swetha", 3, null);
		builder1.addHouseDetails(h);
		assertEquals(h, h);
		
		builder1.getAllHouseDetails();
		assertEquals(h, h);
		
		House h1 = new House(2, "Swathi", 4, null);
		builder1.updateHouseDetails(h, h1);
		assertEquals(h1, h1);
		
		builder1.removeHouseDetails(h1);
		assertEquals(h1, h1);
		
		builder1.getHouseById(2);
		assertEquals(h1, h1);
		
		builder1.getHouseByNames("Swathi");
		assertEquals(h1, h1);
		
		
	}
	
}
