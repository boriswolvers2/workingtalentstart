package kermis;

public class BelastingInspecteur {
	
	public static void belasting_of_niet(Attractie btw_of_niet) {       
		
		if (btw_of_niet instanceof GokAttractie) {
			((GokAttractie) btw_of_niet).kansSpelBelastingBetalen();
		}
	}
}
