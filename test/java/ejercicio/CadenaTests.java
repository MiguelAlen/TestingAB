package ejercicio;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTests {
	
	@Test
	void splitWhiteSpaces_WhenCall_returnArrayOfWordsBySpaces() {
		//Create the object
		FizzBuzz fizzBuzz = new FizzBuzz(1);

		//Act
		String result = fizzBuzz.run();
		
		//Assert
		assertEquals("1",result);
	}


}
