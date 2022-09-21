package ejercicio;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CadenaTests {
	
	@Test
	void splitWhiteSpaces_WhenCall_returnArrayOfWordsBySpaces() {
		//Create the object
		Cadena cadena = new Cadena("Hola buenos días");
		
		//Act
		String [] words = cadena.splitWhiteSpacesArray();
		
		//Assert
		String [] expected = {"Hola","buenos","días"};
		assertArrayEquals(expected, words);
	}
	
	@Test
	void split_WhenCall_returnArrayOfWordsSeparatedByGivenCharacter() {
		Cadena cadena = new Cadena("kjfdlkasfdaslkj1ljdfsljaslfj1 kjlkjkljlk1lkj");
		
		String [] words = cadena.split("1");
		
		String [] expected = {"kjfdlkasfdaslkj","ljdfsljaslfj"," kjlkjkljlk","lkj"};
		assertArrayEquals(expected, words);
	}
	
	@Test
	void split_whenCall_returnPutACharacterToSplit() {
		Cadena cadena = new Cadena("kjfdlkasfdaslkj1ljdfsljaslfj1 kjlkjkljlk1lkj");
		
		String [] words = cadena.split("");
		
		String [] expected = {"Put a character to split"};
		assertArrayEquals(expected, words);
	}
	
	
	@Test
	void splitWithoutRepetition_whenCall_returnArrayOfSplitedWords() {
		Cadena cadena = new Cadena("hola buenos días mundo mundo mundo cruel cruel");
		
		String [] words = cadena.splitWithoutRepeat(" ");
		
		String [] expected = {"hola", "buenos", "días", "mundo", "cruel"};
		assertEquals(expected.length, words.length);
	}
	
	@Test
	void intersection_whenCall_returnASingleArrayWithIntersectionWords() {
		Cadena cadena = new Cadena("hola buenos días mundo mundo mundo cruel cruel");
		
		String [] words = cadena.splitWithoutRepeat(" ");
		
		String [] expected = {"hola", "buenos", "días", "mundo", "cruel"};
		assertEquals(expected.length, words.length);
		
	}

}
