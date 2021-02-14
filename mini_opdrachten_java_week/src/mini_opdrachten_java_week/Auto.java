package mini_opdrachten_java_week;

public class Auto {
	boolean motor;  // Create a class attribute
	boolean deur;
	boolean voorruit; 
	boolean uitlaat; 
	boolean[] auto_onderdelen;
	
	public Auto() {
		motor = true;
		deur = true;
		voorruit = false;
		uitlaat = false;
		auto_onderdelen = new boolean[]{motor, deur, voorruit, uitlaat};
	}
}
