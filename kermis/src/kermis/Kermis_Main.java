package kermis;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Kermis_Main {
	private static List<Attractie> alle_attracties = new ArrayList<Attractie>();
	
	public final static void main(String args[]) {
		Kassa de_kassa = new Kassa();
		
		Attractie bots = new Botsautos();
		Attractie spin = new Spin();
		Attractie spiegel = new Spiegelpaleis();
		Attractie spook = new Spookhuis();
		Attractie hawai = new Hawai();
		Attractie ladder = new Ladderklimmen();
	
		alle_attracties.add(bots);
		alle_attracties.add(spin);
		alle_attracties.add(spiegel);
		alle_attracties.add(spook);
		alle_attracties.add(hawai);
		alle_attracties.add(ladder);
		
		
		int count = 0;
		int ingevuld_cijfer;
		// Ik laat de bediener niet meer dan 100x een attractie kiezen
		while (count < 100) {
			String ingevuld = de_console();
			
			try {
				ingevuld_cijfer = Integer.parseInt(ingevuld);
				
				if (ingevuld_cijfer > 0 && ingevuld_cijfer < 7) {
					attractie_kiezen(ingevuld_cijfer);
					check_omzet(ingevuld_cijfer);
				}
			}
			catch(NumberFormatException e)
			{
				if (ingevuld.charAt(0) == 'o') {
					de_kassa.totale_omzet(alle_attracties);
				}
				if (ingevuld.charAt(0) == 'k') {
					de_kassa.totale_kaartjes(alle_attracties);
				}
				if (ingevuld.charAt(0) == 'b') {
					btw_halen();
					de_kassa.inspecteur_geweest();
					de_kassa.hoevaak_is_inspecteur_geweest();
				}
				if (ingevuld.charAt(0) == 'm') {
					reset_spin_of_hawai();
				}
			}
			
			count += 1;
		}
	}
	
	public static String de_console() {          
		Scanner sc = new Scanner(System.in); 
		
	    System.out.println("\nVul cijfer in tussen 1 en de 6 om \n"
	    		+ "een attractie te betreden, de attracties zijn: \n"
	    		+ "1. Botsautos\n"
	    		+ "2. Spin\n"
	    		+ "3. Spiegelpaleis\n"
	    		+ "4. Spookhuis\n"
	    		+ "5. Hawaii\n"
	    		+ "6. Ladderklimmen \n"
	    		+ "Typ een o in om de totale omzet te zien van de kermis\n"
	    		+ "Typ een k in om het totaal aantal verkochte kaartjes te zien.\n"
	    		+ "Typ een b in om de belastinginspecteur te laten komen.\n"
	    		+ "Typ een m in om een monteur te laten komen voor Spin en Hawai.");
	    
	    String ingevuld = sc.nextLine();
	    System.out.println("Ingevuld cijfer of letter is: " + ingevuld + "\n"); 
	    return ingevuld;
	}
	
	public static void attractie_kiezen(int ingevuld_cijfer) {
		Attractie gekozen_attractie = alle_attracties.get(ingevuld_cijfer - 1);
		
		try {
			gekozen_attractie.meer_draaien();
			
			RisicoRijkeAttracties.opstellingsKeuring(gekozen_attractie);
			
			gekozen_attractie.draaien();
			gekozen_attractie.meer_geld();
			gekozen_attractie.meer_kaart();
		}
		catch(Exception e)
		{
			if (gekozen_attractie instanceof Spin) {
				System.out.println(gekozen_attractie.naam + " heeft meer dan "
						+ "5x keer gedraaid. \nTyp een m in voor een monteur!!!");
			}
			if (gekozen_attractie instanceof Hawai) {
				System.out.println(gekozen_attractie.naam + " heeft meer dan "
						+ "10x keer gedraaid. \nTyp een m in voor een monteur!!!");
			}
			
		}	
	}
	
	public static void check_omzet(int ingevuld_cijfer) {
		Attractie gekozen_attractie = alle_attracties.get(ingevuld_cijfer - 1);
		
		Float check_geld = gekozen_attractie.omzet;
		int x_kaartjes = gekozen_attractie.kaartjes;
		System.out.println("Omzet van gekozen attractie is : " + check_geld); 
		System.out.println("Verkochte kaartjes van gekozen attractie is : " + x_kaartjes); 
		
	}
	
	public static void reset_spin_of_hawai() {
		for (int i = 0; i < alle_attracties.size(); i++) {
			if (alle_attracties.get(i) instanceof Spin) {
				if (alle_attracties.get(i).aantal_keer_gedraaid > 5) {
					alle_attracties.get(i).aantal_keer_gedraaid = 0;
				}
			}
			if (alle_attracties.get(i) instanceof Hawai) {
				if (alle_attracties.get(i).aantal_keer_gedraaid > 10) {
					alle_attracties.get(i).aantal_keer_gedraaid = 0;
				}
			}
		}
	}
	
	public static void btw_halen() {
		for (int i = 0; i < alle_attracties.size(); i++) {
			BelastingInspecteur.belasting_of_niet(alle_attracties.get(i));
		}
	}
}
