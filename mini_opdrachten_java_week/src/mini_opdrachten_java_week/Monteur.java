package mini_opdrachten_java_week;

import java.util.Arrays;

public class Monteur {
	
	public final static void main(String args[]) {
		
	    Auto auto_check = new Auto();
	    boolean[] onderdelen = auto_check.auto_onderdelen;
	    
	    System.out.println("De booleans van onderdelen voor reparatie: " + Arrays.toString(onderdelen));
	    
	    int prijs = 0;
	    for (int i = 0; i < onderdelen.length; i++) {
	    	if (!onderdelen[i]) {
	    		onderdelen[i] = true;
	    		prijs += 25;
	    	}
	    }
	    
	    System.out.println("Totale kosten: " + prijs + " euro.");
	    System.out.println("De booleans van onderdelen na reparatie: " + Arrays.toString(onderdelen));
	}
}
