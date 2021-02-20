package kermis;

abstract class Attractie {
	String naam; 
	float prijs; 
	float omzet; 
	int kaartjes; 
	boolean draait;
	int aantal_keer_gedraaid;

	abstract void draaien();
	abstract void meer_geld(); 
	abstract void meer_kaart();
	abstract void meer_draaien();
}



