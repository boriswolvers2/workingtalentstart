package kermis;

public class Hawai extends Attractie {
	public Hawai() {
		naam = "Hawai";
		prijs = 2.9f;
		omzet = 0.0f;
		kaartjes = 0;
		draait = true;
		aantal_keer_gedraaid = 0;
	}
	public void draaien() {          
	    System.out.println("De attractie Hawai draait!");
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
}
