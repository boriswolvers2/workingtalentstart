package mini_opdrachten_java_week;

public class opdracht2 {
	
	public final static void main(String args[]) {
		
		String woord1 = "kameleon";
		String woord2 = "EurochequE";
		
		int aantal_e1 = hoeveel_e(woord1);
		int aantal_e2 = hoeveel_e(woord2);
		
	    System.out.println(aantal_e1);
	    System.out.println(aantal_e2);   
	}
	
	public static int hoeveel_e(String woord) {
		
		int aantal_e = 0;
		
		for (int i = 0; i < woord.length(); i++) {
			if (woord.toLowerCase().charAt(i) == 'e') {
				aantal_e += 1;
			}
		}
		return aantal_e;
	}
}