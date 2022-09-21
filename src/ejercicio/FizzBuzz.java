package ejercicio;

public class FizzBuzz {
	private int number;
	
	//Constructor
	public FizzBuzz(int number) {
		this.number = number;
	}
	
	public String run() {

		 if(number % 3 == 0){ return "FIZZ";}
		 else{ return (number % 5 == 0)? "BUZZ" : Integer.toString(number);}
	}
}
