package ejercicio;

public class SearchCities {

	MockDB mockdb = new mockdb;
	public String [] find(String input) {

		return mockdb.find(input);
	}
}
