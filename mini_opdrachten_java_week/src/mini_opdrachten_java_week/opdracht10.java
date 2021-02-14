package mini_opdrachten_java_week;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class opdracht10 {
	public final static void main(String args[]) {
		
		List<String> woorden = new ArrayList<String>();

		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Ik ga op vakantie en neem mee..."); 
		
	    String ingevuld_woord = sc1.nextLine();  
	    woorden.add(ingevuld_woord);
	    
	    System.out.println("Ingevuld woord is: " + ingevuld_woord); 
	    char laatste_letter = ingevuld_woord.charAt(ingevuld_woord.length()	- 1);
	    	
		int count = 1;
		
		while (count < 50) {
			
			Scanner sc2 = new Scanner(System.in);
		    String ingevuld_woord2 = sc2.nextLine();
		    
		    char eerste_letter = ingevuld_woord2.charAt(0);
			
		    while (laatste_letter != eerste_letter) {
		    	System.out.println("Vul ander woord in:"); 
		    	sc2 = new Scanner(System.in);
		    	ingevuld_woord2 = sc2.nextLine();
		    	eerste_letter = ingevuld_woord2.charAt(0);
		    }
		    woorden.add(ingevuld_woord2);
		    laatste_letter = ingevuld_woord2.charAt(ingevuld_woord2.length() - 1);
		    count += 1;
		    
		    for (int i = 0; i < woorden.size(); i++) {
	            System.out.println(woorden.get(i));
	        }
		}
	}
}
