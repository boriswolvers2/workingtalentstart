package kermis;

public class RisicoRijkeAttracties{
	
	public static void opstellingsKeuring(Attractie spin_of_hawai) {       
		
		if (spin_of_hawai instanceof Spin) {
			if (spin_of_hawai.aantal_keer_gedraaid > 5) {
				throw new ArithmeticException();
			}
		}
		if (spin_of_hawai instanceof Hawai) {
			if (spin_of_hawai.aantal_keer_gedraaid > 10) {
				throw new ArithmeticException();
			}
		}
	}
}
