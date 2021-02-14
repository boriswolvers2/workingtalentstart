package mini_opdrachten_java_week;

import java.util.Scanner;  
import java.util.Arrays;

public class opdracht7 {
	
	public final static void main(String args[]) {
		
		String vast_woord = "fiets";
		StringBuilder streepjes = new StringBuilder();
		
		for (int i = 0; i <vast_woord.length(); i++) {
			streepjes.append("-");
		}
		
		System.out.println(streepjes);
		
		Scanner sc = new Scanner(System.in); 
		
	    System.out.println("Vul woord in:");

	    String ingevuld_woord = sc.nextLine();  
	    
	    while (vast_woord != ingevuld_woord) {
	    	StringBuilder uitslag_code = new StringBuilder();
	    	
		    for (int i = 0; i < ingevuld_woord.length(); i++) {
		    	
		    	int count = 0;
		    	for (int j = 0; j < vast_woord.length(); j++) {
		    		if (vast_woord.charAt(j) == ingevuld_woord.charAt(i)) {
		    			if (i == j) {
		    				uitslag_code.append("2");
		    			}
		    			else {
		    				uitslag_code.append("1");
		    			}
		    			count += 1;
		    		}
		    	}
		    	if (count == 0) {
		    		uitslag_code.append("0");
		    	}
		    }
		    
		    System.out.println(uitslag_code);
		    
		    if ("22222".equals(uitslag_code.toString())) {
		    	ingevuld_woord = vast_woord;
		    	System.out.println("Lingo!");
		    }
		    else {
		    	Scanner sc1 = new Scanner(System.in); 
				
			    System.out.println("Vul woord in:");

			    ingevuld_woord = sc1.nextLine();
		    }
	    }
	}
}
