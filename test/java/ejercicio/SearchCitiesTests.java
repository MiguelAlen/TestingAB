package ejercicio;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class SearchCitiesTests {
	
	private MockDB database = new MockDB();

	@Test
	public void find_WhenCall_EmptyArray() {

		SearchCities cities = new SearchCities();

		String [] result = cities.find("d");

		assertEquals(0, result.length);
	}
	@Test
	public void find_WhenCall_EmptyArray() {

		SearchCities cities = new SearchCities();

		String [] result = cities.find("Va");

		assertArray.equals(["Valencia","Valladolid"]);
	}

}
