package mini_opdrachten_java_week;

import java.util.Scanner;  
import java.util.Arrays;

public class opdracht6 {
	
	public final static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
	    System.out.println("Enter String:");

	    String ingevuld_woord = sc.nextLine();  
	    
	    System.out.println("Ingevuld woord is: " + ingevuld_woord);  
	    
	    // Sorteren van het woord
	    char char_array[] = ingevuld_woord.toCharArray();
	    Arrays.sort(char_array);
	    String gesorteerd =  new String(char_array);
	    System.out.println("Gesorteerd: " + gesorteerd);
	
	}
}
