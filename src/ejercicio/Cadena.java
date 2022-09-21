package ejercicio;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Cadena {
	private String cadena;
	private static final String [] NOTVALIDSPLIT = {"Put a character to split"};
	
	public Cadena(String cadena) {
		this.setCadena(cadena);
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	public String[] splitWhiteSpacesArray() {
		return cadena.split(" ");
	}
	
	public String[] split(String character) {
		if(character.equals("")) {
			return NOTVALIDSPLIT;
		}
			  
		return cadena.split(character);
	}
	
	public String[] splitWithoutRepeat(String character) {
		
		String [] words = split(character);
		
		if(words.equals(NOTVALIDSPLIT)) 
			return NOTVALIDSPLIT;
		
		Set<String> result = new HashSet<String>(Arrays.asList(words));
		String [] finalWords = new String[result.size()];
		result.toArray(finalWords);
		
		
		return finalWords;
	}
}
