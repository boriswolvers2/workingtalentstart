package kermis;

public class Spin extends Attractie implements GokAttractie {
	public Spin() {
		naam = "Spin";
		prijs = 2.25f;
		omzet = 0.0f;
		kaartjes= 0;
		draait = true;
		aantal_keer_gedraaid = 0;
	}
	
	public void draaien() {          
	    System.out.println("De attractie Spin draait!");
	}	
	
	public void meer_geld() {
		omzet = omzet + prijs;
	}
	
	public void meer_kaart() {
		kaartjes += 1;
	}
	
	public void meer_draaien() {
		aantal_keer_gedraaid += 1;
	}
	
	public void kansSpelBelastingBetalen() {
		omzet = omzet - omzet*0.3f;
	}
}
