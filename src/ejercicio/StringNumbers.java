package ejercicio;

import java.util.Arrays;

public class StringNumbers {

    public int addNumbers(String entrada){
    	
    	if(entrada.equals("")){return 0;}
    	
    	int[] numbers = Arrays.stream(entrada.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    	
    	int suma = 0;
    	for(int element : numbers) {
    		suma += element;
    	}
    	
    	return suma;
    	
    	
    	
    }
        
}
