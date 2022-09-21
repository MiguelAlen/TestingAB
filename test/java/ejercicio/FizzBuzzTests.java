package ejercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class FizzBuzzTests {
	
	@Test
	void run_whenCall_ReturnTheSameNumberString() {
		//Create the object
		FizzBuzz fizzBuzz = new FizzBuzz(1);

		//Act
		String result = fizzBuzz.run();
		
		//Assert
		assertEquals("1",result);
	}

	@Test
	void run_whenCall_returnFizzWhenInputIsThree() {
		//Create the object
		FizzBuzz fizzBuzz = new FizzBuzz(3);

		//Act
		String result = fizzBuzz.run();
				
		//Assert
		assertEquals("FIZZ",result);
	}
	@Test
	void run_whenCall_returnBuzzWhenInputIsThree() {
		//Create the object
		FizzBuzz fizzBuzz = new FizzBuzz(5);

		//Act
		String result = fizzBuzz.run();

		//Assert
		assertEquals("BUZZ",result);
	}
	@Test
	void run_whenCall_returnFizzBuzzWhenInputIsThree() {
		//Create the object
		FizzBuzz fizzBuzz = new FizzBuzz(15);

		//Act
		String result = fizzBuzz.run();

		//Assert
		assertEquals("FIZZBUZZ",result);
	}

}
