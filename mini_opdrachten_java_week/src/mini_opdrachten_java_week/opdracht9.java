package mini_opdrachten_java_week;

public class opdracht9 {
	public final static void main(String args[]) {
		
		// Maak vliegtuig en spreeuw objecten
		Vliegtuig een_vliegtuig = new Vliegtuig();
		Spreeuw een_spreeuw = new Spreeuw();
		
		// Returned interface
		Vliegend een_vliegtuig_interface = een_vliegtuig.maak_object();
		Vliegend een_spreeuw_interface = een_spreeuw.maak_object();
		
		// Interface als parameter
		wat_vliegt_er_daarginds(een_vliegtuig_interface);
		wat_vliegt_er_daarginds(een_spreeuw_interface);
		
	}
	
	public static void wat_vliegt_er_daarginds(Vliegend iets) {
		iets.wat_vliegt();
	}
}
