package ejercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringNumbersTests {
	@Test
	public void addNumbers_WhenCall_Return0() {
		StringNumbers numbers = new StringNumbers();
		
		String result = numbers.addNumbers("");
		assertEquals("0",result);
	}
	
	@Test
	public void addNumbers_WhenCall_Return3() {
		StringNumbers numbers = new StringNumbers();

		String result = numbers.addNumbers("1,2");

		assertEquals("3.0",result);
	}
	
	@Test
	public void addNumbers_WhenCall_ReturnErrorMsg() {
		StringNumbers numbers = new StringNumbers();

		String result = numbers.addNumbers("1,2,");

		assertEquals("Format not valid",result);
	}
	@Test
	public void addNumbers_WhenCall_ReturnDouble() {
		StringNumbers numbers = new StringNumbers();

		String result = numbers.addNumbers("1.2,1.8");
		
		assertEquals("3.0",result);
	}
	@Test
	public void addNumber_WhenCallWithDelimiters_CorrectValue() {
		StringNumbers numbers = new StringNumbers();

		String result = numbers.addNumbers(";","1.2;1.8");
		
		assertEquals("3.0",result);
	}
	
	@Test
	public void addNumber_WhenCallWithNegative_CorrectValue() {
		StringNumbers numbers = new StringNumbers();

		String result = numbers.addNumbers(";","-1.2;1.8");
		
		assertEquals("Not valid negative numbers",result);
	}
}
