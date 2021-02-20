package kermis;

import java.util.List;

public class Kassa {
	int aantal_keer_belasting = 0;
	
	public void starten() {          
	    System.out.println("Kassa gestart!");
	}
	
	public void inspecteur_geweest() {        
		aantal_keer_belasting += 1;
	}
	
	
	public void hoevaak_is_inspecteur_geweest() {          
		System.out.println("De inspecteur is " + aantal_keer_belasting + " geweest.");
	}
	
	public void totale_omzet(List<Attractie> alle_attracties) {
		float tot_omzet = 0.0f;
		
		for(int i = 0; i < alle_attracties.size(); i++) {
			tot_omzet += alle_attracties.get(i).omzet;
		}
		System.out.println("De totale omzet van de kermis is : " + tot_omzet);
	}
	
	public void totale_kaartjes(List<Attractie> alle_attracties) {
		int tot_kaartjes = 0;
		
		for(int i = 0; i < alle_attracties.size(); i++) {
			tot_kaartjes += alle_attracties.get(i).kaartjes;
		}
		System.out.println("Totaal verkochte kaartjes zijn : " + tot_kaartjes);
	}
}
