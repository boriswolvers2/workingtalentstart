package kermis;

public class Spookhuis extends Attractie {
	public Spookhuis() {
		naam = "Spookhuis";
		prijs = 3.2f;
		omzet = 0.0f;
		kaartjes = 0;
		draait = true;
		aantal_keer_gedraaid = 0;
	}
	
	public void draaien() {          
	    System.out.println("De attractie Spookhuis draait!");
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
