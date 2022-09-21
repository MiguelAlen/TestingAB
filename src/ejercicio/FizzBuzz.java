package ejercicio;

public class FizzBuzz {
	private int number;
	
	//Constructor
	public FizzBuzz(int number) {
		this.number = number;
	}
	
	public String run() {
		return (number % 3 == 0) ? "FIZZ" : Integer.toString(number);
	}
}
