package ejercicio;

import java.util.Arrays;

public class StringNumbers {
	
	private double plusNumbers(double [] numbers) {
		double suma = 0;
		boolean parar = false;
		
		for(int i = 0; i < numbers.length && !parar; i++) {
			if(numbers[i]<0) {
				parar = true;
				suma = -1;
			}else 
				suma += numbers[i];
			
			
			
		}
		return suma;
	}
	
	private String validation(String entrada, String delimitador) {
		String valid="success";
		if(entrada.equals("")) 
			valid="0";
		else if(entrada.substring(entrada.length() - 1).equals(delimitador)) 
			valid = "Format not valid";
		
		
		return valid;
	}

	public String addNumbers(String entrada){
		//Validations
		String valid = validation(entrada, ",");

		if(valid.equals("success")) {
			//Actions
			double[] numbers = Arrays.stream(entrada.split(","))
					.mapToDouble(Double::parseDouble)
					.toArray();

			String result = Double.toString(plusNumbers(numbers));
			
			return (result.equals("-1.0")) ? "Not valid negative numbers" : result ;
		}else 
			return valid;
	}
	
	public String addNumbers(String delimitador,String entrada){
		//Validations
		String valid = validation(entrada, delimitador);
		if(valid.equals("success")) {
			//Actions
			double[] numbers = Arrays.stream(entrada.split(delimitador))
					.mapToDouble(Double::parseDouble)
					.toArray();
			String result = Double.toString(plusNumbers(numbers));

			return (result.equals("-1.0")) ? "Not valid negative numbers" : result ;
		}else 
			return valid;
	}
        
}
