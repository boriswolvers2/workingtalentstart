package mini_opdrachten_java_week;

public class Spreeuw implements Vliegend {
	
	public Vliegend maak_object() {
		return new Spreeuw();
	}
	
	public void wat_vliegt() {
		System.out.println("Spreeuw vliegt");
	}
}
