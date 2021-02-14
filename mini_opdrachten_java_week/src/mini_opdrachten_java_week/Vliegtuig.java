package mini_opdrachten_java_week;

public class Vliegtuig implements Vliegend {
	
	public Vliegend maak_object() {
		return new Vliegtuig();
	}
	
	public void wat_vliegt() {
		System.out.println("Vliegtuig vliegt");
	}
}
