package ejercicio;

import java.util.Arrays;

public class StringNumbers {

	public String addNumbers(String entrada){
		//Validations
		if(entrada.equals("")){return "0";}
		if(entrada.substring(entrada.length() - 1).equals(",")) {return "Format not valid";}

		//Actions
		double[] numbers = Arrays.stream(entrada.split(","))
				.mapToDouble(Double::parseDouble)
				.toArray();

		double suma = 0;
		for(double element : numbers) {
			suma += element;
		}

		return Double.toString(suma);
	}public String addNumbers(String delimitador,String entrada){

		String delimitador = delimitador;
		//Validations
		if(entrada.equals("")){return "0";}
		if(entrada.substring(entrada.length() - 1).equals(",")) {return "Format not valid";}

		//Actions
		double[] numbers = Arrays.stream(entrada.split("delimitador"))
				.mapToDouble(Double::parseDouble)
				.toArray();

		double suma = 0;
		for(double element : numbers) {
			suma += element;
		}

		return Double.toString(suma);
	}
        
}
