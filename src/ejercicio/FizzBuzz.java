package ejercicio;

public class FizzBuzz {
	private int number;
	
	//Constructor
	public FizzBuzz(int number) {
		this.number = number;
	}
	
	public String run() {
		
		String result = Integer.toString(number);
		
		 if(number % 3 == 0 && number % 5 == 0){ 
			 result = "FIZZBUZZ";
		 }else if(number % 5 == 0){ 
			 result = "BUZZ";
		 }else if(number % 3 == 0)
			 result = "FIZZ";
		 
		 return result;
	}
}
